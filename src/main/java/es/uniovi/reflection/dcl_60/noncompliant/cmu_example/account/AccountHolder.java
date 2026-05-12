package es.uniovi.reflection.dcl_60.noncompliant.cmu_example.account;

import es.uniovi.reflection.dcl_60.noncompliant.cmu_example.user.User;

public class AccountHolder {

    private User user;
    public void setUser(User newUser) {user = newUser;}

    synchronized void depositFunds(String username, double amount) {
        // Use a utility method of User to check whether username exists
        if (user.exists(username)) {
            // Deposit the amount
        }
    }

    protected double getBalance(String accountNumber) {
        // Return the account balance
        return 1.0;
    }
}