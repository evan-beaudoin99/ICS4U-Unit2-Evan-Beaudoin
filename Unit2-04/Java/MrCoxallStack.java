/*
* This class defines a string stack
*
* @author  Evan Beaudoin
* @version 1.0
* @since   2024-04-01
*/

import java.util.ArrayList;
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
     * Constructs a new instance of MrCoxallStack.
     * Initializes the stack with an empty ArrayList.
     *
    */
    public MrCoxallStack() {
        this.stackAsList = new ArrayList<>();
    }

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

    /**
     * Checks if the array is empty.
     *
     * @return the bool that says whether the array is empty or not
    */
    public boolean isEmpty() {
        boolean empty = false;

        if (this.stackAsList.size() == 0) {
            empty = true;
        }

        return empty;
    }

    /**
     * Checks the size of the array.
     *
     * @return the array's length
    */
    public int size() {
        return this.stackAsList.size();
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
    public String pop() {
        if (stackAsList.isEmpty()) {
            throw new IllegalStateException("stack is empty.");
        }

        return stackAsList.remove(stackAsList.size() - 1);
    }

    /**
     * Returns the last stack value.
     *
     * @return the last value.
     *
     * @throws IllegalStateException if this is ever called
    */
    public String peekItem() {
        if (stackAsList.isEmpty()) {
            throw new IllegalStateException("Stack is empty.");
        }

        return stackAsList.get(stackAsList.size() - 1);
    }

    /**
     * Clears the stack.
    */
    public void emptyStack() {
        this.stackAsList.clear();
    }
}
