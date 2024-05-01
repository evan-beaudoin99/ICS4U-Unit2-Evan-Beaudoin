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
    * @param color of the car.
    * @param plateNumber of the car.
    * @param numberOfDoors of the car.
    * @param maxSpeed of the car.
    */
    public Vehicle(String color, String plateNumber,
          int numberOfDoors, int maxSpeed) {
        this.color = color;
        this.plateNumber = plateNumber;
        this.numberOfDoors = numberOfDoors;
        this.maxSpeed = maxSpeed;
        this.speed = 0;
    }

     /**
     * Gets the license plate number of the vehicle.
     *
     * @return the current licensePlateNumber
    */
    public String getLicensePlateNumber() {
        return this.plateNumber;
    }

    /**
     * Gets the color of the vehicle.
     *
     * @return the current color
    */
    public String getColor() {
        return this.color;
    }

    /**
     * Gets the number of doors on the vehicle.
     *
     * @return the number of doors
    */
    public int getDoors() {
        return this.numberOfDoors;
    }

    /**
     * Gets the speed of the vehicle.
     *
     * @return the current speed
    */
    public double getSpeed() {
        return this.speed;
    }

    /**
     * Gets the maximum speed of the vehicle.
     *
     * @return the maximum speed
    */
    public double getMaxSpeed() {
        return this.maxSpeed;
    }

    /**
     * Sets the color of the vehicle.
     *
     * @param newColor of the vehicle
    */
    public void setColor(String newColor) {
        this.color = newColor;
    }

    /**
     * Sets the license plate of the vehicle.
     *
     * @param newPlateNumber of the vehicle.
    */
    public void setLicensePlateNumber(String newPlateNumber) {
        this.licensePlateNumber = newPlateNumber;
    }

    /**
    * Displays the status.
    */
    public void status() {
        System.out.println("  --> Speed: " + speed);
        System.out.println("  --> Max Speed: " + maxSpeed);
        System.out.println("  --> Number of Doors: " + numberOfDoors);
        System.out.println("  --> License Plate: " + plateNumber);
        System.out.println("  --> Color: " + color);
    }

    /**
    * Accelerates the car.
    *
    * @param accelerationPower of the car.
    * @param accelerationTime of the car.
    */
    public void accelerate(int accelerationPower, int accelerationTime) {
        this.speed = (accelerationPower * accelerationTime) + this.speed;
    }

    /**
    * Brakes for the car.
    *
    * @param breakPower The power of the brakes.
    * @param breakTime The time of the breaks.
    */
    public void brake(int brakePower, int brakeTime) {
        this.speed = this.speed - (brakePower * brakeTime);
    }
}
