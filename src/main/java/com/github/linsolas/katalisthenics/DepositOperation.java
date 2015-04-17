package com.github.linsolas.katalisthenics;

import java.io.PrintStream;

public class DepositOperation extends Operation {

    public final Amount amount;

    public DepositOperation(int amount) {
        this.amount = new Amount(amount);
    }

    @Override
    public Amount evaluateBalance(Amount oldBalance) {
        oldBalance.add(amount);
        return oldBalance;
    }

    @Override
    public void printOperation(PrintStream stream, Amount balance) {
        super.printOperation(stream, balance);
        stream.println("Deposit of " + amount + "EUR -> " + balance + "EUR");
    }

}
