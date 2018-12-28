package part_1.chapter_3;

public class TransferAction {
    private double transacionAmount;

    public TransferAction(double amount) {
        if (amount > 0) {
            this.transacionAmount = amount;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public boolean transferIntoAccount(Account from, Account to) {
        double demand = from.getAmount() - transacionAmount;
        if (demand >= 0) {
            from.setAmount(demand);
            to.addAmount(transacionAmount);
            return true;
        } else {
            return false;
        }
    }

    public double getTransacionAmount() {
        return transacionAmount;
    }
}
