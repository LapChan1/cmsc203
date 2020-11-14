
public class SavingsAccount extends BankAccount{
	private double rate=.025;//2.5% annual interest
	private int savingsNumber=0;
	private String accountNumber;
	
	public SavingsAccount(String n, double amt) {
		super(n,amt);
		accountNumber=super.getAccountNumber()+"-"+this.savingsNumber;
	}
	public void postInterest() {
		this.setBalance(this.getBalance()+this.getBalance()*rate/12);// add 1month of interest to account
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public SavingsAccount(SavingsAccount s,double balance) {
		super(s,balance);
		s.savingsNumber++;
		accountNumber=super.getAccountNumber()+"-"+s.savingsNumber;
	}
}
