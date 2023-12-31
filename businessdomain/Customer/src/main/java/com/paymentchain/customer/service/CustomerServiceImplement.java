package com.paymentchain.customer.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.paymentchain.customer.dao.CustomerDao;
import com.paymentchain.customer.model.Customer;

@Service
public class CustomerServiceImplement implements CustomerService{
	
	@Autowired
	CustomerDao dao;

	@Override
	public List<Customer> listadoCustomer() {
		return dao.findAll();
	}

	@Override
	public void modificarCustomer(int idCustomer, Customer customer) {
		Customer customer1 = buscarCustomer(idCustomer);
		customer1.setAddress(customer.getAddress());
		customer1.setCode(customer.getCode());
		customer1.setIban(customer.getIban());
		customer1.setName(customer.getName());
		customer1.setPhone(customer.getPhone());
		customer1.setSurname(customer.getSurname());
		
	}

	@Override
	public void borrarCustomer(int idCustomer) {
		dao.deleteById(idCustomer);
	}

	@Override
	public ResponseEntity<?> crearCustomer(Customer customer) {
		Customer save = dao.save(customer);
		return ResponseEntity.ok(save);
	}

	@Override
	public Customer buscarCustomer(int idCustomer) {
		return dao.findById(idCustomer).orElse(null);
	}



}
