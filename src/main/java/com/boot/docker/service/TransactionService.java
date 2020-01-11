package com.boot.docker.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.docker.model.Transaction;
import com.boot.docker.repository.TransactionRepository;

@Service
public class TransactionService {

	@Autowired
	TransactionRepository transactionRepository;
	
	public void saveTransaction(Transaction transaction) {
		transactionRepository.save(transaction);
	}
	
	public Iterable<Transaction> getTransactionHistory() {
		return transactionRepository.findAll();
	}
	
	public Optional<Transaction> getTransaction(Long id) {
		return transactionRepository.findById(id);
	}
}