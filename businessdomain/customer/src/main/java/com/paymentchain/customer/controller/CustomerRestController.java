package com.paymentchain.customer.controller;
import org.springframework.web.bind.annotation.RestController;

import com.paymentchain.customer.model.Customer;
import com.paymentchain.customer.service.CustomerService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.beans.factory.annotation.Value;


@RestController
public class CustomerRestController {
    
    @Autowired
    private CustomerService service;
    
//    @Value("${user.role}")
//    private String role;
//    
//    @GetMapping("/hello")
//    public String sayHello() {
//        return "Hello your role is: "+ role;
//    }

    @GetMapping(value="/customer")
    public List<Customer> listaClientes() {   
    	return service.listadoCustomer();
    }
    
    @PutMapping(value="/customer/{idCustomer}")
	public void modificarCiente(@PathVariable int idCustomer, @RequestBody Customer customer) {
    	service.modificarCustomer(idCustomer, customer);
    }
	
    @DeleteMapping(value="/customer/{idcustomer}")
	public void borrarCliente(@PathVariable int idCustomer) {
    	service.borrarCustomer(idCustomer);
    }
    
    @PostMapping(value="")
	public ResponseEntity<?> crearCliente(@RequestBody Customer customer){
		return service.crearCustomer(customer);
	}
	
	@GetMapping(value="/customer/buscar/{idCustomer}")
	public Customer buscarCliente(@PathVariable int idCustomer) {
		return service.buscarCustomer(idCustomer);
	}
    

}
