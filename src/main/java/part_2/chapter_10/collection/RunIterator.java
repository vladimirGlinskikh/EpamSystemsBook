package part_2.chapter_10.collection;

import java.util.ArrayList;
import java.util.List;

public class RunIterator {
    public static void main(String[] args) {
        List<Order> orders = new ArrayList<>() {
            {
                add(new Order(231, 12.f));
                add(new Order(389, 2.9f));
                add(new Order(217, 1.7f));
                add(new Order(356, 23.f));
            }
        };
        FindOrder fo = new FindOrder();
        List<Order> res = fo.findBiggerAmountOrder(14f, orders);
        System.out.println(res);
    }
}
