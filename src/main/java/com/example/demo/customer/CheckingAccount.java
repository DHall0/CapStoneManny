package com.example.demo.customer;
import java.time.LocalDate;
@SuppressWarnings("unused")
public class CheckingAccount extends Customer implements Balance {
    private long balance = 0;
    private long withdrawalAmount;
    private long depositAmount;

    public CheckingAccount(String firstName, String lastName, String middleName, LocalDate dateOfBirth, String SSN, String phoneNumber, String email, String username, String password, String street, String city, String state, String zipCode, String aptNumber, String gender, String martialStatus) {
        super(firstName, lastName, middleName, dateOfBirth, SSN, phoneNumber, email, username, password, street, city, state, zipCode, aptNumber, gender, martialStatus);
    }


    @Override
    public long withdrawal(long balance, long withdrawalAmount) throws Exception {
        if(balance >= withdrawalAmount){
            this.balance = balance - withdrawalAmount;
        }
        else{
            throw new Exception("Error");
        }
        return this.balance;
    }
    @Override
    public long deposit(long balance, long depositAmount) throws Exception {
        if(balance >= depositAmount){
            this.balance = balance - depositAmount;
        }
        else{
            throw new Exception("Error");
        }
        return this.balance;
    }
}
