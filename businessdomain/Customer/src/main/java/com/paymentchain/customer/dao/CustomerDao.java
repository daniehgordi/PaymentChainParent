/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.paymentchain.customer.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paymentchain.customer.model.Customer;


public interface CustomerDao extends JpaRepository<Customer, Integer> {

}
