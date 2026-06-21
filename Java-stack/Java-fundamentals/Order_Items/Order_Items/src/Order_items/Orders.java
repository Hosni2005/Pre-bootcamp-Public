package Order_items;

import java.util.ArrayList;

public class Orders {

    public String name;
    public double total;
    public boolean ready;
    public ArrayList<Items> items;

    public Orders() {
        name = "";
        total = 0.0;
        ready = false;
        items = new ArrayList<>();
    }
}