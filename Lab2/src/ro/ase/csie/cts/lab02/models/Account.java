package ro.ase.csie.cts.lab02.models;

import ro.ase.csie.cts.lab02.exceptions.IllegalTranferException;
import ro.ase.csie.cts.lab02.exceptions.InsufficientFundsException;

public abstract class Account {
    public abstract void deposit(Double amount);
    public abstract void withdraw(Double amount) throws InsufficientFundsException;
    public abstract Object getBalance();
    public abstract void  transfer(Account destination, Double amount) throws InsufficientFundsException, IllegalTranferException;
}
