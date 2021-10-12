/**
 * 
 */
package com.mm.sb.jpa.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mm.sb.jpa.dao.CustomerDao;
import com.mm.sb.jpa.dao.repository.CustomerRepository;
import com.mm.sb.jpa.model.Customer;

/**
 * @author USER
 *
 */
@Component
public class CustomerDaoImpl implements CustomerDao {

	@Autowired
	private CustomerRepository customerRepositoy;

	@Override
	public List<Customer> getAllCustomers() {
		return customerRepositoy.findAll();
	}

}
