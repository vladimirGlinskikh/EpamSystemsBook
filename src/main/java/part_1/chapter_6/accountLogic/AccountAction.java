package part_1.chapter_6.accountLogic;

public interface AccountAction {
    boolean openAccount();

    boolean closeAccount();

    void blocking();

    void unBlocking();

    double depositInCash(int accountNumber, int amout);

    boolean withDraw(int accountNumber, int amount);

    boolean convert(double amount);

    boolean transfer(double amount);
}
