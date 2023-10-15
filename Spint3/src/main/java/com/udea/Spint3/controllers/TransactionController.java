package com.udea.Spint3.controllers;

import com.udea.Spint3.entity.Transaction;
import com.udea.Spint3.services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController

public class TransactionController {
    @Autowired
    private TransactionService transactionService;

    //Consultar todas las transacciones
    @GetMapping("/transactions")
    public List<Transaction> getTransactions() {
        return transactionService.getTransactions();
    }
    //Consultar las transacciones por ID.
    @GetMapping("/transaction/user/{userId}")
    public List <Transaction> getTransactionByUserId(@PathVariable Integer userId){
        return transactionService.getTransactionByUserId(userId);
    }
    //Guardar una nueva transaccion.
    @PostMapping("/transaction/addUser/{userId}")
    public Transaction saveTransaction(@PathVariable Integer userId, @RequestBody Transaction transaction){
        return transactionService.saveTransaction(userId, transaction);
    }
    //Modificar o actualizar transferencia
    @PutMapping("/transaction/updateUser/{userId}/{transactionId}")
    public Transaction updateTransaction(@PathVariable Integer userId,@PathVariable Integer transactionId,@RequestBody Transaction transaction){
        return transactionService.updateTransaction(userId,transactionId,transaction);
    }
    // Eliminar transferencia
    @DeleteMapping("transaction/deleteUser/{userId}/{transactionId}")
    public String deleteTransaction(@PathVariable Integer userId, @PathVariable Integer transactionId){
        return transactionService.deleteTransaction(userId, transactionId);
    }



}
