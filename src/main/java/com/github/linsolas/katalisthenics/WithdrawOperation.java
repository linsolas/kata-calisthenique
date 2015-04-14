package com.github.linsolas.katalisthenics;

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
    public void printOperation() {
        super.printOperation();
        System.out.println("Withdraw of " + amount + "EUR");
    }
}
