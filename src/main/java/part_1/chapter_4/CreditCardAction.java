package part_1.chapter_4;

public class CreditCardAction extends CardAction {
    public boolean checkCreditLimit() {
        return true;
    }

    @Override
    public void doPayment(double amountPayment) {
        System.out.println("complete from credit card");
    }
}
