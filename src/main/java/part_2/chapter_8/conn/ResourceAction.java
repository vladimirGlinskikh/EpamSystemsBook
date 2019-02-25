package part_2.chapter_8.conn;

public class ResourceAction {
    public void doAction() {
        SameResource sr = null;
        try {
            sr = new SameResource();
            sr.execute();
        } finally {
            if (sr != null) {
                sr.close();
            }
        }
        System.out.println("after finally");
    }

    public static void main(String[] args) {
        ResourceAction resourceAction = new ResourceAction();
        resourceAction.doAction();
    }
}
