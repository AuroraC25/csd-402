/* 

Name: Aurora Crippen

Date: October 25, 2026

Course: CSD 402 Java for Programmers

Assignment: Module 7.2 Assignment 

Purpose: Create and test a collection of Fan instances.
Display individual fans and a collection of fans
without using the toString method.


*/

import java.util.ArrayList;
import java.util.Collection;

public class UseFans {

    // Display every fan in a collection without using toString.
    public static void displayFans(Collection<Fan> fans) {
        int fanNumber = 1;

        for (Fan fan : fans) {
            System.out.print("Fan " + fanNumber + ": ");
            displayFan(fan);
            fanNumber++;
        }
    }

    // Display one fan using its getters instead of toString.
    public static void displayFan(Fan fan) {
        String speedName;

        switch (fan.getSpeed()) {
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

        System.out.println("The " + fan.getColor()
                + " fan is " + (fan.isOn() ? "on" : "off")
                + " with its speed set to " + speedName
                + " and has a radius of " + fan.getRadius() + ".");
    }

    public static void main(String[] args) {

        // Test both constructors and all four speed settings.
        Fan fan1 = new Fan();
        Fan fan2 = new Fan(Fan.SLOW, true, 7.0, "blue");
        Fan fan3 = new Fan(Fan.MEDIUM, true, 8.0, "yellow");
        Fan fan4 = new Fan(Fan.FAST, true, 10.0, "red");

        // Create a collection of Fan instances.
        ArrayList<Fan> fans = new ArrayList<>();

        fans.add(fan1);
        fans.add(fan2);
        fans.add(fan3);
        fans.add(fan4);

        // Test the method that displays the collection.
        System.out.println("Original fan collection:");
        displayFans(fans);

        // Test all setters while giving each fan different values.
        fan1.setSpeed(Fan.SLOW);
        fan1.setOn(true);
        fan1.setRadius(3.14);
        fan1.setColor("yellow");

        fan2.setSpeed(Fan.MEDIUM);
        fan2.setOn(true);
        fan2.setRadius(9.0);
        fan2.setColor("red");

        fan3.setSpeed(Fan.FAST);
        fan3.setOn(true);
        fan3.setRadius(25.0);
        fan3.setColor("pink");

        fan4.setSpeed(Fan.SLOW);
        fan4.setOn(true);
        fan4.setRadius(42.0);
        fan4.setColor("blue");

        System.out.println("\nUpdated fan collection:");
        displayFans(fans);

        // Stop one fan and test the single-instance display method.
        fan4.setSpeed(Fan.STOPPED);
        fan4.setOn(false);

        System.out.println("\nSingle fan after being turned off:");
        displayFan(fan4);
    }
}