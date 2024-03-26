/**
* This is the MrCoxallStack class
*
* By:      Evan Beaudoin
* Version: 1.0
* Since:   2024-03-25
*/ 

export class MrCoxallStack {
  // Stack that contains all of the string
  private _stackAsList: string[]

  // Creates the stack
  public constructor() {
    this._stackAsList = []
  }

  // Getter for stackAsList
  get stackAsList() {
    return this._stackAsList;
  }

  // Setter for stackAsList
  set stackAsList(stack: string[]) {
    this._stackAsList = stack;
  }

  // Pushes the values to the stack
  public push(stringPushed) {
    this._stackAsList.push(stringPushed)
  }

  // Returns the stack
  public showStack() {
    let stackItems = ""
    
    for (let counter = 0; counter < this._stackAsList.length; counter++) {
      // If statments ensures that comma is not printed at the start
      if (counter === 0) {
        stackItems += this._stackAsList[counter]
      } else {
        stackItems += ", " + this._stackAsList[counter]
      }
    }

    return stackItems
  }

  public popItem() {
    let returnValue = ""

    if (this._stackAsList.length > 0) {
      returnValue = this._stackAsList.pop()
    }
    else {
      console.log("Array is empty!")
    }
    return returnValue
  }
}
