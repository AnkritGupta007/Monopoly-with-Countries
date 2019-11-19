/**
 * This class is used to represent the abstraction of a section
 * of the game board.
 * 
 * @author arawa1rj
 *
 */
public abstract class BoardPiece {
	
	String name;
	
	/**
	 * Function run when a player lands on the space
	 * @param p - The player who landed on the space
	 */
	public abstract void playerLanded(Player p);
}
