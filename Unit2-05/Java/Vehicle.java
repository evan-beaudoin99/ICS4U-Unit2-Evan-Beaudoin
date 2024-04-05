/*
* This is the Vehicle class
*
* By:      Evan Beaudoin
* Version: 1.0
* Since:   2024-04-04
 */

public class Vehicle {

    private int speed;
    private String color;
    private String plateNumber;
    private int numberOfDoors;
    private int maxSpeed;

    // Creates the Vehicle object
    public Vehicle(String color, String plateNumber, int numberOfDoors, int maxSpeed) {
        this.color = color;
        this.plateNumber = plateNumber;
        this.numberOfDoors = numberOfDoors;
        this.maxSpeed = maxSpeed;
        this.speed = 0;
    }

    // Getter for speed
    public int getSpeed() {
        return speed;
    }

    // Getter for color
    public String getColor() {
        return color;
    }

    // Setter for color
    public void setColor(String newColor) {
        this.color = newColor;
    }

    // Method to display the status of the Vehicle
    public void status() {
        System.out.println("Speed: " + speed);
        System.out.println("Color: " + color);
        System.out.println("Plate Number: " + plateNumber);
        System.out.println("Number of Doors: " + numberOfDoors);
        System.out.println("Max Speed: " + maxSpeed);
    }

    // Method to accelerate the Vehicle
    public void accelerate(int accelerationPower, int accelerationTime) {
        this.speed = (accelerationPower * accelerationTime) + this.speed;
    }

    // Method to decelerate (brake) the Vehicle
    public void brake(int brakePower, int brakeTime) {
        this.speed = this.speed - (brakePower * brakeTime);
    }
}

