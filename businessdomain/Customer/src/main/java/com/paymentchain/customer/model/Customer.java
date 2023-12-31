package com.paymentchain.customer.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int idCustomer;
    private String name;
    private String code;
    private String iban;
    private String surname;
    private String phone;
    private String address;
   
	public Customer() {
		super();
	}
	public Customer(String name, String code, String iban, String surname, String phone,
			String address) {
		super();
		this.name = name;
		this.code = code;
		this.iban = iban;
		this.surname = surname;
		this.phone = phone;
		this.address = address;
	}
  
   
}


