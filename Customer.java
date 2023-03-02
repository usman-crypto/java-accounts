class Customer
{
	double cash;
	void Setcash(double RS)
	{
		cash=RS;
	}
	double Getcash()
	{
		return cash;
	}
	void Display()
	{
		if(cash>50000)
		System.out.println("Debit amount exceeded account balance.");
		else
		System.out.println("withdraw succeded");
}
