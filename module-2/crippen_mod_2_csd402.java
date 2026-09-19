/* 

Name: Aurora Crippen

Date: September 18, 2026

Course: CSD 402 Java for Programmers

Assignment: Module 2.2 Assignment 

Purpose: This program plays one round of Rock-Paper-Scissors.
The computer randomly selects Rock, Paper, or Scissors.
The user enters a selection, and the program displays
both choices and determines the winner.


*/



import java.util.Scanner;

public class crippen_mod_2_csd402 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Generate a random number from 1 through 3
        int computerChoice = (int) (Math.random() * 3) + 1;

        System.out.println("Rock-Paper-Scissors");
        System.out.println("-------------------");
        System.out.println("1 = Rock");
        System.out.println("2 = Paper");
        System.out.println("3 = Scissors");
        System.out.print("\nEnter your selection (1, 2, or 3): ");

        int userChoice = input.nextInt();

        // Check whether the user's selection is valid
        if (userChoice < 1 || userChoice > 3) {
            System.out.println("Invalid selection. Please run the program again");
            System.out.println("and enter 1, 2, or 3.");
        } else {
            String computerSelection = getSelection(computerChoice);
            String userSelection = getSelection(userChoice);

            System.out.println();
            System.out.println("Computer selected: " + computerSelection);
            System.out.println("You selected: " + userSelection);

            if (userChoice == computerChoice) {
                System.out.println("\nResult: It is a tie!");
            } else if (
                    (userChoice == 1 && computerChoice == 3) ||
                    (userChoice == 2 && computerChoice == 1) ||
                    (userChoice == 3 && computerChoice == 2)
            ) {
                System.out.println("\nResult: You win!");
            } else {
                System.out.println("\nResult: The computer wins!");
            }
        }

        input.close();
    }

    /*
     * Converts a numeric selection into the corresponding
     * Rock-Paper-Scissors choice.
     */
    public static String getSelection(int choice) {

        if (choice == 1) {
            return "Rock";
        } else if (choice == 2) {
            return "Paper";
        } else {
            return "Scissors";
        }
    }
}