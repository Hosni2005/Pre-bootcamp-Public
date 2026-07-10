package zooKeeper;

public class ZooTest {
public static void main(String[] args) {
	System.out.println("===Gorilla Test===");
	Gorilla gorilla = new Gorilla();
	gorilla.throwSomething();
	gorilla.throwSomething();
	gorilla.throwSomething();
	
	gorilla.eatBanana();
	gorilla.eatBanana();
	
	gorilla.climb();
	
	gorilla.displayEnergy();
	
	System.out.println("===Bat Test===");
	
	Bat bat = new Bat();

    bat.attackTown();
    bat.attackTown();
    bat.attackTown();

    bat.eatHumans();
    bat.eatHumans();

    bat.fly();
    bat.fly();

    bat.displayEnergy();
}
}
