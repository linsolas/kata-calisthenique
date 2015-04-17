package com.github.linsolas.katalisthenics;

import java.io.PrintStream;

public class WithdrawOperation extends Operation {

    public final Amount amount;

    public WithdrawOperation(int amount) {
        this.amount = new Amount(amount);;
    }

    @Override
    public Amount evaluateBalance(Amount oldBalance) {
        oldBalance.substract(amount);
        return oldBalance;
    }

    @Override
    public void printOperation(PrintStream stream, Amount balance) {
        super.printOperation(stream, balance);
        stream.println("Withdraw of " + amount + "EUR -> " + balance + "EUR");
    }
}
