package ATMINTERFACE;

import java.util.Scanner;

public class BankTransction extends AccountHolder
{
	double balance=5000,amount,deposit,previousTransaction;
	Scanner sc = new Scanner(System.in);
	void Withdraw()
	{
		System.out.print("Enter money to be withdrawn:");
        amount = sc.nextInt();
        if(balance >= amount)
        {
            balance = balance - amount;
            System.out.println("Rs."+amount+" withdraw succesfully , Please collect your money. ");  
        }
        else
        {
        	System.out.println("Your balance is less than " + balance + "\tTransaction failed...!!" ); 
        }
	}
	
	void Deposite()
	{
		System.out.print("Enter money to be deposited:");
        deposit = sc.nextInt();
        balance = balance + deposit;
        System.out.println("Rs."+deposit+ " successfully deposited. ");
	}
	
	void checkbalance()
	{
		 System.out.println("Your Account Balance : "+balance);
	}
	
	void exit()
	{
        System.out.println("Thank You For Visting Us!! See You Soon...");
		 System.exit(0);
	}
}
