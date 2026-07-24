import { Ninja } from "./Ninja.js";

class Sensei extends Ninja {
    constructor (name) {
        super(name);
        this.health = 200;
        this.speed = 10;
        this.strength = 10
        this.wisdom = 10;
    }

    speakWisdom(){
        super.drinkSake();
        console.log("What one programmer can do in one month")
    }
}

const superSensei = new Sensei("Master Splinter");
superSensei.speakWisdom();
superSensei.showStats();