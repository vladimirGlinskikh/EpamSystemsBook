package part_1.chapter_4;

public class CardRunner {
    public static void main(String[] args) {
        CardAction dc1 = new CardAction();
        CardAction dc2 = new CreditCardAction();
        CreditCardAction cc = new CreditCardAction();
        dc1.doPayment(15.5);
        dc2.doPayment(7.0);
        cc.doPayment(21.2);
        cc.checkCreditLimit();
        ((CreditCardAction) dc2).checkCreditLimit();
    }
}
