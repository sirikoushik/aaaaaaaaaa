package com.capg.mp.dao;

import java.util.HashMap;

import com.capg.mp.bean.Account;


public interface DaoInterface {

	void createAccount(Account account, String accountNumber);

	void addMoney(String accountNumber, int amount);
	   Account showDetails(String AccountNumber);

	void transferMoney(String sendAccountNumber, String recieveAccountNumber, int amomunt);

	HashMap<String, Account> getAllAccounts();

}
