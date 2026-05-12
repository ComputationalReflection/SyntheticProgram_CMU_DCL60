package es.uniovi.reflection.dcl_60.compliant.cmu_example.user;

import es.uniovi.reflection.dcl_60.compliant.cmu_example.account.AccountHolder; // One-way dependency
import es.uniovi.reflection.dcl_60.compliant.cmu_example.bank.BankApplication;  // Import from a third package

public class UserDetails extends AccountHolder
        implements BankApplication {
    public synchronized double getUserBalance(
            String accountNumber) {
        // Use a method of AccountHolder to get the account balance
        return getBalance(accountNumber);
    }
    public boolean exists(String username) {
        // Check whether user exists
        return true;
    }
}