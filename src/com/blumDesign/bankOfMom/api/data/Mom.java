package com.blumDesign.bankOfMom.api.data;

import java.util.ArrayList;

public class Mom {

	private String name;
	private double balance;
	private ArrayList<Account> accounts;
	private ArrayList<Kid> kids;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
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
	 * @return the accounts
	 */
	public ArrayList<Account> getAccounts() {
		return accounts;
	}
	/**
	 * @param accounts the accounts to set
	 */
	public void setAccounts(ArrayList<Account> accounts) {
		this.accounts = accounts;
	}
	/**
	 * @return the kids
	 */
	public ArrayList<Kid> getKids() {
		return kids;
	}
	/**
	 * @param kids the kids to set
	 */
	public void setKids(ArrayList<Kid> kids) {
		this.kids = kids;
	}
	
}
