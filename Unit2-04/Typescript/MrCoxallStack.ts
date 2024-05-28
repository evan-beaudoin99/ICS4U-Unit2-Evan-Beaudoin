/**
* This is the MrCoxallStack class
*
* By:      Evan Beaudoin
* Version: 1.0
* Since:   2024-04-01
*/ 

export class MrCoxallStack {
  // Stack that contains all of the string
  private _stackAsList: string[]

  // Creates the stack
  public constructor() {
    this._stackAsList = []
  }

  // Getter for stackAsList
  public get showStack() {
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

  // Checks if the stack is empty
  public get isEmpty() {
  let empty = false
    if (this._stackAsList.length == 0) {
      empty = true
    }
    return empty
  }
  // returns number of elemnts in stack
  public get size() {
      return this._stackAsList.length
  }

  // Pushes the values to the stack
  public push(stringPushed) {
    this._stackAsList.push(stringPushed)
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

  public peekItem() {
    let returnValue = ""

    if (this._stackAsList.length > 0) {
      returnValue = this._stackAsList[this._stackAsList.length - 1]
    }
    else {
      console.log("Array is empty")
    }
    return returnValue
  }
  public emptyStack() {
    this._stackAsList = ""
    return this._stackAsList
  }
}

