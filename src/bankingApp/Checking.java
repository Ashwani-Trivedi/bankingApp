package bankingApp;

public class Checking extends Accounts {
	//List properties for Checking account
	private int debitCardNum;
	private int debitPin;
	
	//constructor to initialise checking account
	public Checking(String name, String sSN, double initDeposit){
	  super(name,sSN,initDeposit);
	  accountNumber = "2" + accountNumber;
	  setDebitCard();
	}
	
	@Override
	public void setRate(){
		rate = getBaseRate() * .15;
	}
	
	//set debitCard number and pin
	private void setDebitCard(){
		debitCardNum = (int) (Math.random() * Math.pow(10, 12));
		debitPin = (int) (Math.random() * Math.pow(10, 4));
	}
	
	
	//method specific to checking account
	public void showInfo(){
		super.showInfo();
		System.out.println("Your Checking Account features" + "\nDebit Card Number :" + debitCardNum +
				            "\nDebit Card Pin :" + debitPin +
				            "\nRate :" + rate);
	}
}
