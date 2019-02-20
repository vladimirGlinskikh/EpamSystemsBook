package part_1.chapter_6.accountLogic;

public interface AccountBaseAction {
    boolean openAccount();

    boolean closeAccount();

    void blocking();

    void unBlocking();
}
