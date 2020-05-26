	package sop_test;

  public class BankService {
	private String accountName;
	private double balance;
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		System.out.println("set account name");
		this.accountName = accountName;
		
	}
	public double getBalance() {
		return balance;
		
	}
	public void setBalance(double balance) {
		System.out.println("New balance:");
		this.balance = balance;
		
	}
	
	public void withdraw()
	{
		balance = balance - 1;
		System.out.println("New balance:" + balance);
	}
 
}