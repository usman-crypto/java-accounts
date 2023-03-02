public class Account
{
	private double balance;
	
	public void credit(double amount)
	{
		balance+=amount;
	}
	public double getBalance()
	{
		return balance;
	}
}
