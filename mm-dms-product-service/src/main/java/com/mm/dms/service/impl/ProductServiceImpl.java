/**
 * 
 */
package com.mm.dms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mm.dms.dao.ProductDao;
import com.mm.dms.model.Product;
import com.mm.dms.service.ProductService;

/**
 * @author USER
 *
 */

//@Component
@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductDao productDao;

	public Long addProduct(Product product) {
		Long newProdId = productDao.addNewProduct(product);
		return newProdId;
	}


	public List<Product> findAllProducts() {
		List<Product> productsList = productDao.findAllProducts();
		return productsList;
	}


	public Boolean modifyProduct(Long id, Product product) {
		return productDao.modifyProduct(id, product);
	}


	public Boolean removeProduct(Long productId) {
		return productDao.removeProduct(productId);
	}

}
