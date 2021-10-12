/**
 * 
 */
package com.mm.sb.jpa.dao;

import java.util.List;

import com.mm.sb.jpa.model.Product;

/**
 * @author USER
 *
 */
public interface ProductDao {

	List<Product> getAllProducts();

	Product addProduct(Product product);

	Boolean modifyProduct(Long productId, Product product);

	Boolean removeProduct(Long productId);

	Product getProductById(Long productId);

	Product getProductByName(String productName);

	List<Product> getProductsByMinPrice(double minPrice);

	List<Product> getProductsByPriceRange(Double minPrice, Double maxPrice);

	List<Product> getProductsByNameStartsWith(String startStr);

}
