package com.capg.mp.dao;

import java.util.HashMap;
import java.util.Map;

import com.capg.mp.bean.Account;

public class DaoClass implements DaoInterface {
	Map<String,Account> map=new HashMap<String,Account>();
	public void createAccount( String AccountNumber, Account account)
	{
		map.put(AccountNumber, account);
	
}
public void addMoney(String AccountNumber, int amount )
{
	
	try{
		Account account=new Account();
	
	account=map.get(AccountNumber);
	int temp=account.getBalance();
	temp=temp+amount;
	account.setBalance(temp);
		}
	catch(Exception e)
	{
		throw e;
	}
		
}

public Account showDetails(String AccountNumber) {
	try {
		Account account=new Account();
		if(map.containsKey(AccountNumber))
		account=map.get(AccountNumber);
		else {}
	}
	catch (Exception e)
	{
		throw e;
	}
	return account;

	}

public void transferMoney(String sendAccountNumber, String recieveAccountNumber, int amomunt)
{
	try{
	
			if(sendAccountNumber.matches("([A-Z][a-z]+)*"))
			{
		
		if(sendAccountNumber!=recieveAccountNumber)
			
		{
			Account account1=map.get(sendAccountNumber);
			Account account2=map.get(recieveAccountNumber);
			int temp1=account1.getBalance();
			int temp2=account2.getBalance();
			temp1=temp1-amomunt;
			temp2=temp2+amomunt;
			account1.setBalance(temp1);
			account2.setBalance(temp2);
		}
		
		
		else {}
			}
	}
	catch(Exception e)
	{
		throw e;
	}
	
	public HashMap<String, Account> getAllAccounts() {
		// TODO Auto-generated method stub
		try {
			return (HashMap<String, Account>) map;
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	
	
	
	
	
	
}




}












