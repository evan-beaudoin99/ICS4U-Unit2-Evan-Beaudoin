/**
* This is the main program
*
* By:      Evan Beaudoin
* Version: 1.0
* Since:   2024-03-25
*/ 

import { MrCoxallStack } from './MrCoxallStack'

const fruitStack = new MrCoxallStack()

// Checksize of stack
console.log("The size of the stack is: ", fruitStack.size)

// Check boolean is empty
console.log("Is the stack empty? ", fruitStack.isEmpty)

fruitStack.push("apple")
fruitStack.push("banana")
fruitStack.push("cherry")
// Shows the fruit stack items
console.log("Fruit items:", fruitStack.showStack)
console.log("Popped Fruit Item: " + fruitStack.popItem())
console.log("Fruit items: " + fruitStack.showStack)

// Checksize of stack
console.log("The size of the stack is: ", fruitStack.size)

// Check boolean is empty
console.log("Is the stack empty? ", fruitStack.isEmpty)

console.log('\nDone.')
