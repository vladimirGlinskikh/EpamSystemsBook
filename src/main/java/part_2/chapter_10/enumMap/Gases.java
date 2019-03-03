package part_2.chapter_10.enumMap;

import java.util.EnumMap;

public class Gases {
    public static void main(String[] args) {
        EnumMap<GASStation, Integer> station1 =
                new EnumMap<>(GASStation.class);
        station1.put(GASStation.DT, 10);
        station1.put(GASStation.A80, 5);
        station1.put(GASStation.A92, 30);

        EnumMap<GASStation, Integer> station2 =
                new EnumMap<>(GASStation.class);
        station2.put(GASStation.DT, 25);
        station2.put(GASStation.A95, 25);

        System.out.println(station1);
        System.out.println(station2);
    }
}
