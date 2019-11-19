import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Board {
	List<Propertiy> pList = new ArrayList<>();
	List<Player> uList = new ArrayList<Player>();
	Player p = new Player();
	private int numberOfPlayers = 0;
	

	public void rollDice() {
		Random r = new Random();
		int d1 = r.nextInt(6) + 1;
		int d2 = r.nextInt(6) + 1;
		p.movePlayer(d1+d2);
		//Player action();
		if (d1 == d2 && d1 == 6) {
			rollDice();
		}

	}

	public void popluateProperties() throws FileNotFoundException, IOException {
		ObjectInputStream readProperties = new ObjectInputStream(new FileInputStream("properties.txt"));
	}

	public void printBoard() {

	}

}
