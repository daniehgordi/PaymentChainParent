package com.paymentchain.transaction.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.paymentchain.transaction.model.Transaction;


public interface TransactionService {
	
	List<Transaction> listaTransaction();
	void modificarTransaction(int idTransaction, Transaction transaction);
	void borrarTransaction(int idTransaction);
	ResponseEntity<?> crearTransaction(Transaction transaction);
	Transaction buscarTransaction(int idTransaction);

}
