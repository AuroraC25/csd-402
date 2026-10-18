/* 

Name: Aurora Crippen

Date: October 17, 2026

Course: CSD 402 Java for Programmers

Assignment: Module 6.2 Assignment 

Purpose: Define a Fan class with constructors and methods
to access, change, and describe its state.


*/


public class Fan {
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    private int speed;
    private boolean on;
    private double radius;
    private String color;

    /**
     * Creates a fan with default values.
     */
    public Fan() {
        this(STOPPED, false, 6.0, "white");
    }

    /**
     * Creates a fan with the given values.
     * @param speed the fan speed
     * @param on whether the fan is on
     * @param radius the fan radius
     * @param color the fan color
     */
    public Fan(int speed, boolean on, double radius, String color) {
        setSpeed(speed);
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    /**
     * Returns the fan speed.
     * @return the speed
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * Sets the fan speed.
     * @param speed a value from STOPPED through FAST
     */
    public void setSpeed(int speed) {
        if (speed < STOPPED || speed > FAST) {
            throw new IllegalArgumentException(
                "Speed must be between STOPPED (0) and FAST (3)."
            );
        }

        this.speed = speed;
    }

    /**
     * Returns whether the fan is on.
     * @return true if the fan is on
     */
    public boolean isOn() {
        return on;
    }

    /**
     * Sets whether the fan is on.
     * @param on true to turn the fan on, false to turn it off
     */
    public void setOn(boolean on) {
        this.on = on;
    }

    /**
     * Returns the fan radius.
     * @return the radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Sets the fan radius.
     * @param radius the fan radius
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Returns the fan color.
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets the fan color.
     * @param color the fan color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Returns a description of the fan.
     * @return the fan's state, speed setting, radius, and color
     */
    @Override
    public String toString() {
    String speedName;

    switch (speed) {
        case SLOW:
            speedName = "slow";
            break;
        case MEDIUM:
            speedName = "medium";
            break;
        case FAST:
            speedName = "fast";
            break;
        default:
            speedName = "stopped";
    }

    if (on) {
        return "The " + color + " fan is on with its speed set to "
            + speedName + " and has a radius of " + radius + ".";
    } else {
        return "The " + color + " fan is off and has a radius of "
            + radius + ".";
    }
}
}