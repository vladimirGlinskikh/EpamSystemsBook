package part_1.chapter_4.inheritance;

public class CreditCardAction extends AbstractCardAction {
    @Override
    public void doPayment(double amountPayment) {
        System.out.println("Complete from credit card!");
    }
}
