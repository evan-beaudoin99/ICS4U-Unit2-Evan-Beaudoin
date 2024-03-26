/*
* This program uses a basic class to make an array of integers
*
* @author  Evan Beaudoin
* @version 1.0
* @since   2024-03-26
*/

/**
* This is the program.
*/
final class Main {
    /*
    * Constants
    */
    final String FRUIT_ITEM = "Fruit Item: "

    /*
    * Constants
    */
    final String COLOR_ITEM = "Color Item: "

    /*
    * Constants
    */
    final String DOG_ITEM = "Dog Item: "
    
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
        // Add fruit stack
        final MrCoxallStack fruitStack = new MrCoxallStack();
        fruitStack.push("apple");
        fruitStack.push("banana");
        fruitStack.push("cherry");

        // Add color stack
        final MrCoxallStack colorStack = new MrCoxallStack();
        colorStack.push("red");
        colorStack.push("green");
        colorStack.push("blue");

        // Add dog stack
        final MrCoxallStack dogStack = new MrCoxallStack();
        dogStack.push("poodle");
        dogStack.push("retriever");
        dogStack.push("beagle");

        // Show stack
        System.out.println("Fruit Items: " + fruitStack.showStack());
        System.out.println("Fruit Items: " + fruitStack.popItem());
        System.out.println("Fruit Items: " + fruitStack.showStack());
      
        System.out.println("\nColor items: " + colorStack.showStack());
        System.out.println("Color Items: " + colorStack.popItem());
        System.out.println("Color Items: " + colorStack.showStack());

        System.out.println("\nDog items: " + dogStack.showStack());
        System.out.println("Dog Items: " + dogStack.popItem());
        System.out.println("Dog Items: " + dogStack.showStack());

        // Show the program as done
        System.out.println("\nDone.");
    }
}
