package com.axsosacademy.coffeapp.project;
import java.util.ArrayList;

public class Order {


	    private String customerName;
	    private ArrayList<Item> items;



	    public Order(String customerName){

	        this.customerName = customerName;
	        items = new ArrayList<Item>();

	    }



	    public void addItem(Item item){

	        items.add(item);

	    }



	    public double getTotal(){

	        double total = 0;

	        for(Item item : items){

	            total += item.getPrice();

	        }

	        return total;

	    }



	    public void displayOrder(){

	        System.out.println(
	        "Customer: " + customerName
	        );


	        System.out.println("Items:");

	        for(Item item : items){

	            System.out.println(
	            item.getName()
	            + " $" 
	            + item.getPrice()
	            );

	        }


	        System.out.println(
	        "Total: $" + getTotal()
	        );

	    }

	}

