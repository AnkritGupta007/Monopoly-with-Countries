package logic;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;

public class Board {
	List<BoardPiece> pList = new ArrayList<>();

	private static Board board = new Board();

	private Board() {
		try {
			this.popluateBoard();
		} catch (FileNotFoundException e) {
			Alert alert = new Alert(AlertType.ERROR, "Error loading properties file", ButtonType.OK);
			alert.showAndWait();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	
	public static int[] getAddFromIndex(int n) {
		
		int[] arr = new int[2];
		switch(n) {
		case 0: arr[0] = 4; arr[1] = 4; break;
		case 1: arr[0] = 3; arr[1] = 4; break;
		case 2: arr[0] = 2; arr[1] = 4; break;
		case 3: arr[0] = 1; arr[1] = 4; break;
		case 4: arr[0] = 0; arr[1] = 4; break;
		case 5: arr[0] = 0; arr[1] = 3; break;
		case 6: arr[0] = 0; arr[1] = 2; break;
		case 7: arr[0] = 0; arr[1] = 1; break;
		case 8: arr[0] = 0; arr[1] = 0; break;
		case 9: arr[0] = 1; arr[1] = 0; break;
		case 10: arr[0] = 2; arr[1] = 0; break;
		case 11: arr[0] = 3; arr[1] = 0; break;
		case 12: arr[0] = 4; arr[1] = 0; break;
		case 13: arr[0] = 4; arr[1] = 1; break;
		case 14: arr[0] = 4; arr[1] = 2; break;
		case 15: arr[0] = 4; arr[1] = 3; break;
		
		
		}
		return arr;
	}
	
	
	
	/**
	 * Simulate a dice roll in the game
	 * 
	 * @return Int array with two numbers representing dice values
	 */
	public int[] rollDice() {
		Random r = new Random();
		int d1 = r.nextInt(6) + 1;
		int d2 = r.nextInt(6) + 1;
		int[] ret = { d1, d2 };
		return ret;
	}

	/**
	 * Populates the board list with properties and non-property board pieces
	 * 
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public void popluateBoard() throws FileNotFoundException, IOException {
		Scanner sc = new Scanner(new File("properties.txt"));
		while (sc.hasNextLine()) {
			String[] line = sc.nextLine().split(",");
			if (line[0].equals("0")) {
				Property p = new Property(line[1], Integer.parseInt(line[2]), Integer.parseInt(line[3]));
				pList.add(p);
			} else if (line[0].equals("1")) {
				ConcreteBoardPiece piece = new ConcreteBoardPiece(line[1]);
				pList.add(piece);
			}
		}
	}

	/**
	 * Move the player on the board
	 * @param p - Player to move
	 * @param distance - Distance to move player (in board squares)
	 * @return True if passed go, false otherwise
	 */
	public boolean movePlayer(Player p, int distance) {
		int currentLocation = p.getCurrentPropertyLocation();
		boolean passedGo = false;
		int numPieces = pList.size();
		if ((currentLocation + distance) > pList.size() - 1) {
			passedGo = true;
			System.out.println(p.getName() + " PASSED GO");
		}
		p.setCurrentPropertyLocation((currentLocation + distance) % numPieces);
		return passedGo;
	}

	/**
	 * Get a board piece from a board location
	 * @param location - Location on board
	 * @return - BoardPiece in the location specified
	 */
	public BoardPiece getPieceByLocation(int location) {
		if (location < pList.size()) {
			return pList.get(location);
		} else {
			// Worry about later, possibly throw exception
		}
		return null;
	}

	public static Board getInstance() {
		return board;
	}

}
