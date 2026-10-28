/* 

Name: Aurora Crippen

Date: October 25, 2026

Course: CSD 402 Java for Programmers

Assignment: Module 7.2 Assignment 

Purpose: Test both Fan constructors and demonstrate
the getters, setters, and toString method.


*/


public class CrippenModule6 {

    public static void main(String[] args) {

        // Create a fan using each constructor.
        Fan fan1 = new Fan();
        Fan fan2 = new Fan(Fan.FAST, true, 10.0, "blue");

        // Display the original state of both fans.
        System.out.println("Fan 1: Default constructor");
        System.out.println(fan1.toString());

        System.out.println("\nFan 2: Argument constructor");
        System.out.println(fan2.toString());

        // Change all mutable fields of the first fan.
        fan1.setSpeed(Fan.MEDIUM);
        fan1.setOn(true);
        fan1.setRadius(8.0);
        fan1.setColor("yellow");

        // Display the updated values using the getters.
        System.out.println("\nFan 1: Updated values");

        String speedName;
        switch (fan1.getSpeed()) {
            case Fan.SLOW:
                speedName = "slow";
                break;
            case Fan.MEDIUM:
                speedName = "medium";
                break;
            case Fan.FAST:
                speedName = "fast";
                break;
            default:
                speedName = "stopped";
        }

        System.out.println("The " + fan1.getColor()
                + " fan is " + (fan1.isOn() ? "on" : "off")
                + " with its speed set to " + speedName
                + " and has a radius of " + fan1.getRadius() + ".");

        // Stop and turn off the second fan.
        fan2.setSpeed(Fan.STOPPED);
        fan2.setOn(false);

        System.out.println("\nFan 2: Turned off");
        System.out.println(fan2.toString());
    }
}