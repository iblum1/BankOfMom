package com.blumDesign.bankOfMom.api.data;

import java.util.ArrayList;

import com.mongodb.BasicDBList;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;

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
	
	public void getFromDb(int index, DBCollection coll) {
		BasicDBObject query = new BasicDBObject("_id", index);
		DBCursor cursor = coll.find(query);
		try {
			BasicDBObject object = (BasicDBObject) cursor.next();
			if (object.containsField("name")) {
				name = object.get("name").toString();
			}
			if (object.containsField("age")) {
				age = object.getInt("age");
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
		BasicDBObject obj = new BasicDBObject("name", name)
				.append("age", Integer.valueOf(age));
		return obj;
	}

	public void removeDb(DBCollection coll) {
		BasicDBObject query = new BasicDBObject("name", name);
		coll.remove(query);
	}
}
