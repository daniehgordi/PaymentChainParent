package com.paymentchain.product.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.paymentchain.product.model.Product;



public interface ProductService {
	
	List<Product> listaProduct();
	void modificarProduct(int idProduct, Product product);
	void borrarProduct(int idProduct);
	ResponseEntity<?> crearProducto(Product product);
	Product buscarProduct(int idProduct);

}
