/**
 * 
 */
package com.mm.dms.controller;

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

import com.mm.dms.model.Product;
import com.mm.dms.service.ProductService;

/**
 * @author USER
 *
 */
@RestController
@RequestMapping("/api/v1/products")
public class ProductsController {

	@Autowired
	private ProductService productService;

	@GetMapping("/welcome")
	public String showWelcomePage() {
		return "<h1>Welcome to DMS - Products Service</h1>";
	}
	
	@GetMapping
	public List<Product> findAllProducts() {
		List<Product> productsList = productService.findAllProducts();
		return productsList;
	}
	
	
	@PostMapping
	public String addProduct(@RequestBody Product product) {
		Long newProdId = productService.addProduct(product);
		return "New Product ID : " + newProdId;
	}
	
	@PutMapping("/{productId}")
	public String modifyProduct(@PathVariable(name = "productId") Long id, @RequestBody Product product) {
		Boolean result = productService.modifyProduct(id, product);
		return "Update Result :: " + result;
	}
	
	@DeleteMapping("/{productId}")
	public String removeProduct(@PathVariable Long productId) {
		Boolean result = productService.removeProduct(productId);
		return "Delete Result"+result;
	}
}
