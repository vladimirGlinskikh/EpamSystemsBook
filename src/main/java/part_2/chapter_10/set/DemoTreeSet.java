package part_2.chapter_10.set;

import java.util.*;

public class DemoTreeSet {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        boolean b;
        for (int i = 0; i < 6; i++) {
            list.add((int) (Math.random() * 10) + "Y ");
        }
        System.out.println(list + "список");

        Set<String> set = new TreeSet<>(list);
        System.out.println(set + "множество");

        System.out.println(((TreeSet<String>) set).comparator());
        System.out.println(((TreeSet<String>) set).last() + " " + ((TreeSet<String>) set).first());

        Set<String> hSet = new HashSet<>(set);
        for (String str : hSet) {
            System.out.println(str + "   " + str.hashCode());
        }
    }
}
