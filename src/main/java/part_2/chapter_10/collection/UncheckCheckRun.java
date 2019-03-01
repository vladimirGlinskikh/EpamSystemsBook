package part_2.chapter_10.collection;

import java.util.ArrayList;
import java.util.List;

public class UncheckCheckRun {
    public static void main(String[] args) {
        List raw = new ArrayList() {
            {
                add(new Order(231, 12.f));
                add(new Item(23154, 120.f, "Xerox"));
                add(new Order(217, 1.7f));
            }
        };
        Order or1 = (Order) raw.get(0);
        Item or2 = (Item) raw.get(1);
        Order or3 = (Order) raw.get(2);

        for (Object ob : raw) {
            System.out.println("raw " + ob);
        }

        List<Order> orders = new ArrayList<>() {
            {
                add(new Order(231, 12.f));
                add(new Order(389, 2.9f));
                add(new Order(217, 1.7f));
            }
        };
        for (Order ob : orders) {
            System.out.println("Order: " + ob);
        }
    }
}
