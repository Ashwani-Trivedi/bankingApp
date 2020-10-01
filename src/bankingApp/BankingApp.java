package bankingApp;

public class BankingApp {

	public static void main(String[] args) {
		
		Checking chkacc1 = new Checking("Ashwani Trivedi","123456789",500);
		chkacc1.showInfo();
        
		Savings savacc1 = new Savings("Nishu","987654312",700);
		savacc1.showInfo();
		savacc1.deposit(500);
		savacc1.withdraw(300);
		savacc1.transfer("Ramesh", 658);
	}

}
