package com.github.linsolas.katalisthenics;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BankTests {

    private Owner owner = new Owner("romain");
    private BankAccount account = new BankAccount(owner);

    private Owner otherOwner = new Owner("toto");
    private BankAccount otherAccount = new BankAccount(otherOwner);

    @Before
    public void init() {
        account.deposit(200);
        otherAccount.deposit(400);
    }

    private void checkAmount(BankAccount account, int money) {
        assertThat(account.calculateBalance()).isEqualTo(new Amount(money));
    }

    @Test
    public void can_retrieve_money() {
        account.withdraw(100);
        checkAmount(account, 100);
    }

    @Test(expected = IllegalArgumentException.class)
    public void cannot_retrieve_money() {
        account.withdraw(1000);
    }

    @Test(expected = IllegalArgumentException.class)
    public void cannot_retrieve_negative_money() {
        account.withdraw(-1000);
    }

    @Test
    public void should_have_more_money_after_deposit() {
        account.deposit(1000);
        checkAmount(account, 1200);
    }

    @Test(expected = IllegalArgumentException.class)
    public void cannot_deposit_negative_amount() {
        account.deposit(-1000);
    }

    @Test
    public void owner_transfert_to_another_owner() {
        account.transfer(otherAccount, 50);
        checkAmount(account, 150);
        checkAmount(otherAccount, 450);
    }

    @Test(expected = IllegalArgumentException.class)
    public void should_not_be_able_to_transfer_too_much_money() {
        account.transfer(otherAccount, 500);
    }

    @Test
    public void should_print() {
        account.withdraw(40);
        account.deposit(400);
        account.printOperations(System.out);
    }


}
