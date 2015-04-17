package com.github.linsolas.katalisthenics;

import java.io.PrintStream;

public class BankAccount {

    public Owner owner;

    private Operations operations = new Operations();

    public BankAccount(Owner owner) {
        this.owner = owner;
    }

    public Amount calculateBalance() {
        Amount balance = new Amount();
        for (Operation operation : operations) {
            operation.evaluateBalance(balance);
        }
        return balance;
    }

    public void withdraw(int money) {
        if (money > calculateBalance().value) {
            throw new IllegalArgumentException("T'es pauvre");
        }
        if (money <= 0) {
            throw new IllegalArgumentException("Withdrawal cannot be negative or null");
        }
        operations.newWithdraw(money);
    }


    public void deposit(int deposit) {
        if (deposit <= 0) {
            throw new IllegalArgumentException("Deposit cannot be negative or null");
        }
        operations.newDeposit(deposit);
    }


    public void transfer(BankAccount account, int money) {
        withdraw(money);
        account.deposit(money);
    }

    public void printOperations(PrintStream stream) {
        Amount balance = new Amount();
        for (Operation operation : operations) {
            operation.evaluateBalance(balance);
            operation.printOperation(stream, balance);
        }
    }

}
