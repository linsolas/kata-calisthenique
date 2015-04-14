package com.github.linsolas.katalisthenics;

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
    public void printOperation() {
        super.printOperation();
        System.out.println("Deposit of " + amount + "EUR");
    }

}
