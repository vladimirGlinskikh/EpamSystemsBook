package part_2.chapter_11.resource.main;

import part_2.chapter_11.resource.pool.AudioChannel;
import part_2.chapter_11.resource.pool.ChannelPool;
import part_2.chapter_11.resource.pool.Client;

import java.util.LinkedList;

public class Runner {
    public static void main(String[] args) {
        LinkedList<AudioChannel> list = new LinkedList<>() {
            {
                this.add(new AudioChannel(771));
                this.add(new AudioChannel(883));
                this.add(new AudioChannel(550));
                this.add(new AudioChannel(337));
                this.add(new AudioChannel(442));
            }
        };

        ChannelPool<AudioChannel> pool = new ChannelPool<>(list);
        for (int i = 0; i < 20; i++) {
            new Client(pool).start();
        }
    }
}
