/**
* This is the MrCoxallStack class
*
* By:      Evan Beaudoin
* Version: 1.0
* Since:   2024-03-25
*/ 

export class MrCoxallStack {
  // Stack that contains all of the string
  private stackAsList

  // Creates the stack
  public constructor() {
    this.stackAsList = []
  }

  // Pushes the values to the stack
  public push(stringPushed) {
    this.stackAsList.push(stringPushed)
  }

  // Returns the stack
<<<<<<< HEAD
 public showStack() { 
    let stackItems = ""

    for (let counter = 0; counter < this.stackAsList.length; counter++) {
      stackItems = this.stackAsList[counter] + ","
=======
  public showStack() {
    let stackItems = ""
    
    for (let counter = 0; counter < this.stackAsList.length; counter++) {
      // If statments ensures that comma is not printed at the start
      if (counter === 0) {
        stackItems += this.stackAsList[counter]
      } else {
        stackItems += ", " + this.stackAsList[counter]
      }
>>>>>>> e6811b81890338a20d8f7d186b97a12c942bde10
    }

    return stackItems
  }
}
