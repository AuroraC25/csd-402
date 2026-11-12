/* 

Name: Aurora Crippen

Date: November 11, 2026

Course: CSD 402 Java for Programmers

Assignment: Module 10.2 Assignment 

Purpose: Store and display an international division's information.

*/

public class InternationalDivision extends Division {
    private final String country;
    private final String language;

    public InternationalDivision(String divisionName, int accountNumber,
                                 String country, String language) {
        super(divisionName, accountNumber);
        this.country = country;
        this.language = language;
    }

    @Override
    public void display() {
        System.out.println("International Division: " + getDivisionName());
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("Country: " + country);
        System.out.println("Language: " + language);
    }
}