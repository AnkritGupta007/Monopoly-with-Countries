package logic;

import java.util.ArrayList;
import java.util.List;

import javafx.stage.Stage;

/**
 * The main class for handling behind-the-scenes game logic. It contains the
 * list of players along with a reference to the board
 * 
 * @author arawa1rj
 *
 */
public class GameManager {
	static Board board = Board.getInstance();
	public final static int GO_PAY_AMOUNT = 200;
	private static final int INITIAL_PLAYER_BALANCE = 1500;
	public static List<Player> uList = new ArrayList<Player>();
	static GameManager gm = new GameManager();
	static Player currentPlayer;
	static BoardPiece currentBoardSquare;
	static boolean isBuyable;
	
	
	public static Board getBoard() {
		return board;
	}

	/**
	 * Populate the players into the player list
	 * 
	 * @param players - List of player names
	 */
	public static void populatePlayers(List<String> players) {
		int n  = 1;
		for (String playersname : players) {
			uList.add(new Player(playersname, INITIAL_PLAYER_BALANCE, n ));
			n++;
		}
		currentPlayer = uList.get(0);
	}

	int numDoubles = 0;

	/**
	 * Execute a turn on a certain player
	 * 
	 * @param p - The player whose turn it is
	 * @return True if doubles are rolled, false if not
	 */
	public boolean executeTurn(Player p) {
		int[] dice = board.rollDice();
		if (!p.isInJail()) {
			int distance = dice[0] + dice[1];
			boolean passedGo = board.movePlayer(p, distance);
			if (passedGo) {
				p.setBalance(p.getBalance() + GO_PAY_AMOUNT);
			}
			GameManager.setCurrentBoardSquare(Board.getInstance().getPieceByLocation(p.getCurrentPropertyLocation()));
			if (currentBoardSquare instanceof Property) {
				Property prop = (Property) currentBoardSquare;
				if (!prop.isOwned()) {
					if (prop.getCost() <= p.getBalance()) {
						isBuyable = true;
					} else {
						isBuyable = false;
					}
				} else {
					// Pay rent
					if (!prop.getOwner().getName().equals(p.getName())) {
						if (p.getBalance() - prop.getRent() > 0) {
							p.setBalance(p.getBalance() - prop.getRent());
							prop.getOwner().setBalance(prop.getOwner().getBalance() + prop.getRent());
						} else {
							Player next = getNextPlayer();
							System.out.println("Next player is " + next.getName());
							uList.remove(p);
							System.out.println(
									"Removed " + p.getName() + " from game due to insufficient funds for rent");
							setNextPlayer(next);
							System.out.println("The current player is " + currentPlayer.getName());
						}
					}
					isBuyable = false;
				}
			}
			if (dice[0] == dice[1]) {
				numDoubles++;
				if (numDoubles == 3) {
					p.setInJail(true);
					this.numDoubles = 0;
					return false;
				} else {
					return true;
				}

			}
		} else {
			if (dice[0] == dice[1]) {
				p.setInJail(false);
			}
		}
		return false;
	}

	/**
	 * End the turn for the player
	 */
	public void endTurn() {
		this.numDoubles = 0;
		setNextPlayer(getNextPlayer());
	}

	/**
	 * Get the next player in the list
	 * 
	 * @return Next player object in list
	 */
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

	/**
	 * Advance the current player by one
	 * 
	 * @param p
	 */
	public void setNextPlayer(Player p) {
		currentPlayer = p;
	}

	/**
	 * Helper function to get the number of active players in the game
	 * 
	 * @return Integer number of players
	 */
	public static int getNumPlayers() {
		return uList.size();
	}

	public static GameManager getInstance() {
		return gm;
	}

	public static Player getCurrentPlayer() {
		return currentPlayer;
	}

	public static void setCurrentPlayer(Player currentPlayer) {
		GameManager.currentPlayer = currentPlayer;
	}

	public static BoardPiece getCurrentBoardSquare() {
		return currentBoardSquare;
	}

	public static void setCurrentBoardSquare(BoardPiece currentBoardSquare) {
		GameManager.currentBoardSquare = currentBoardSquare;
	}

	public static boolean isBuyable() {
		return isBuyable;
	}

	public static void setBuyable(boolean value) {
		isBuyable = value;
	}

}
