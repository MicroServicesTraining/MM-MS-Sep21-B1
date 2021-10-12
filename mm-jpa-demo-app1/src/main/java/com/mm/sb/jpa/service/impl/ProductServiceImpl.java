/**
 * 
 */
package com.mm.sb.jpa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mm.sb.jpa.converter.ProductConverter;
import com.mm.sb.jpa.dao.ProductDao;
import com.mm.sb.jpa.model.Product;
import com.mm.sb.jpa.service.ProductService;
import com.mm.sb.jpa.vo.ProductVo;

/**
 * @author USER
 *
 */
@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductDao productDao;
	
	//@Autowired
	//private ProductConverter productConverter;

	@Override
	public List<Product> getAllProducts() {
		List<Product> allProducts = productDao.getAllProducts();
		//List<ProductVo> productVosList = productConverter.convertEntityListToVoList(allProducts);
		return allProducts;
	}

	@Override
	public Product addProduct(Product product) {
		Long prodId = (long) (Math.random()*10000);
		product.setProdId(prodId);
		return productDao.addProduct(product);
	}

	@Override
	public Boolean modifyProduct(Long productId, Product product) {
		return productDao.modifyProduct(productId, product);
	}

	@Override
	public Boolean removeProduct(Long productId) {
		return productDao.removeProduct(productId);
	}

	@Override
	public Product getProductById(Long productId) {
		return productDao.getProductById(productId);
	}

	@Override
	public Product getProductByName(String productName) {
		return productDao.getProductByName(productName);
	}

	@Override
	public List<Product> getProductsByMinPrice(double minPrice) {
		return productDao.getProductsByMinPrice(minPrice);
	}

	@Override
	public List<Product> getProductsByPriceRange(Double minPrice, Double maxPrice) {
		return productDao.getProductsByPriceRange(minPrice, maxPrice);
	}

	@Override
	public List<Product> getProductsByNameStartsWith(String startStr) {
		return productDao.getProductsByNameStartsWith(startStr);
	}
	
	
}
