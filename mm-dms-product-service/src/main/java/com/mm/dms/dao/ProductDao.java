/**
 * 
 */
package com.mm.dms.dao;

import java.util.List;

import com.mm.dms.model.Product;

/**
 * @author USER
 *
 */
public interface ProductDao {

	public Long addNewProduct(Product product);

	public List<Product> findAllProducts();

	public Boolean modifyProduct(Long id, Product product);

	public Boolean removeProduct(Long productId);

}
