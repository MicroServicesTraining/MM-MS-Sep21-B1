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

}
