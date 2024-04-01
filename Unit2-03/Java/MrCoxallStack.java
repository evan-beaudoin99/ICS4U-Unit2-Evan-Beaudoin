/*
* This class defines a string stack
*
* @author  Evan Beaudoin
* @version 1.0
* @since   2024-03-25
*/

import java.util.List;

/**
 * This is the class.
*/
public class MrCoxallStack {
    /**
     * Adds strings to an array.
     *
     * @param array contains the array of strings
    */
    private List<String> stackAsList;

    /**
    * Returns the stack value.
    *
    * @return the values of the list formatted
    */
    public String showStack() {
        final StringBuilder stackValues = new StringBuilder();
        // https://www.javatpoint.com/StringBuilder-class

        for (String value : this.stackAsList) {
            stackValues.append(value).append(", ");
        }

        stackValues.deleteCharAt(stackValues.length() - 2);

        return stackValues.toString();
    }

    // Getter for stack size
    public int size() {
        return stackAsList.size();
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return stackAsList.isEmpty();
    }

    /**
     * Pushes the string to a list.
     *
     * @param string the string that is going to be pushed
    */
    public void push(String string) {
        this.stackAsList.add(string);
    }

    /**
     * Returns the stack value.
     *
     * @return the values of the list formatted
     *
     * @throws IllegalStateException if this is ever called
    */
    public String popItem() {
        if (stackAsList.isEmpty()) {
            throw new IllegalStateException("Stack is empty.");
        }

        return stackAsList.remove(stackAsList.size() - 1);
    }
}
