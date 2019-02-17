package part_1.chapter_4.inheritance;

public class Runner {
    public static void main(String[] args) {
        AbstractCardAction action = new CreditCardAction();
        action.doPayment(100);
    }
}
