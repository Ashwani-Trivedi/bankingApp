package bankingApp;

public interface IRate {
     //write a method which returns baseRate
	default double getBaseRate(){
		return 2.5;
	}
}
