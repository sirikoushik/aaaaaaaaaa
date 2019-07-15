package com.capg.mp.presentation;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

import com.capg.mp.bean.Account;
import com.capg.mp.service.ServiceClass;
import com.capg.mp.service.ServiceInterface;

public class Start {
	static ServiceInterface service=new ServiceClass();
	public static void displayUnit()
	 {
		 System.out.println("*****WELCOME*****");
		 System.out.print("Enter Your Choice of : ");
	 	 System.out.println("01 Create New Wallet ");
   		 System.out.println("02 Add Money to your Wallet");
		 System.out.println("03 Show Details of Wallet");
		 System.out.println("04 Transfer Money");
		 System.out.println("05 Show All Wallet Accounts");
		 System.out.println("06 Exit");					
	}

@SuppressWarnings("resource")
public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc= new Scanner(System.in);
	int choice;		
	  while(true)
		{
			displayUnit();
			choice=sc.nextInt();
	 switch(choice)
		{
	   case 1: 
		       System.out.println("creating a new wallet account");
			   System.out.println("fill the following");
	       try {
				Account account=new Account();
				System.out.println("enter your name");
				account.setName(sc.next());
				System.out.println("enter your mobile number");
				account.setPhoneNumber(sc.nextLong());
				System.out.println("enter your emailId");
				account.setEmailId(sc.next());
				String AccountNumber=service.createAccount(account);
				System.out.println("heyy there \n your id is"+AccountNumber);
			    }
		    catch(Exception e)
			    {
				System.out.println(e);
			    }			
			break;
			
		case 2:
				System.out.println("Adding Money to your account");
			try {
				Account account=new Account();
				System.out.println("enter your accountnumber");
				String AccountNumber=sc.next();
				System.out.println("enter the money to be added");
				int amount = sc.nextInt();
				service.addMoney(AccountNumber, amount);
				System.out.println("the amount in the account is" +account.getBalance());
			   }
		  catch(Exception e)
			   {
				System.out.println(e);
			   }		
		   break;
		   
		case 3:
				System.out.println("Show details of the wallet");
		    try {
				System.out.println("enter the Account number" );
				String AccountNumber=sc.next();	
				service.showDetails(AccountNumber);
				System.out.println();
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
				break;
		case 4:
				System.out.println("Money transfer");
			try {
				System.out.println("enter the sender account");
				String senderAccount=sc.next();
				System.out.println("enter the reciever account");
				String RecieverAccount=sc.next();
				System.out.println("enter the money to be transferred");
				int amount=sc.nextInt();
				service.transferMoney(senderAccount, RecieverAccount, amount);
				}
				catch(Exception e)
				{
				System.out.println(e);
				}
				break;
	   case 5:
			try{
				Map<String, Account> map=new HashMap<String, Account>();
				map=service.getAllAccounts();
				if(!map.isEmpty())
				{
				Set<Entry<String, Account>> set=map.entrySet();
				Iterator<Entry<String, Account>> i=set.iterator();
				while(i.hasNext())
				{
				Map.Entry<String, Account> me=i.next();
				Account result=me.getValue();
				System.out.println("\nThe Available Wallet Accounts are...");
				System.out.println("---------------------------");
				System.out.println("Wallet Number: "+me.getKey()+"\nUser Name: "+result.getName());
				}
				}
				else
				{
				System.out.println("No Wallet Accounts Found");
				}
				}
				catch(Exception e)
				{
				System.out.println(e);
				}
				break;
		case 6:
				System.out.println("thnks for using");
				System.exit(0);
				break;
				default: 
				System.out.println("enter the numbers within the range");		
		     	}
			    }
			    }
			    }
