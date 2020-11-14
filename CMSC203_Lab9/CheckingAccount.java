
public class CheckingAccount extends BankAccount{
 private static final double FEE=0.15;//fee for changing balance
 public CheckingAccount(String name, double amt) {
	 super(name,amt);
	 this.setAccountNumber(this.getAccountNumber()+"-10");
 }
 public boolean withdraw(double amt) {
	 if(super.withdraw(amt)==true)
		 {this.setBalance(this.getBalance()+(amt-FEE));
		 }
	 return super.withdraw(amt);
 }
}
