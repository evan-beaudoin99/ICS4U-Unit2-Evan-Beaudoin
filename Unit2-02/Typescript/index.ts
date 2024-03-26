/**
* This is the main program
*
* By:      Evan Beaudoin
* Version: 1.0
* Since:   2024-03-25
*/ 

import { MrCoxallStack } from './MrCoxallStack'

const fruitStack = new MrCoxallStack()
fruitStack.push("apple")
fruitStack.push("banana")
fruitStack.push("cherry")
// Shows the fruit stack items
console.log("Fruit items:", fruitStack.showStack())
console.log("Popped Fruit Item: " + fruitStack.popItem())
console.log("Fruit items: " + fruitStack.showStack())

const colorStack = new MrCoxallStack()
colorStack.push("red")
colorStack.push("green")
colorStack.push("blue")
// Shows the color stack items
console.log("\nColor items:", fruitStack.showStack())
console.log("Popped Color Item: " + colorStack.popItem())
console.log("Color items: " + colorStack.showStack())

const dogStack = new MrCoxallStack()
dogStack.push("poodle")
dogStack.push("retriever")
dogStack.push("beagle")
// Shows the dog stack items
console.log("\nDog items:", dogStack.showStack())
console.log("Dog Fruit Item: " + dogStack.popItem())
console.log("Dog items: " + dogStack.showStack())


// Show the program as done
console.log('\nDone.')
