/**
 * 
 */
package com.mm.sb.jpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author USER
 *
 */
@Entity
@Table(name = "customers")
public class Customer {
	@Id
	@Column(name = "cust_id")
	private Long custId;
	
	@Column(name = "cust_name")
	private String name;
	
	@OneToOne(optional = false)
	@JoinColumn(name = "sub_id", referencedColumnName = "subc_id")
	private Subscription subscription;

	/**
	 * @return the custId
	 */
	public Long getCustId() {
		return custId;
	}

	/**
	 * @param custId the custId to set
	 */
	public void setCustId(Long custId) {
		this.custId = custId;
	}

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
	 * @return the subscription
	 */
	public Subscription getSubscription() {
		return subscription;
	}

	/**
	 * @param subscription the subscription to set
	 */
	public void setSubscription(Subscription subscription) {
		this.subscription = subscription;
	}
	
}
