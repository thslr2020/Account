import java.util.Scanner;

public class Account {
	   
	double balance;

	public Account (double balance)
	{
		this.balance = balance;
	}
	
	public void credit (double credit)
	{
		balance += credit;
	}
	
	public void debit (double debit)
	{
		if(debit>balance)
		{
		System.out.printf("Debit amount exceeded account balance");
		}
		else balance -= debit;
	}
	
	public double getbalance()
	{
		return balance;
	}
	   
	public void balance(String deposit)
	{
	    System.out.printf( "%s balance : %.2f\n", deposit, getbalance());
	}
}