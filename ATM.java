package ATMINTERFACE;

import java.util.Scanner;

public class ATM extends BankTransction
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Bank b=new Bank();
		BankTransction bt=new BankTransction();
		int ch;
		System.out.println("*******WELCOME*******");
		System.out.println("Enter your ATM card number");
	    int Atm_card_no =sc.nextInt();
		System.out.println("Enter Your Pin: ");
		int pin=sc.nextInt();
		if (pin==Pin)
		{
			System.out.println("Login SuccessFully...");
			do
			{
	            System.out.println("=====================================");
				System.out.println("Enter Your Choice: ");
				b.show();
				ch = sc.nextInt();
					 switch (ch) 
			         {  
			             case 1:  
			                bt.Withdraw();
			                 break;  
			             case 2: 
			             	bt.Deposite();
			                 break;            
			             case 3:  
			                 bt.checkbalance();
			                 break;  
			             case 4: 
			             	bt.exit();
			                 break;  
			         } 
			}
			while (ch != 4);  
		}
		else
    	{
    		System.out.println("Incorrect Pin, Please Enter Correct Pin ");
    	}	
	}
}
