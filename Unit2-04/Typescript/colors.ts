/**
* This is the main program
*
* By:      Evan Beaudoin
* Version: 1.0
* Since:   2024-04-01
*/ 

import { MrCoxallStack } from './MrCoxallStack'

const colorStack = new MrCoxallStack()

// Checksize of stack
console.log("The size of the stack is: ", colorStack.size)

// Check boolean is empty
console.log("Is the stack empty? ", colorStack.isEmpty)

colorStack.push("red")
colorStack.push("green")
colorStack.push("blue")
// Shows the fruit stack items
console.log("Fruit items:", colorStack.showStack)
console.log("Popped Fruit Item: " + colorStack.popItem())
console.log("Fruit items: " + colorStack.showStack)

// Checksize of stack
console.log("The size of the stack is: ", colorStack.size)

// Check boolean is empty
console.log("Is the stack empty? ", colorStack.isEmpty)

// Peek the last item
console.log("The top item is: ", colorStack.peekItem())
console.log("Emptying the stack...")
colorStack.emptyStack()
console.log("The size of the stack is: ", colorStack.size)
console.log("Is the stack empty? ", colorStack.isEmpty)

console.log('\nDone.')
