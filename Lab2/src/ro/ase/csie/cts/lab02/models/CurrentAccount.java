package ro.ase.csie.cts.lab02.models;

import ro.ase.csie.cts.lab02.exceptions.IllegalTranferException;
import ro.ase.csie.cts.lab02.exceptions.InsufficientFundsException;

public class CurrentAccount extends BankAccount{

    public static final double MAX_CREDIT = 5000;

    public CurrentAccount(String iban) {
        super(iban, CurrentAccount.MAX_CREDIT);
    }


    @Override
    public void deposit(Double amount) {
        this.balance += amount;
    }

    @Override
    public void withdraw(Double amount) throws InsufficientFundsException {
        if (this.balance >= amount) {
            this.balance -= amount;
        }
        else {
            throw new InsufficientFundsException("you don't have enoguht money");
        }
    }

    @Override
    public void transfer(Account destination, Double amount) throws InsufficientFundsException, IllegalTranferException {
        if (this != destination) {
            this.withdraw(amount);
            destination.deposit(amount);
        }
        else
        {
            throw new IllegalTranferException();
        }
    }


}
