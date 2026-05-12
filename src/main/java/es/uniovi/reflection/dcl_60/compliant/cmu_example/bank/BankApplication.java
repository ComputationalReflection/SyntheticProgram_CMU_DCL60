package es.uniovi.reflection.dcl_60.compliant.cmu_example.bank;

public interface BankApplication {
    void depositFunds(BankApplication ba, String username, double amount);
    double getBalance(String accountNumber);
    double getUserBalance(String accountNumber);
    boolean exists(String username);
}