package logic;
/**
 * This class represents a standard property in the monopoly game (eg Boardwalk, St James' Place, etc.)
 * @author arawa1rj
 *
 */
public class Property extends BoardPiece {

	int rent;
	int cost;
	Player owner;
	boolean isOwned = false;
	
	public Property(String name, int cost, int rent) {
		this.name = name;
		this.rent = rent;
		this.cost = cost;
	}
	
	/**
	 * Private function to calculate rent so that hotels etc. could be added later
	 * @return rent amount
	 */
	private int calculateRent() {
		return this.rent;
	}
	
	public int getSellingPrice() {
		return this.cost;
	}
	
	public String getName() {
		return this.name;
	}

	public int getRent() {
		return this.calculateRent();
	}

	public void setRent(int rent) {
		this.rent = rent;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public Player getOwner() {
		return owner;
	}

	public void setOwner(Player owner) {
		this.owner = owner;
	}

	public boolean isOwned() {
		return isOwned;
	}

	public void setOwned(boolean isOwned) {
		this.isOwned = isOwned;
	}

	public String toString() {
		return this.name + ": " + this.cost + "," + this.rent;
	}
}
