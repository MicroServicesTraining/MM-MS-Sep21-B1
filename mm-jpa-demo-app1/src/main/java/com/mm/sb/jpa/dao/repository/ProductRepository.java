/**
 * 
 */
package com.mm.sb.jpa.dao.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mm.sb.jpa.model.Product;

/**
 * @author USER
 *
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{
	Product findByProdName(String prodName); // Query method - generic format - findByXXX(datatype columnField)
	List<Product> findByPrice(Double price);
	
	@Query(value = "select p from Product p where p.price > :price") // named parameters
	List<Product> fetchProductsPriceGreaterthan(@Param(value = "price") Double price);
	
	@Query(value = "select p from Product p where p.price > ?1 and p.price < ?2") //positional parameters
	List<Product> fetchProductsPriceInRange(Double minPrice, Double maxPrice);
	
	//@Query(value = "select p. from product p where p.prod_name like ?1%")
	//List<Product> fetchProductsNameStartsWith(String startStr);
}
