/**
* This is the main program
*
* By:      Evan Beaudoin
* Version: 1.0
* Since:   2024-04-01
*/ 

import { MrCoxallStack } from './MrCoxallStack'

const dogStack = new MrCoxallStack()

// Checksize of stack
console.log("The size of the stack is: ", dogStack.size)

// Check boolean is empty
console.log("Is the stack empty? ", dogStack.isEmpty)

dogStack.push("poodle")
dogStack.push("retriever")
dogStack.push("beagle")
// Shows the fruit stack items
console.log("Fruit items:", dogStack.showStack)
console.log("Popped Fruit Item: " + dogStack.popItem())
console.log("Fruit items: " + dogStack.showStack)

// Checksize of stack
console.log("The size of the stack is: ", dogStack.size)

// Check boolean is empty
console.log("Is the stack empty? ", dogStack.isEmpty)

// Peek the last item
console.log("The top item is: ", dogStack.peekItem())
console.log("Emptying the stack...")
dogStack.emptyStack()
console.log("The size of the stack is: ", dogStack.size)
console.log("Is the stack empty? ", dogStack.isEmpty)


console.log('\nDone.')
