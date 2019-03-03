package part_2.chapter_10.check;

import part_2.chapter_10.collection.Item;
import part_2.chapter_10.collection.Order;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SafeSetRun {
    public static void main(String[] args) {
        Set orders = Collections.checkedSet(new HashSet<>(), Order.class);
        orders.add(new Order(3, 8.f));
        orders.add(new Item(2, 4.f, "priceName"));
        System.out.println(orders);
    }
}
