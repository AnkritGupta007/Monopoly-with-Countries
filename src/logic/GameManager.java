package logic;

import java.util.ArrayList;
import java.util.List;

import game.DefaultScene;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class GameManager extends Application {
	static Board board = Board.getInstance();
	public final static int GO_PAY_AMOUNT = 200;
	public static List<Player> uList = new ArrayList<Player>();
	static GameManager gm = new GameManager();
	public static Player currentPlayer;

	private static Stage primaryStage;

	public static void main(String[] args) {
		Player p1 = new Player("RJ", 500);
		p1.addProperty((Property)board.pList.get(7));
		Player p2 = new Player("Ankrit", 500);
		uList.add(p1);
		uList.add(p2);
		
		currentPlayer = uList.get(0);

		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		this.primaryStage = primaryStage;
		primaryStage.setScene(DefaultScene.getScene());
		primaryStage.show();
	}

	/**
	 * Used to change to a different scene anywhere in the application.
	 * 
	 * @param scene The scene to change to.
	 */
	public static void changeScene(Scene scene) {
		GameManager.primaryStage.setScene(scene);
	}

	public int numDoubles = 0;

	public void executeTurn(Player p) {
		int[] dice = board.rollDice();
		if (!p.isInJail()) {
			int distance = dice[0] + dice[1];
			boolean passedGo = board.movePlayer(p, distance);
			if (passedGo) {
				p.setBalance(p.getBalance() + GO_PAY_AMOUNT);
			}
			if (dice[0] == dice[1]) {
				numDoubles++;
				if (numDoubles == 3) {
					p.setInJail(true);
					this.numDoubles = 0;
				} else {
					executeTurn(p);
				}

			}

		} else {
			if (dice[0] == dice[1]) {
				p.setInJail(false);
			}
		}
		this.numDoubles = 0;
		setNextPlayer(getNextPlayer());
	}

	public Player getNextPlayer() {
		int index = uList.indexOf(currentPlayer);
		if (index + 1 < uList.size()) {
			index++;
		} else {
			index = 0;
		}
		Player nextPlayer = uList.get(index);
		return nextPlayer;
	}
	
	public void setNextPlayer(Player p) {
		currentPlayer = p;
	}

	public static GameManager getInstance() {
		return gm;
	}

}
