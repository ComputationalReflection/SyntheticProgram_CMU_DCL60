package es.uniovi.reflection.dcl_60.compliant.cmu_example.account;

import es.uniovi.reflection.dcl_60.compliant.cmu_example.bank.BankApplication;  // Import from a third package

public class AccountHolder  {
    private BankApplication ba;
    public void setBankApplication(BankApplication newBA) {
        ba = newBA;
    }

    public synchronized void depositFunds(BankApplication ba,
                                          String username, double amount) {
        // Use a utility method of UserDetails
        // to check whether username exists
        if (ba.exists(username)) {
            // Deposit the amount
        }
    }
    public double getBalance(String accountNumber) {
        // Return the account balance
        return 1.0;
    }
}