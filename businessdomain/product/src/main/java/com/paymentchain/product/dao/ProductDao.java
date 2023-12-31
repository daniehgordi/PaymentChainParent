package com.paymentchain.product.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.paymentchain.product.model.Product;


public interface ProductDao extends JpaRepository<Product, Integer> {


   }
