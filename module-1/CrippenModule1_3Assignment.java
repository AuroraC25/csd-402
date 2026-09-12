/* 

Name: Aurora Crippen

Date: September 11, 2026

Course: CSD 402 Java for Programmers

Assignment: Module 1.3 Assignment 

Purpose: This program asks the user to 
enter the mass of water and its initial
and final temperatures. It then calculates 
and displays the energy required to heat the 
water in joules.

*/



import java.util.Scanner;

public class CrippenModule1_3Assignment {
    public static void main(String[] args) {

        // Create a Scanner to receive input from the user
        Scanner input = new Scanner(System.in);

        // Display welcome message
        System.out.println("Welcome to the Water Heating Energy Calculator!\n");

        // Ask the user for the amount of water
        System.out.print("Enter the amount of water in kilograms: ");
        double waterMass = input.nextDouble();

        // Ask the user for the initial temperature
        System.out.print("Enter the initial temperature in Celsius: ");
        double initialTemperature = input.nextDouble();

        // Ask the user for the final temperature
        System.out.print("Enter the final temperature in Celsius: ");
        double finalTemperature = input.nextDouble();

        // Calculate the energy needed to heat the water
        double energy = waterMass
                * (finalTemperature - initialTemperature)
                * 4184;

        // Display the result
        System.out.println("\nThe energy needed to heat " + waterMass
            + " kilograms of water from " + initialTemperature
            + " \u00B0C to " + finalTemperature
            + " \u00B0C is " + energy + " Joules.");


        input.close();
    }
}