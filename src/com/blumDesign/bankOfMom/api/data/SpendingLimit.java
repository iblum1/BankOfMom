package com.blumDesign.bankOfMom.api.data;

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
	
}
