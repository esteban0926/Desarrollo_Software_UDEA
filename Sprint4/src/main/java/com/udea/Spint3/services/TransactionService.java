package com.udea.Spint3.services;

import com.udea.Spint3.entity.Transaction;
import com.udea.Spint3.entity.User;
import com.udea.Spint3.repository.TransactionRepository;
import com.udea.Spint3.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    public List<Transaction> getAllTransactions() {
        return transactionRepository.findAll();
    }

    public Transaction getTransactionById(Integer id) {
        Optional<Transaction> transaction = transactionRepository.findById(id);
        return transaction.orElse(null);
    }

    public Transaction createTransaction(Transaction transaction) {
        return transactionRepository.save(transaction);
    }

    public Transaction updateTransaction(Integer id, Transaction updatedTransaction) {
        Optional<Transaction> optionalTransaction = transactionRepository.findById(id);

        if (optionalTransaction.isPresent()) {
            Transaction transaction = optionalTransaction.get();
            transaction.setProducto(updatedTransaction.getProducto());
            transaction.setPrecio(updatedTransaction.getPrecio());
            transaction.setCantidad(updatedTransaction.getCantidad());
            transaction.setTotal(updatedTransaction.getPrecio() * updatedTransaction.getCantidad()); // Calcular total
            transaction.setUser(updatedTransaction.getUser());

            return transactionRepository.save(transaction);
        } else {
            return null; // Manejo de error si la transacción no existe
        }
    }

    public void deleteTransaction(Integer id) {
        transactionRepository.deleteById(id);
    }
}
