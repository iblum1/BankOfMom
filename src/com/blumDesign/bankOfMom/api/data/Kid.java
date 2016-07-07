package com.blumDesign.bankOfMom.api.data;

import java.util.ArrayList;

public class Kid {

	private String name;
	private int age;
	private ArrayList<Account> accounts;
	private Mom mom;
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
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
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
	 * @return the mom
	 */
	public Mom getMom() {
		return mom;
	}
	/**
	 * @param mom the mom to set
	 */
	public void setMom(Mom mom) {
		this.mom = mom;
	}
	
}
