package com.github.linsolas.katalisthenics;

import java.util.ArrayList;
import java.util.List;

public class Operations extends ArrayList<Operation> {

    public void newDeposit(int amount) {
        Operation operation = new DepositOperation(amount);
        super.add(operation);
    }
    public void newWithdraw(int amount) {
        Operation operation = new WithdrawOperation(amount);
        super.add(operation);
    }

}
