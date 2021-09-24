/**
 * 
 */
package com.mm.dms.repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.mm.dms.model.Product;

import lombok.Data;

/**
 * @author USER
 *
 */
@Repository
@Data
public class Psdb {
	
	private List<Product> products;
	
	public Psdb(){
		this.products = new ArrayList<Product>();
	}

	public Long save(Product product) {
		product.setProdId(Math.round((Math.random()*10000)));
		products.add(product);
		return product.getProdId();
	}

	public List<Product> select() {
		return products;
	}
		
	public Boolean update(Long productId, Product product) {
		delete(productId);
		products.add(product);
		return true;
	}

	public Boolean delete(Long productId) {
		Iterator<Product > it = products.iterator();
		while(it.hasNext()) {
			Product p = it.next();
			if(p.getProdId() == productId) {
				it.remove();
				return true;
			}
		}
		return false;
	}
	
}
