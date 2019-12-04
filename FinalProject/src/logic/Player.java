package logic;

import java.util.ArrayList;
import java.util.List;

public class Player {

	private String name;
	private int balance;
	private int currentPropertyLocation;
	private boolean isInJail;
	private boolean haveJailPass;
	List<Property> ownedProperties;
	private int playerNumber;

	public Player(String name, int balance, int playerNumber) {
		this.name = name;
		this.balance = balance;
		this.currentPropertyLocation = 0;
		this.isInJail = false;
		this.haveJailPass = false;
		this.ownedProperties = new ArrayList<Property>();
		this.playerNumber = playerNumber;
	}
	
	public int getPlayerNumber() {
		return playerNumber;
	}

	/**
	 * Buy a property
	 * 
	 * @param p - Property to be purchased
	 */
	public void buyProperty(Property p) {
		this.ownedProperties.add(p);
		this.balance = this.balance - p.getCost();
		p.setOwned(true);
		p.setOwner(this);
		System.out.println(this.name + " bought " + p.getName() + " for " + p.getCost());
		System.out.println(this.name + " has " + this.balance + " left.");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getCurrentPropertyLocation() {
		return currentPropertyLocation;
	}

	public boolean isInJail() {
		return isInJail;
	}

	public void setInJail(boolean isInJail) {
		this.isInJail = isInJail;
	}

	public boolean hasJailPass() {
		return haveJailPass;
	}

	public void setHaveJailPass(boolean haveJailPass) {
		this.haveJailPass = haveJailPass;
	}

	public List<Property> getOwnedProperties() {
		return ownedProperties;
	}

	public void setOwnedProperties(List<Property> ownedProperties) {
		this.ownedProperties = ownedProperties;
	}

	/**
	 * Add a property to list of owned properties
	 * 
	 * @param p - Property to add
	 */
	public void addProperty(Property p) {
		this.ownedProperties.add(p);
	}

	/**
	 * remove property from list of owned ones
	 * 
	 * @param p - Property to remove
	 */
	public void removeProperty(Property p) {
		this.ownedProperties.remove(p);
		p.setOwner(null);
	}

	public void setCurrentPropertyLocation(int currentPropertyLocation) {
		this.currentPropertyLocation = currentPropertyLocation;
	}

}
