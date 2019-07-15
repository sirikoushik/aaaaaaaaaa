package com.capg.mp.service;

import java.util.HashMap;
import java.util.Random;
import com.capg.mp.bean.*;
import com.capg.mp.presentation.*;

import com.capg.mp.bean.Account;
import com.capg.mp.dao.DaoClass;
import com.capg.mp.dao.DaoInterface;
import com.capg.mp.service.ServiceClass;
import java.util.regex.Matcher;


public class ServiceClass implements ServiceInterface {
	DaoInterface dao=new DaoClass();
	public String createAccount(Account account) {
		String AccountNumber=null;
		
		try(name.matches())
			{
			try (phoneNumber.matches())
			{
			try(mailId.matches())
			{
			Random rand=new Random();
			int num=rand.nextInt();
			 AccountNumber=String.valueOf(num);
			 dao.createAccount(account, AccountNumber);
			}	
		}
		}
		catch(ArithmeticException e)
	{
		throw e;
	
	}
		return AccountNumber;
}
	
		
	
	 public  void addMoney(String AccountNumber, int amount) throws AccountNotFoundException
	 {
		try {
			
		 dao.addMoney(AccountNumber, amount);
		}
		catch(Exception e)
		{
			throw e;
		}
	 }

	 
	 public void showDetails(String AccountNumber) throws AccountNotFoundException
	 {
		 try {
			 dao.showDetails(AccountNumber);
		 }
			catch(Exception e)
		 {
				throw e;
		 }		 
	 }
	 
	 public void transferMoney(String SendAccountNumber, String RecieveAccountNumber, int amount ) throws AmountRangeCrossed
	 {
		 try {
			 dao.transferMoney(SendAccountNumber, RecieveAccountNumber, amount );
		 }
		 catch(Exception  e)
		 {
			 throw e;
		 }
	 }
	 
	 
	 public HashMap<String, Account> getAllAccounts() {
			// TODO Auto-generated method stub
			try {
				return dao.getAllAccounts();
			}
			catch(Exception e)
			{
				throw e;
			}
		}

	 
	
	
	
	
  }


