package part_1.chapter_6.accountLogic;

public interface AccountOperationManager {
    double depositInCash(int accountNumber, int amount);

    boolean withDraw(int accountNumber, int amount);

    boolean convert(double amount);

    boolean transfer(int accountNumber, double amount);
}
