package com.blumDesign.bankOfMom.api.data;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;

public class SpendingLimit {

	private String description;
	private String type;
	private double amount;
	private String velocityType;
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * @return the amount
	 */
	public double getAmount() {
		return amount;
	}
	/**
	 * @param amount the amount to set
	 */
	public void setAmount(double amount) {
		this.amount = amount;
	}
	/**
	 * @return the velocityType
	 */
	public String getVelocityType() {
		return velocityType;
	}
	/**
	 * @param velocityType the velocityType to set
	 */
	public void setVelocityType(String velocityType) {
		this.velocityType = velocityType;
	}
	
	public void getFromDb(int index, DBCollection coll) {
		BasicDBObject query = new BasicDBObject("_id", index);
		DBCursor cursor = coll.find(query);
		try {
			BasicDBObject object = (BasicDBObject) cursor.next();
			if (object.containsField("description")) {
				description = object.get("description").toString();
			}
			if (object.containsField("type")) {
				type = object.getString("type");
			}
			if (object.containsField("amount")) {
				amount = object.getDouble("amount");
			}
			if (object.containsField("velocityType")) {
				velocityType = object.getString("velocityType");
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
		BasicDBObject obj = new BasicDBObject("amount", Double.valueOf(amount))
				.append("description", description)
				.append("type", type)
				.append(velocityType, velocityType);
		return obj;
	}

	public void removeDb(DBCollection coll) {
		BasicDBObject query = new BasicDBObject("description", description);
		coll.remove(query);
	}
}
