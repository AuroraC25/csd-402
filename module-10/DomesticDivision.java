/* 

Name: Aurora Crippen

Date: November 11, 2026

Course: CSD 402 Java for Programmers

Assignment: Module 10.2 Assignment 

Purpose: Store and display a domestic division's information.

*/

public class DomesticDivision extends Division {
    private final String state;

    public DomesticDivision(String divisionName, int accountNumber, String state) {
        super(divisionName, accountNumber);
        this.state = state;
    }

    @Override
    public void display() {
        System.out.println("Domestic Division: " + getDivisionName());
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("State: " + state);
    }
}
