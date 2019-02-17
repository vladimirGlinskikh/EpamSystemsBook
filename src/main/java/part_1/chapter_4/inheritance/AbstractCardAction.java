package part_1.chapter_4.inheritance;

public abstract class AbstractCardAction {
    private int id;

    public AbstractCardAction() {
    }

    public boolean checkLimit() {
        return true;
    }

    public abstract void doPayment(double amountPayment);
}
