import { Card } from "./Card.js"


export class Unit extends Card{
    constructor(name , cost , power , resilience){
        super(name , cost)
        this.power = power;
        this.resilience = resilience;
    }

    attack(t){
        if (t instanceof Unit){
            t.resilience -= this.power;
        }else{
            console.log("Target must be a unit!");
        }
    }
    
}