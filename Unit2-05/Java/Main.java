/*
* This is the main code that runs
* with the Vehicle Class.
* By:      Mr Coxall
* Version: 1.0
* Since:   2020-01-01
*/

/**
* This is the program.
*/
final class Main {
    /*
     Constants.
     */
    public static final int FORD_DOORS = 4;

    /*
     Constants.
     */
    public static final int FORDMAXSPEED = 284;

    /*
     Constants.
     */
    public static final int FORD_ACCELERATION = 10;

    /*
     Constants.
     */
    public static final int FERRARI_DOORS = 2;

    /*
     Constants.
     */
    public static final int FERRARI_MAX_SPEED = 320;

    /*
     Constants.
     */
    public static final int FERRARI_ACCELERATION = 100;

    /*
     Constants.
     */
    public static final int FERRARI_ACCLERATION_TIME = 4;

    /*
     Constants.
     */
    public static final int FERRARI_BREAK = 10;

    /*
     Constants.
     */
    public static final int CITROEN_DOORS = 2;

    /*
     Constants.
     */
    public static final int CITROEN_MAX_SPEED = 45;

    /*
     Constants.
     */
    public static final int CITROEN_ACCELERATION = 5;

    /*
     Constants.
     */
    public static final int CITROEN_BREAK = 2;

    /*
     Constants.
     */
    public static final int ACCELERATION_TIME = 10;

    /*
     Constants.
     */
    public static final int STATUS = "Status";
    
    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this is ever called
    *
    * @throws IllegalStateException if this is ever called
    *
    */
    private Main() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */

    public static void main(String[] args) {
        System.out.println("Created Ford focus");
        final Vehicle fordFocus = new Vehicle("white", "B40-C4RR0", FORD_DOORS, FORDMAXSPEED);

        System.out.println(STATUS);
        fordFocus.status();

        System.out.println("Accelerating, 10 of power for 10 sec.");
        fordFocus.accelerate(FORD_ACCELERATION, ACCELERATION_TIME);
        System.out.println("New speed: " + fordFocus.getSpeed());

        System.out.println("Changing colour to black:");
        fordFocus.setColor("black");
        System.out.println("New color: " + fordFocus.getColor());

        System.out.println();

        // new Ferrari
        System.out.println("Created a Ferrari");
        final Vehicle ferrari = new Vehicle("red", "VHD-35HU", FERRARI_DOORS, FERRARI_MAX_SPEED);

        System.out.println(STATUS);
        ferrari.status();

        System.out.println("Accelerating, 100 of power for 4 sec.");
        ferrari.accelerate(FERRARI_ACCELERATION, FERRARI_ACCLERATION_TIME);
        System.out.println("New speed: " + ferrari.getSpeed());

        System.out.println("Breaking, 10 of power for 10 sec.");
        ferrari.brake(FERRARI_BREAK, ACCELERATION_TIME);
        System.out.println("New speed: " + ferrari.getSpeed());

        System.out.println("Changing color:");
        ferrari.setColor("racing red!");
        System.out.println("New color: " + ferrari.getColor());

        System.out.println();

        // new Citroen Ami
        System.out.println("Created a Citroen Ami");
        final Vehicle citroenAmi = new Vehicle("blue", "FS-695-DQ", CITROEN_DOORS, CITROEN_MAX_SPEED);

        System.out.println(STATUS);
        citroenAmi.status();

        System.out.println("Accelerating, 5 of power for 10 sec.");
        citroenAmi.accelerate(CITROEN_ACCELERATION, ACCELERATION_TIME);
        System.out.println("New speed: " + citroenAmi.getSpeed());

        System.out.println("Breaking, 2 of power for 10 sec.");
        citroenAmi.brake(CITROEN_BREAK, ACCELERATION_TIME);
        System.out.println("New speed: " + citroenAmi.getSpeed());

        System.out.println("Changing color:");
        citroenAmi.setColor("purple");
        System.out.println("New color: " + citroenAmi.getColor());

        System.out.println("\nDone.");
    }
}

