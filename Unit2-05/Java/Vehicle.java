/*
* This is the Vehicle class
*
* By:      Evan Beaudoin
* Version: 1.0
* Since:   2024-04-04
*/

/**
 * This is the Vehicle class.
*/
public class Vehicle {

    /**
     * Constants.
     */
    private int speed;

    /**
     * Constants.
     */
    private String color;

    /**
     * Constants.
     */
    private String plateNumber;

    /**
     * Constants.
     */
    private int numberOfDoors;

    /**
     * Constants.
     */
    private int maxSpeed;

    /**
     * Constructs a new instance of Vehicle.
     * Initializes the stack with an empty ArrayList.
     *
    */
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

    /**
     * Displays the status.
    */
    public void status() {
        System.out.println("Speed: " + speed);
        System.out.println("Color: " + color);
        System.out.println("Plate Number: " + plateNumber);
        System.out.println("Number of Doors: " + numberOfDoors);
        System.out.println("Max Speed: " + maxSpeed);
    }

    /**
     * Accelerates the car. 
     * 
     * @param int acceleration power.
     * @param int acceleration time.
    */
    public void accelerate(int accelerationPower, int accelerationTime) {
        this.speed = (accelerationPower * accelerationTime) + this.speed;
    }

    /**
     * Brakes for the car. 
     * 
     * @param int break power.
     * @param int break time.
    */
    public void brake(int brakePower, int brakeTime) {
        this.speed = this.speed - (brakePower * brakeTime);
    }
}

