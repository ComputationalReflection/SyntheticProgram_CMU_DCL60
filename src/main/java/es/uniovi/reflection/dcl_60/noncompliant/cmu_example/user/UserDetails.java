package es.uniovi.reflection.dcl_60.noncompliant.cmu_example.user;

import es.uniovi.reflection.dcl_60.noncompliant.cmu_example.account.AccountHolder;

public class UserDetails extends AccountHolder {
    public synchronized double getUserBalance(String accountNumber) {
        // Use a method of AccountHolder to get the account balance
        return getBalance(accountNumber);
    }
}