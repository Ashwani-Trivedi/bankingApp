package bankingApp;

public abstract class Accounts implements IRate {
	//List common properties for Savings & Checking account
	private String name;
	private String sSN;
	private double balance;
	private static int uniqueId = 10000;
	
	protected String accountNumber;
	protected double rate;
	
	
	
    //constructor to initialise and set properties
	public Accounts(String name, String sSN, double initDeposit){
		this.name = name;
		this.sSN = sSN;
		balance = initDeposit;
		
		
		uniqueId ++;
		//set account number
		this.accountNumber = setAccNum();
		setRate();
	}
	
	public  abstract void setRate();
	
	private String setAccNum(){
		String lastTwoSsn = sSN.substring(sSN.length()-2, sSN.length());
		int random = (int) (Math.random()*Math.pow(10, 3));
		return  lastTwoSsn + uniqueId + random;
		
		
	}
    //common method for Savings and Checking account
	public void deposit(double amount){
		balance = balance + amount;
		System.out.print("Deposit Rs." + amount + "\nCurrent Balance :");
		printBalance();
	}
	
	public void withdraw(double amount){
		balance = balance - amount;
		System.out.print("Withdraw Rs." + amount + "\nCurrent Balance :");
		printBalance();
	}
	
	public void transfer(String toWhere, double amount){
		balance = balance - amount;
		System.out.print("Transfering Rs." + amount + " to " +toWhere + "\nCurrent Balance :");
		printBalance();
	}
	
	public void printBalance(){
		System.out.println(balance);
	}
	
	public void showInfo(){
		System.out.println( "Name :" + name + "\nAccount Nunmber :" + accountNumber + "\nBalance :Rs." + balance
				);
	}
	
	
}
