class Sensei extends Ninja {
    constructor () {
        super()
        this.wisdom = 10;
    }

    speakWisdom(){
        console.log(this.drinkSake())
    }
}

const superSensei = new Sensei("Master Splinter");
superSensei.speakWisdom();
superSensei.showStats();