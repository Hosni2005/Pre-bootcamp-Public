package zooKeeper;

public class Gorilla extends Mammal{

	public Gorilla() {
		super();
	}
	public void throwSomething() {
		energy -= 5;
		System.out.println("The gorilla threw something!");
	}
	public void eatBanana() {
		energy += 10;
		System.out.println("The gorilla ate a banana.");
	}
	public void climb() {
		energy -=10;
		System.out.println("The gorilla climbed a tree");
	}
}
