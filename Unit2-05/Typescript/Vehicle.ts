/**
* This is the MrCoxallStack class
*
* By:      Evan Beaudoin
* Version: 1.0
* Since:   2024-04-04
*/ 

export class Vehicle {

    private _speed: number
    private _color: string
    private _plateNumber: string
    private _numberOfDoors: number
    private _maxSpeed: number
    
    // Creates the stack
    public constructor(color: string, plateNumber: string, numberOfDoors: number, maxSpeed: number) {
        this._color = color
        this._plateNumber = plateNumber
        this._numberOfDoors = numberOfDoors
        this._maxSpeed = maxSpeed
        this._speed = 0
    }

     // Gets the license plate number of the vehicle
  public get licensePlateNumber(): string {
    return this._plateNumber
  }

  // Gets the colour of the vehicle
  public get colour(): string {
    return this._color
  }

  // Gets the number of doors on the vehicle
  public get doors(): number {
    return this._numberOfDoors
  }

  // Gets the current speed of the vehicle
  public get speed(): number {
    return this._speed
  }

  // Gets the maximum speed of the vehicle
  public get maxSpeed(): number {
    return this._maxSpeed
  }

    // Sets the colour of the vehicle
  public set colour(newColor: string) {
    this._color = newColor
  }

  // Sets the license plate number of the vehicle
  public set licensePlateNumber(newPlateNumber: string) {
    this._plateNumber = newPlateNumber
  }

    public status() {
        console.log("  --> Speed: " + this._speed)
        console.log("  --> Max Speed: " + this._maxSpeed)
        console.log("  --> Number of doors: " + this._numberOfDoors)
        console.log("  --> License Plate: " + this._plateNumber)
        console.log("  --> Color: " + this._color)
    }

    public accelerate(accelerationPower: number, accelerationTime: number) {
        this._speed = (accelerationPower * accelerationTime) + this._speed
    }

    public break (breakPower: number, breakTime: number) {
        this._speed = this._speed - (breakPower * breakTime)
    }

}
