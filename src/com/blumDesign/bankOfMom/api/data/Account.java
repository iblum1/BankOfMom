package com.blumDesign.bankOfMom.api.data;

import java.util.ArrayList;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;

public class Account {

	private String accountNumber;
	private double balance;
	private ArrayList<Transaction> transactions;
	private ArrayList<SpendingLimit> spendingLimits;
	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}
	/**
	 * @param balance the balance to set
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}
	/**
	 * @return the transactions
	 */
	public ArrayList<Transaction> getTransactions() {
		return transactions;
	}
	/**
	 * @param transactions the transactions to set
	 */
	public void setTransactions(ArrayList<Transaction> transactions) {
		this.transactions = transactions;
	}
	/**
	 * @return the spendingLimits
	 */
	public ArrayList<SpendingLimit> getSpendingLimits() {
		return spendingLimits;
	}
	/**
	 * @param spendingLimits the spendingLimits to set
	 */
	public void setSpendingLimits(ArrayList<SpendingLimit> spendingLimits) {
		this.spendingLimits = spendingLimits;
	}
	
	
	/**
	 * @return the accountNumber
	 */
	public String getAccountNumber() {
		return accountNumber;
	}
	/**
	 * @param accountNumber the accountNumber to set
	 */
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public void insetIntoDb(DBCollection coll) {
		BasicDBObject obj = getDBObject();
		coll.insert(obj);
	}
	
	public BasicDBObject getDBObject() {
		BasicDBObject obj = new BasicDBObject("balance", Double.valueOf(balance))
				.append("accountNumber", accountNumber);
		return obj;
	}
	


}
