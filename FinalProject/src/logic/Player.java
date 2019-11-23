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
	
	
	public Player(String name, int balance) {
		this.name = name;
		this.balance = balance;
		this.currentPropertyLocation = 0;
		this.isInJail = false;
		this.haveJailPass = false;
		this.ownedProperties = new ArrayList<Property>();
	}
	
	public void setCurrentPropertyLocation(int currentPropertyLocation) {
		this.currentPropertyLocation = currentPropertyLocation;
		
		
	}
	
	public void buyProperty(Property p) {
		this.ownedProperties.add(p);
		this.balance=this.balance-p.getCost();
		
	}
	
	public void payFine(int fine) {
		this.balance=this.balance-fine;
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
	
	

	
	
	
	

}
