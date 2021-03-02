package ro.ase.csie.cts.lab02.models;

public abstract class BankAccount extends Account{
    protected double balance;
    protected String iban;

    public BankAccount(String iban,double balance)
    {
    this.iban = iban;
    this.balance = balance;
    }

    @Override
    public Object getBalance() {
        return this.balance;
    }



}