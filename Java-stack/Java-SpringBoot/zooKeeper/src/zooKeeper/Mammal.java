package zooKeeper;

public class Mammal {
 protected int energy;
//Default constructor
 public Mammal() {
	this.energy = 100 ;
 }
//Constructor with custom energy
 public Mammal(int energy) {
	super();
	this.energy = energy;
 }
//Display energy
 public int displayEnergy() {
	 System.out.println("Current Energy : " + energy);
	 return energy;
 }
}
