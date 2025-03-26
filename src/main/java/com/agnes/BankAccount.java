package com.agnes;

import java.util.UUID;

public class BankAccount {
    String accountNumber;
    double balance;

    // create constructors
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = UUID.randomUUID().toString();
         this.balance = balance;
    }

}
