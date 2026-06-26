package com.axsosacademy.coffeapp.project;

import java.util.ArrayList;
import java.util.Scanner;

public class CoffeApp {

    private ArrayList<Item> menu;
    private ArrayList<Order> orders;

    public CoffeApp() {
        menu = new ArrayList<Item>();
        orders = new ArrayList<Order>();
    }

    public void addMenuItem(String name, double price) {

        Item item = new Item(name, price);

        item.setIndex(menu.size());

        menu.add(item);
    }

    public void addMenuItemByInput() {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter item name:");
        String name = input.nextLine();

        System.out.println("Enter item price:");
        String priceInput = input.nextLine();

        double price = Double.parseDouble(priceInput);

        addMenuItem(name, price);

        System.out.println("Item added successfully");
    }

    public void displayMenu() {

        for (Item item : menu) {

            System.out.println(item.getInfo());

        }
    }

    public void newOrder() {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter customer name for new order:");

        String name = input.nextLine();

        Order order = new Order(name);

        displayMenu();

        System.out.println("Please enter a menu item index or q to quit:");

        String itemNumber = input.nextLine();

        while (!itemNumber.equals("q")) {

            int index = Integer.parseInt(itemNumber);

            Item item = menu.get(index);

            order.addItem(item);

            System.out.println("Please enter a menu item index or q to quit:");

            itemNumber = input.nextLine();
        }

        orders.add(order);

        order.displayOrder();
    }
}