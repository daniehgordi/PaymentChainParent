package com.paymentchain.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.paymentchain.product.model.Product;
import com.paymentchain.product.service.ProductService;

@RestController
public class ProductRestController {

    @Autowired
    ProductService service;

    @GetMapping(value="/product")
    public List<Product> listaProducto(){
    	return service.listaProduct();
    };
    
    @PutMapping(value="/product/{idProduct}")
	public void modificarProducto(@PathVariable("idProduct") int idProduct,@RequestBody Product Product) {
    	service.modificarProduct(idProduct, Product);
    };
    
    @DeleteMapping(value="/product/idProduct")
	public void borrarProducto(@PathVariable("idProduct") int idProduct) {
    	service.borrarProduct(idProduct);
    };
    
    @PostMapping(value="/product")
	public ResponseEntity<?> crearProducto(Product product){
		return service.crearProducto(product);
	};
	
	@GetMapping(value="/product/{idProduct}")
	public Product buscarProducto(@PathVariable("idProduct") int idProduct) {
		return service.buscarProduct(idProduct);
	};

}
