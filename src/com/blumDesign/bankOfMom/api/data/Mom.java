package com.blumDesign.bankOfMom.api.data;

import java.util.ArrayList;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;

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
	
	public void getFromDb(int index, DBCollection coll) {
		BasicDBObject query = new BasicDBObject("_id", index);
		DBCursor cursor = coll.find(query);
		try {
			BasicDBObject object = (BasicDBObject) cursor.next();
			if (object.containsField("name")) {
				name = object.get("name").toString();
			}
			if (object.containsField("balance")) {
				balance = object.getDouble("balance");
			}

		} catch (Exception e) {
			cursor.close();
			System.err.println(e);
		}
		
	}
	
	public void insetIntoDb(DBCollection coll) {
		BasicDBObject obj = getDBObject();
		coll.insert(obj);
	}
	
	public BasicDBObject getDBObject() {
		BasicDBObject obj = new BasicDBObject("balance", Double.valueOf(balance))
				.append("name", name);
		return obj;
	}

	public void removeDb(DBCollection coll) {
		BasicDBObject query = new BasicDBObject("name", name);
		coll.remove(query);
	}
}
