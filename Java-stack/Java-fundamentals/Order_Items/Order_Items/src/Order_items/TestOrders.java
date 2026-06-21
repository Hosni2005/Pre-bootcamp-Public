package Order_items;

public class TestOrders {

    public static void main(String[] args) {

        // Items
        Items item1 = new Items("mocha", 3.50);
        Items item2 = new Items("latte", 4.50);
        Items item3 = new Items("drip coffee", 5.50);
        Items item4 = new Items("cappuccino", 6.50);

        // Orders
        Orders order1 = new Orders();
        Orders order2 = new Orders();
        Orders order3 = new Orders();
        Orders order4 = new Orders();

        // Customer names
        order1.name = "Rami";
        order2.name = "Jimmy";
        order3.name = "Noah";
        order4.name = "Sam";

        // Jimmy ordered a mocha
        order2.items.add(item1);
        order2.total += item1.price;

        // Noah ordered a cappuccino
        order3.items.add(item4);
        order3.total += item4.price;

        // Sam ordered a latte
        order4.items.add(item2);
        order4.total += item2.price;

        // Rami's order is ready
        order1.ready = true;

        // Sam ordered 2 more lattes
        order4.items.add(item2);
        order4.items.add(item2);
        order4.total += item2.price * 2;

        // Jimmy's order is ready
        order2.ready = true;

        // Print all orders
        System.out.println("===== Order 1 =====");
        System.out.println("Name: " + order1.name);
        System.out.println("Total: $" + order1.total);
        System.out.println("Ready: " + order1.ready);

        System.out.println("\n===== Order 2 =====");
        System.out.println("Name: " + order2.name);
        System.out.println("Total: $" + order2.total);
        System.out.println("Ready: " + order2.ready);

        System.out.println("\n===== Order 3 =====");
        System.out.println("Name: " + order3.name);
        System.out.println("Total: $" + order3.total);
        System.out.println("Ready: " + order3.ready);

        System.out.println("\n===== Order 4 =====");
        System.out.println("Name: " + order4.name);
        System.out.println("Total: $" + order4.total);
        System.out.println("Ready: " + order4.ready);
    }
}