package barista;

public class TestOrders {
	public static void main(String[] args) {


        Item mocha = new Item("mocha", 3.50);
        Item latte = new Item("latte", 4.50);
        Item coffee = new Item("drip coffee", 1.50);
        Item cappuccino = new Item("cappuccino", 3.50);


        // Guests
        Order order1 = new Order();
        Order order2 = new Order();


        // Named orders
        Order order3 = new Order("Hosni");
        Order order4 = new Order("Ahmad");
        Order order5 = new Order("Leen");


        // Add items
        order1.addItem(mocha);
        order1.addItem(latte);

        order2.addItem(coffee);
        order2.addItem(cappuccino);

        order3.addItem(latte);
        order3.addItem(mocha);

        order4.addItem(coffee);
        order4.addItem(latte);

        order5.addItem(cappuccino);
        order5.addItem(mocha);


        // Ready status
        order1.setReady(true);
        order3.setReady(true);


        // Test status
        System.out.println(order1.getStatusMessage());
        System.out.println(order2.getStatusMessage());


        // Test total
        System.out.println(order1.getOrderTotal());


        // Display
        order1.display();
        order2.display();
        order3.display();
        order4.display();
        order5.display();
    }
}
