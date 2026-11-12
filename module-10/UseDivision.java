/* 

Name: Aurora Crippen

Date: November 11, 2026

Course: CSD 402 Java for Programmers

Assignment: Module 10.2 Assignment 

Purpose: Create and display two international and two domestic divisions.

*/

public class UseDivision {
    public static void main(String[] args) {
        Division[] divisions = {
            new InternationalDivision("Tokyo Operations", 1001, "Japan", "Japanese"),
            new InternationalDivision("Frankfurt Operations", 1002, "Germany", "German"),
            new DomesticDivision("Omaha Operations", 2001, "Nebraska"),
            new DomesticDivision("Phoenix Operations", 2002, "Arizona")
        };

        // Each object calls the display method defined by its subclass.
        for (Division division : divisions) {
            division.display();
            System.out.println();
        }
    }
}