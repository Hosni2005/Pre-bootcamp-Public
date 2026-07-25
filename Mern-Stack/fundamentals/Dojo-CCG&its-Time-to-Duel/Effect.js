import { Card } from "./Card.js";
import { Unit } from "./Unit.js";

class Effect extends Unit{
    constructor(name , cost , desc , stats, magnitude){
        super(name , cost);
        this.desc = desc;
        this.stats = stats;
        this.magnitude = magnitude;
    }
    play(t){
        if (t instanceof Unit){
            if (this.name === "Hard Algorithm"){
                t.resilience +=3;
            }if (this.name === "Unhandled Promise Rejection") {
                t.resilience -= 2;
            } else {
                console.log("target must be a unit ")
            }
        }
}
    play2(target){
        if (!(target instanceof Unit)){
            console.log("target must be a Unit")
        }
        if (this.stats === "power"){
            target.power += this.magnitude;
        }
        if (this.stats === "resilience"){
            target.resilience += this.magnitude
        }
    }
}

// ====================**first one**====================

const redBeltNinja = new Unit("Red Belt Ninja", 3, 3, 4);

const hardAlgorithm = new Effect(
    "Hard Algorithm",
    2,
    "Increase target's resilience by 3",
    "resilience",
    3
);

hardAlgorithm.play(redBeltNinja);

// ====================**second one**====================

const blackBeltNinja = new Unit("Black Belt Ninja", 4, 5, 4);

const unhandledPromiseRejection = new Effect(
    "Unhandled Promise Rejection",
    1,
    "Reduce target's resilience by 2",
    "resilience",
    -2
);

unhandledPromiseRejection.play(redBeltNinja);

// ====================**third one**====================

const pairProgramming = new Effect(
    "Pair Programming",
    3,
    "Increase target's power by 2",
    "power",
    2
);

pairProgramming.play(redBeltNinja);

// Red Belt Ninja attacks Black Belt Ninja
redBeltNinja.attack(blackBeltNinja);

// Print the results
console.log(redBeltNinja);
console.log(blackBeltNinja);