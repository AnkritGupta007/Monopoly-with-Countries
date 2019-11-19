
public class Player {
	
	private String name;
	private int balance;
	private int currentPropertyLocation;
	private boolean isInJail;
	private boolean haveJailPasss;
	
	
	public Player(String name, int balance, int currentPropertyLocation, boolean isInJail, boolean haveJailPasss) {
		this.name = name;
		this.balance = balance;
		this.currentPropertyLocation = currentPropertyLocation;
		this.isInJail = isInJail;
		this.haveJailPasss = haveJailPasss;
	}
	
	public void setCurrentPropertyLocation(int currentPropertyLocation) {
		this.currentPropertyLocation = currentPropertyLocation;
	}
	
	// I think this should be int th
	public void buyProperty(int propertLocation) {
		if()
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

	public boolean isHaveJailPasss() {
		return haveJailPasss;
	}

	public void setHaveJailPasss(boolean haveJailPasss) {
		this.haveJailPasss = haveJailPasss;
	}
	
	

	
	
	
	

}
