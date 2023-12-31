package com.paymentchain.product.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;



@Data
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int idProduct;
    private String name;
    private String code;
	   
	public Product() {
		super();
	}

	public Product(String name, String code) {
		super();
		this.name = name;
		this.code = code;
	}
	
	
	   
	   

}
