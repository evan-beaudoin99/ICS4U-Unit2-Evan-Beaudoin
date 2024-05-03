/*
* This class creates a truck using methods from vehicles
*
* @author  Evan Beaudoin
* @version 1.0
* @since   2024-04-09
*/

/**
 * This is the class.
*/
public class Bike extends Vehicle {
    /**
     * Variable for the class.
     *
     * @param cadence of the bike
    */
    private double cadence;

    /**
     * Creates the base truck.
     *
     * @param initialColour the base colour
     * @param initialMaxSpeed the maximum speed of the vehicle
    */
    public Bike(String initialColour, double initialMaxSpeed) {
        super(initialColour, initialMaxSpeed);
        this.cadence = 0;
    }

    /**
     * Gets the cadence of the bike.
     *
     * @return the current cadence
    */
    public double getCadence() {
        return this.cadence;
    }

    /**
     * Creates a string about the status of the vehicle.
     *
     * @return the string about the vehicle's status
    */
    public String getStatus() {
        final String lineBreak = "\n";
        String status = " -> Speed: " + this.getSpeed() + lineBreak;
        status += " -> MaxSpeed: " + this.getMaxSpeed() + lineBreak;
        status += " -> Color: " + this.getColour() + lineBreak;
        status += " -> Cadence: " + this.cadence + lineBreak;

        return status;
    }

    /**
     * Sets the cadence of the bike.
     *
     * @param newCadence of the bike
    */
    public void setCadence(double newCadence) {
        this.cadence = newCadence;
        this.setSpeed(newCadence + newCadence);
    }

    /**
     * Accelerates the bike, changing cadence.
     *
     * @param appliedNumber biking power
    */
    public void accelerate(double appliedNumber) {
        this.cadence = this.cadence + appliedNumber;
        this.setSpeed(this.getSpeed() + appliedNumber + appliedNumber);
    }

    /**
     * Rings the bike's bell.
    */
    public void ringBell() {
        System.out.println("Ding ding!\n");
    }
}
