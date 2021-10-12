/**
 * 
 */
package com.mm.sb.jpa.dao.impl;

import java.util.List;
import java.util.Optional;

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
public class ProductDaoImpl implements ProductDao {

	@Autowired
	private ProductRepository productRepository;

	@Override
	public List<Product> getAllProducts() {
		return productRepository.findAll(); // select * from product
	}

	@Override
	public Product addProduct(Product product) {
		return productRepository.save(product);
	}

	@Override
	public Boolean modifyProduct(Long productId, Product product) {
		Optional<Product> prod = productRepository.findById(productId); //select * from product where prod_id = ?
		if (prod.isPresent()) {
			Product p = productRepository.save(product);
			if (p != null) {
				return true;
			}
		} else {
			return false;
		}

		return false;
	}

	@Override
	public Boolean removeProduct(Long productId) {
		Optional<Product> prod = productRepository.findById(productId);
		if (prod.isPresent()) {
			Product product = prod.get();
			productRepository.delete(product);
				return true;
		} else {
			return false;
		}
	}

	@Override
	public Product getProductById(Long productId) {
		Optional<Product> prod = productRepository.findById(productId);
		/*
		 * if (prod.isPresent()) { return prod.get(); } else { return null; }
		 */
		return Optional.ofNullable(prod.get()).orElse(null);		
	}

	@Override
	public Product getProductByName(String productName) {
		return productRepository.findByProdName(productName);
	}

	@Override
	public List<Product> getProductsByMinPrice(double minPrice) {
		return productRepository.fetchProductsPriceGreaterthan(minPrice);
	}

	@Override
	public List<Product> getProductsByPriceRange(Double minPrice, Double maxPrice) {
		return productRepository.fetchProductsPriceInRange(minPrice, maxPrice);
	}

	@Override
	public List<Product> getProductsByNameStartsWith(String startStr) {
		return null; //productRepository.fetchProductsNameStartsWith(startStr);
	}
	
}
