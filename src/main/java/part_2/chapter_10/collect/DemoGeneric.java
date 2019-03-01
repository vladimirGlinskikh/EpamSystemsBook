package part_2.chapter_10.collect;

import java.util.ArrayList;
import java.util.List;

public class DemoGeneric {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("JavaFX 2");
        String res = list.get(0);
        System.out.println(list);
        System.out.println(res);
    }
}
