package bankingApp;

public class Savings extends Accounts{
	//List properties for Savings account
	private int safetyDepositNum;
	private int safetyDepositCode;
	
	//constructor to initialise Savings account
	public Savings(String name, String sSN, double initDeposit){
		super(name,sSN,initDeposit);
		accountNumber = "1" + accountNumber;
		safetyDepositBox();
	}
	
	//set rate
	@Override
	public void setRate(){
		rate = getBaseRate() * .25;
	}
	
	
	//set safetyDepositBox
	private void safetyDepositBox(){
          safetyDepositNum = (int) (Math.random() * Math.pow(10, 3));
          safetyDepositCode = (int) (Math.random() * Math.pow(10, 4));
	}
	
	//method specific to Savings account 
	public void showInfo(){
		super.showInfo();
		System.out.println("Your Savings Account Features" + "\nSafety Deposit Box ID :" +
		                    safetyDepositNum + "\nSafety Deposit Box Key :" + safetyDepositCode +
		                    "\nRate :" + rate);
	}
	
}
