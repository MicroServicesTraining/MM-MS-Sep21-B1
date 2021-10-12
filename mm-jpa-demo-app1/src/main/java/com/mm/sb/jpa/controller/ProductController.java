/**
 * 
 */
package com.mm.sb.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mm.sb.jpa.model.Product;
import com.mm.sb.jpa.service.ProductService;

/**
 * @author USER
 *
 */

@RestController
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping
	public List<Product> getAllProducts(){
		return productService.getAllProducts();
	}
	
	@GetMapping("/byid/{productId}")
	public Product getProductById(@PathVariable Long productId) {
		return productService.getProductById(productId);
	}
	
	@GetMapping("/byname/{prodName}")
	public Product getProductByName(@PathVariable(name = "prodName") String productName) {
		return productService.getProductByName(productName);
	}
	
	@PostMapping
	public Product addProduct(@RequestBody Product product) {
		return productService.addProduct(product);
	}
	
	@PutMapping("/{prodId}")
	public Boolean modifyProduct(@PathVariable(name = "prodId") Long productId, @RequestBody Product product) {
		return productService.modifyProduct(productId, product);
	}
	
	@DeleteMapping("/{productId}")
	public Boolean removeProduct(@PathVariable Long productId) {
		return productService.removeProduct(productId);
	}
	
	@GetMapping("/byminprice/{minPrice}")
	public List<Product> getProductsByMinPrice(@PathVariable(name = "minPrice") double minPrice){
		return productService.getProductsByMinPrice(minPrice);
	}
	
	@GetMapping("/bypricerange/{minPrice}/{maxPrice}")
	public List<Product> getProductsByPriceRange(@PathVariable Double minPrice, @PathVariable Double maxPrice){
		return productService.getProductsByPriceRange(minPrice, maxPrice);
	}
	
	@GetMapping("/bynamestartswith/{startStr}")
	public List<Product> getProductsByNameStartsWith(@PathVariable String startStr){
		return productService.getProductsByNameStartsWith(startStr);
	}
	
}
