
/*
* This program sets the speed of an Airplane
*
* @author  Evan Beaudoin
* @version 1.0
* @since   2024-04-04
*/

/**
* This is the program.
*/
final class Main {
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
    public static void main(final String[] args) {

        final Airplane airplane = new Airplane();

        airplane.setSpeed(500);
        System.out.println("The speed of the airplane is " + airplane.speed + "km/h" );
    }
}
