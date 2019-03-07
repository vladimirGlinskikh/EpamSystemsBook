package part_2.chapter_11.phaser;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Phaser;

public class PhaserDemo {
    public static void main(String[] args) {
        Item[] goods = new Item[20];
        for (int i = 0; i < goods.length; i++) {
            goods[i] = new Item(i + 1);
        }

        List<Item> listGood = Arrays.asList(goods);
        Storage storageA = Storage.createStorage(listGood.size(), listGood);
        Storage storageB = Storage.createStorage(listGood.size());

        Phaser phaser = new Phaser();
        phaser.register();
        int currentPhase;

        Thread tr1 = new Thread(new Truck(phaser, "tr1", 5, storageA, storageB));
        Thread tr2 = new Thread(new Truck(phaser, "tr2", 6, storageA, storageB));
        Thread tr3 = new Thread(new Truck(phaser, "tr3", 7, storageA, storageB));

        printGoodsToConsole("Товары на складе A", storageA);
        printGoodsToConsole("Товары на складе B", storageB);

        tr1.start();
        tr2.start();
        tr3.start();
        currentPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Загрузка колонны завершена. Фаза " + currentPhase

                + " завершена.");

        currentPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Поездка колонны завершена. Фаза " + currentPhase

                + " завершена.");
        currentPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Разгрузка колонны завершена. Фаза " + currentPhase

                + " завершена.");
        phaser.arriveAndDeregister();
        if (phaser.isTerminated()) {

            System.out.println("Фазы синхронизированы и завершены.");
        }
        printGoodsToConsole("Товары на складе A", storageA);
        printGoodsToConsole("Товары на складе B", storageB);
    }

    public static void printGoodsToConsole(String title, Storage storage) {
        System.out.println(title);
        Iterator<Item> goodIterator = storage.iterator();
        while (goodIterator.hasNext()) {
            System.out.print(goodIterator.next().getRegistrationNumber() + " ");
        }
        System.out.println();
    }
}
