package com.paymentchain.transaction.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.paymentchain.transaction.model.Transaction;
import com.paymentchain.transaction.service.TransactionService;


@RestController
public class TransactionRestController {

    @Autowired
    private TransactionService service;
    
    @GetMapping(value="/transaction")
    public List<Transaction> listaTransaccion(){
    	return service.listaTransaction();
    };
    
    @PutMapping(value="/transaction/{idTransaction}")
	public void modificarTransaccion(@PathVariable("idTransaction") int idTransaction,@RequestBody Transaction transaction) {
    	
    };
    
    @DeleteMapping(value="/transaction/{idTransaction}")
	void borrarTransaccion(@PathVariable("idTransaction") int idTransaction) {
    	
    };
    
    @PostMapping(value="/transaction")
    public ResponseEntity<?> crearTransaccion(@RequestBody Transaction transaction){
    	return service.crearTransaction(transaction);
    };
    
    @GetMapping(value="/transaction/{idTransaction}")
    public Transaction buscarTransaccion(@PathVariable("idTransaction") int idTransaction) {
		return service.buscarTransaction(idTransaction);
	};


    

}
