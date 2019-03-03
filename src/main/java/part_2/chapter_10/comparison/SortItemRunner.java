package part_2.chapter_10.comparison;

import part_2.chapter_10.collection.Item;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortItemRunner {
    public static void main(String[] args) {
        List<Item> p = new ArrayList<>() {
            {
                add(new Item(52201, 9.75f, "T-Shirt"));
                add(new Item(52127, 13.99f, "Dress"));
                add(new Item(47063, 45.95f, "Jeans"));
                add(new Item(74859, 60.9f, "Gloves"));
                add(new Item(23904, 31f, "Shirt"));
                add(new Item(98452, 14.8f, "Tie"));
            }
        };
        Comparator<Item> comp = new Comparator<Item>() {
            @Override
            public int compare(Item one, Item two) {
                return Double.compare(two.getPrice(), one.getPrice());
            }
        };
        Collections.sort(p, comp);
        System.out.println(p);
    }
}
