package com.paymentchain.customer.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.paymentchain.customer.model.Customer;



public interface CustomerService {
	List<Customer> listadoCustomer();
	void modificarCustomer(int idCustomer, Customer customer);
	void borrarCustomer(int idCustomer);
	ResponseEntity<?> crearCustomer(Customer customer);
	Customer buscarCustomer(int idCustomer);

}
