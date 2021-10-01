/**
 * 
 */
package com.mm.sb.jpa.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mm.sb.jpa.dao.ProductDao;
import com.mm.sb.jpa.dao.repository.ProductRepository;
import com.mm.sb.jpa.model.Product;

/**
 * @author USER
 *
 */
@Component
public class ProductDaoImpl implements ProductDao{
	
	@Autowired
	private ProductRepository productRepository;

	@Override
	public List<Product> getAllProducts() {
		return productRepository.findAll();
	}

}
