














public class CheckingAccount extends BankAccount {

static double   fee = 0.15;

 
public CheckingAccount(String name, double amount) {
	
	super(name, amount);
	//String account = super.getAccountNumber() + "-10";
    super.setAccountNumber(getAccountNumber() + "-10");
  
}





public boolean withdraw(double amount) {
	
	return  super.withdraw(amount+fee);
	
}



}
