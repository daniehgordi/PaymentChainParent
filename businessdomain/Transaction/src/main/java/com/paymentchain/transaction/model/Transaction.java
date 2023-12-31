package com.paymentchain.transaction.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;


@Data
@Entity
public class Transaction {

	    @Id
	    @GeneratedValue(strategy=GenerationType.AUTO)
	    private int idTransaction;
	    private String reference;
	    private String ibanAccount;
	    private LocalDateTime date;
	    private double amount ;
	    private double fee;
	    private String description;
	    private String status;
	    private String channel;
		
	    public Transaction() {
		  super();
	    }

		public Transaction(String reference, String ibanAccount, LocalDateTime date, double amount, double fee,
				String description, String status, String channel) {
			super();
			this.reference = reference;
			this.ibanAccount = ibanAccount;
			this.date = date;
			this.amount = amount;
			this.fee = fee;
			this.description = description;
			this.status = status;
			this.channel = channel;
		}
		
		
	   
   
   
   
   
}
