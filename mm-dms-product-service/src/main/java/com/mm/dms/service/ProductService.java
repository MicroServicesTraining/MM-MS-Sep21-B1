/**
 * 
 */
package com.mm.dms.service;

import java.util.List;

import com.mm.dms.model.Product;

/**
 * @author USER
 *
 */
public interface ProductService {

	Long addProduct(Product product);

	List<Product> findAllProducts();

	Boolean modifyProduct(Long id, Product product);

	Boolean removeProduct(Long productId);

}
