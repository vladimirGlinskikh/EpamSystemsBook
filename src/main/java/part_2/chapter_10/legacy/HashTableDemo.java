package part_2.chapter_10.legacy;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo {
    public static void main(String[] args) {
        Map<Integer, Double> ht = new Hashtable<>() {
            {
                for (int i = 0; i < 5; i++) {
                    put(i, Math.atan(i));
                }
            }
        };
        Enumeration<Integer> ek = ((Hashtable<Integer, Double>) ht).keys();
        int key;
        while (ek.hasMoreElements()) {
            key = ek.nextElement();
            System.out.printf("%4d ", key);
        }
        System.out.println("");
        Enumeration<Double> ev = ((Hashtable<Integer, Double>) ht).elements();
        double value;
        while (ev.hasMoreElements()) {
            value = ev.nextElement();
            System.out.printf("%.2f ", value);
        }
    }
}
