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
    final public static int FORDMAXSPEED = 284;

    /*
     Constants.
    */
    final public static int fordDoors = 4;

    /*
     Constants.
    */
    final public static int ferrariDoors = 2;

    /*
    Constants.
    */
    final public static int ferrariMaxSpeed = 320;

        /*
    Constants.
    */
    final public static int fordDoors = 4;

    /*
    Constants.
    */
    final public static int citroenDoors = 2;

    /*
    Constants.
    */
    final public static int citroenMaxSpeed = 45;

        /*
    Constants.
    */
    final public static int fordDoors = 4;

    /*
    Constants.
    */
    final public static int fordDoors = 4;

    /*
    Constants.
    */
    final public static int fordDoors = 4;
    
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
        final Vehicle fordFocus = new Vehicle("white", "B40-C4RR0", fordDoors, fordMaxSpeed);

        System.out.println("Status:");
        fordFocus.status();

        System.out.println("Accelerating, 10 of power for 10 sec.");
        fordFocus.accelerate(10, 10);
        System.out.println("New speed: " + fordFocus.getSpeed());

        System.out.println("Changing colour to black:");
        fordFocus.setColor("black");
        System.out.println("New color: " + fordFocus.getColor());

        System.out.println();

        // new Ferrari
        System.out.println("Created a Ferrari");
        final Vehicle ferrari = new Vehicle("red", "VHD-35HU", 2, 320);

        System.out.println("Status:");
        ferrari.status();

        System.out.println("Accelerating, 100 of power for 4 sec.");
        ferrari.accelerate(100, 4);
        System.out.println("New speed: " + ferrari.getSpeed());

        System.out.println("Breaking, 10 of power for 10 sec.");
        ferrari.brake(10, 10);
        System.out.println("New speed: " + ferrari.getSpeed());

        System.out.println("Changing color:");
        ferrari.setColor("racing red!");
        System.out.println("New color: " + ferrari.getColor());

        System.out.println();

        // new Citroen Ami
        System.out.println("Created a Citroen Ami");
        final Vehicle citroenAmi = new Vehicle("blue", "FS-695-DQ", 2, 45);

        System.out.println("Status:");
        citroenAmi.status();

        System.out.println("Accelerating, 5 of power for 10 sec.");
        citroenAmi.accelerate(5, 10);
        System.out.println("New speed: " + citroenAmi.getSpeed());

        System.out.println("Breaking, 2 of power for 10 sec.");
        citroenAmi.brake(2, 10);
        System.out.println("New speed: " + citroenAmi.getSpeed());

        System.out.println("Changing color:");
        citroenAmi.setColor("purple");
        System.out.println("New color: " + citroenAmi.getColor());

        System.out.println("\nDone.");
    }
}

