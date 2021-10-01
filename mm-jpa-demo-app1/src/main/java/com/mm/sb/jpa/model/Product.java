/**
 * 
 */
package com.mm.sb.jpa.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author USER
 *
 */
@Entity
public class Product {

	@Id
	private Long prodId;
	private String prodName;
	private String category;
	private Double price;
	
	/**
	 * @return the prodId
	 */
	public Long getProdId() {
		return prodId;
	}
	/**
	 * @param prodId the prodId to set
	 */
	public void setProdId(Long prodId) {
		this.prodId = prodId;
	}
	/**
	 * @return the prodName
	 */
	public String getProdName() {
		return prodName;
	}
	/**
	 * @param prodName the prodName to set
	 */
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}
	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}
	/**
	 * @return the price
	 */
	public Double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(Double price) {
		this.price = price;
	}
	
}
