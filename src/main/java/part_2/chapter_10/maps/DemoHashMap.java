package part_2.chapter_10.maps;

import java.util.*;

public class DemoHashMap {
    public static void main(String[] args) {
        Map<String, Integer> hm = new HashMap<>(3) {
            {
                this.put("Сырок", 3);
                this.put("Пряник", 5);
                this.put("Молоко", 1);
                this.put("Хлеб", 1);
            }
        };

        System.out.println(hm);
        hm.put("Пряник", 4);
        System.out.println(hm + " после замены элемента");
        Integer a = hm.get("Хлеб");
        System.out.println(a + " - найден по ключу 'Хлеб'");

        Set<Map.Entry<String, Integer>> setV = hm.entrySet();
        System.out.println(setV);

        Iterator<Map.Entry<String, Integer>> i = setV.iterator();
        while (i.hasNext()) {
            Map.Entry<String, Integer> me = i.next();
            System.out.println(me.getKey() + " : " + me.getValue());
        }
        Set<Integer> val = new HashSet<>(hm.values());
        System.out.println(val);
    }
}
