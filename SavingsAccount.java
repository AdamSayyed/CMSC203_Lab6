














public class SavingsAccount extends BankAccount {

	public double  rate=  .025;
	
	
	public int savingsNumber =0;
	public String accountNumber;
	
	
	
	
	
	public SavingsAccount(String name,double balance){
		
		super(name, balance);

		accountNumber = super.getAccountNumber() +"-"+savingsNumber;
	}
	
public SavingsAccount(SavingsAccount account,double intialbalance) {
	//savingsNumber = account.savingsNumber++;
	
	super(account,intialbalance);
	savingsNumber++;
	//accountNumber =  super.getAccountNumber() +"-"+savingsNumber;
	this.accountNumber =  super.getAccountNumber() +"-"+savingsNumber;
}


public void postInterest() {
	double month = rate/12;
	
	//double amount = (super.getBalance() * month)  +  super.getBalance();
	super.setBalance(super.getBalance() *( month  +  1));
	//super.deposit(amount);
	
}
public String getAccountNumber() {
	
	return accountNumber;
	
}








}
