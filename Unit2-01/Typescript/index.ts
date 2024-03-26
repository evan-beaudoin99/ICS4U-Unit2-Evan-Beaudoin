/**
* This is the main program
*
* By:      Evan Beaudoin
* Version: 1.0
* Since:   2024-03-25
*/ 

import { MrCoxallStack } from './MrCoxallStack'

// Uses MrCoxallStack
const fruitStack = new MrCoxallStack()
fruitStack.push("apple")
fruitStack.push("banana")
fruitStack.push("cherry")

const colorStack = new MrCoxallStack()
colorStack.push("red")
colorStack.push("green")
colorStack.push("blue")

const dogStack = new MrCoxallStack()
dogStack.push("poodle")
dogStack.push("retriever")
dogStack.push("beagle")

// Shows the fruit stack items
console.log("Fruit items:", fruitStack.showStack())

// Shows the color stack items
console.log("Color items:", colorStack.showStack())

// Shows the dog stack items
console.log("Dog items: ", dogStack.showStack())

// Show the program as done
console.log('\nDone.')
