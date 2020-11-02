

package com.example;


public class CheckingAccount extends Account{
     Double rateofinterest=0.06;
     private final double overDraftLimit;

    public CheckingAccount(double balance, double overDraftLimit) {
        super(balance);
        this.overDraftLimit = overDraftLimit;
    }

    public CheckingAccount(double balance) {
        super(balance);
        this.overDraftLimit = 0;
    }
    

    @Override
    public boolean withdraw(double amount) {
        if(amount <= balance+overDraftLimit ) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }

    
     @Override
     public void  deposit(double amount) {
       balance += amount;
       balance +=balance * rateofinterest;
       
        }
    
    @Override
    public String getDescription() {
        return "Checking Account";
    }
    
}
