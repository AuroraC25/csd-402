/* 

Name: Aurora Crippen

Date: November 11, 2026

Course: CSD 402 Java for Programmers

Assignment: Module 10.2 Assignment 

Purpose: Define the information and behavior shared by all divisions.

*/

public abstract class Division {
    private final String divisionName;
    private final int accountNumber;

    protected Division(String divisionName, int accountNumber) {
        this.divisionName = divisionName;
        this.accountNumber = accountNumber;
    }

    public String getDivisionName() {
        return divisionName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public abstract void display();
}