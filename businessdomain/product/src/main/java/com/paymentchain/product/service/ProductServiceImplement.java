package com.paymentchain.product.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.paymentchain.product.dao.ProductDao;
import com.paymentchain.product.model.Product;

@Service
public class ProductServiceImplement implements ProductService {
	
	@Autowired
	ProductDao dao;

	@Override
	public List<Product> listaProduct() {
		return dao.findAll();
	}

	@Override
	public void modificarProduct(int idProduct, Product product) {
		Product product1 = buscarProduct(idProduct);
		product1.setCode(product.getCode());
		product1.setName(product.getName());
	}

	@Override
	public void borrarProduct(int idProduct) {
		dao.deleteById(idProduct);

	}

	@Override
	public ResponseEntity<?> crearProducto(Product product) {
		Product save = dao.save(product);
		return ResponseEntity.ok(save);
	}

	@Override
	public Product buscarProduct(int idProduct) {
		return dao.findById(idProduct).orElse(null);
	}

}
