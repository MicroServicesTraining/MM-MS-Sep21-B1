/**
 * 
 */
package com.mm.dms.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mm.dms.dao.ProductDao;
import com.mm.dms.model.Product;
import com.mm.dms.repository.Psdb;

/**
 * @author USER
 *
 */
@Component
public class ProductDaoImpl implements ProductDao {

	@Autowired
	private Psdb psdb;
	
	public Long addNewProduct(Product product) {
		Long prodId = psdb.save(product);
		return prodId;
	}

	public List<Product> findAllProducts() {
		List<Product> productsList = psdb.select();
		return productsList;
	}

	public Boolean modifyProduct(Long id, Product product) {
		return psdb.update(id, product);
	}

	public Boolean removeProduct(Long productId) {
		return psdb.delete(productId);
	}



}
