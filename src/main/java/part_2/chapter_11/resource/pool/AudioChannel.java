package part_2.chapter_11.resource.pool;

public class AudioChannel {
    private int channellId;

    public AudioChannel(int id) {
        super();
        this.channellId = id;
    }

    public int getChannellId() {
        return channellId;
    }

    public void setChannellId(int id) {
        this.channellId = id;
    }

    public void using() {
        try {
            Thread.sleep(new java.util.Random().nextInt(500));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
