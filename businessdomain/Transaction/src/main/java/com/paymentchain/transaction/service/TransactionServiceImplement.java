package com.paymentchain.transaction.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.paymentchain.transaction.dao.TransactionDao;
import com.paymentchain.transaction.model.Transaction;

@Service
public class TransactionServiceImplement implements TransactionService {

	@Autowired
	TransactionDao dao;
	
	@Override
	public List<Transaction> listaTransaction() {
		return dao.findAll();
	}

	@Override
	public void modificarTransaction(int idTransaction, Transaction transaction) {
		Transaction transaction1 = buscarTransaction(idTransaction);
		transaction1.setAmount(transaction.getAmount());
		transaction1.setChannel(transaction.getChannel());
		transaction1.setDate(transaction.getDate());
		transaction1.setDescription(transaction.getDescription());
		transaction1.setFee(transaction.getFee());
		transaction1.setIbanAccount(transaction.getIbanAccount());
		transaction1.setReference(transaction.getReference());
		transaction1.setStatus(transaction.getStatus());
	}

	@Override
	public void borrarTransaction(int idTransaction) {
		dao.deleteById(idTransaction);

	}

	@Override
	public ResponseEntity<?> crearTransaction(Transaction transaction) {
		Transaction save = dao.save(transaction);
		return ResponseEntity.ok(save);
	}

	@Override
	public Transaction buscarTransaction(int idTransaction) {
		return dao.findById(idTransaction).orElse(null);
	}

}
