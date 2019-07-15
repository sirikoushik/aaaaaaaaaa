package com.capg.mp.service;

import java.util.Map;

import com.capg.mp.bean.Account;

public interface ServiceInterface {
	public String createAccount(Account account);
	public void  addMoney(String accountNumber, int amount);
	public void showDetails(String AccountNumber);
	public void transferMoney(String SendAccountNumber, String RecieveAccountNumber, int amount);
	public Map<String, Account> getAllAccounts();
	}
