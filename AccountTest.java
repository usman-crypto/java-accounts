class AccountTest
{
	public static void main(String args[])
	{
		Account ac1=new Account();
		Account ac2=new Account();

		ac1.credit(5000);
		ac2.credit(15000);

		System.out.println(ac1.getBalance());
		System.out.println(ac2.getBalance());
	}
}
