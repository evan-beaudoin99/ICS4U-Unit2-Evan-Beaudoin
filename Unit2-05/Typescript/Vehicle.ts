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

    public get speed() {
        return this._speed
    }

    public get color() {
        return this._color
    }

    set color(newColor: string) {
        this._color = newColor;
    }

    public status() {
        console.log("Speed: " + this._speed)
        console.log("Color: " + this._color)
        console.log("plateNumber: " + this._plateNumber)
        console.log("numberOfDoors: " + this._numberOfDoors)
        console.log("maxSpeed: " + this._maxSpeed)
    }

    public accelerate(accelerationPower: number, accelerationTime: number) {
        this._speed = (accelerationPower * accelerationTime) + this._speed
    }

    public break (breakPower: number, breakTime: number) {
        this._speed = this._speed - (breakPower * breakTime)
    }

}
