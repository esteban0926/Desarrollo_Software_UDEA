package com.udea.Spint3.services;

import com.udea.Spint3.entity.Transaction;
import com.udea.Spint3.entity.User;
import com.udea.Spint3.repository.TransactionRepository;
import com.udea.Spint3.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {
    @Autowired
    private TransactionRepository transactionRepository;
    @Autowired
    private UserRepository userRepository;

    //Metodo para consultar todas las transacciones.
    public List<Transaction> getTransactions(){
        return transactionRepository.findAll();
    }

    //Metodo para consultar transacciones por ID
    public List <Transaction> getTransactionByUserId(Integer userId) {
        return transactionRepository.findByUserId(userId);
    }

    //Metodo para guardar movimiento nuevo
    public Transaction saveTransaction(Integer userId, Transaction transaction) {
        User user = userRepository.findById(userId).orElse(null);
        if (user != null) {
            transaction.setUser(user);
            return transactionRepository.save(transaction);
        }
        return null;
    }
        //Metodo para actualizar transaccion
        public Transaction updateTransaction(Integer userId, Integer transactionId, Transaction transaction){
            Transaction existing = transactionRepository.findById(transactionId).orElse(null);
            if (existing != null && existing.getUser().getId().equals(userId)) {
                transaction.setId(transactionId);
                transaction.setUser(existing.getUser());
                return transactionRepository.save(transaction);
            }
            return null;
        }
        // Metodo para eliminar transaccion
        public String deleteTransaction (Integer userId, Integer transactionId){
            Transaction existing = transactionRepository.findById(transactionId).orElse(null);
            if (existing != null && existing.getUser().getId().equals(userId)) {
                transactionRepository.deleteById(transactionId);
                return "Has elmininado la transaccion con el ID: " +transactionId;
            }else {
                return "No se pudo eliminar la transaccion";
            }
        }
}

