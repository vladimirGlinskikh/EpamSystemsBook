package part_1.chapter_3.transfer;

public class TransferAction {
    private double transactionAmount;

    public TransferAction(double amount) {
        if (amount > 0) {
            this.transactionAmount = amount;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public boolean transferIntoAccount(Account from, Account to) {
        double demand = from.getAmount() - transactionAmount;
        if (demand >= 0) {
            from.setAmount(demand);
            to.addAmount(transactionAmount);
            return true;
        } else {
            return false;
        }
    }

    public double getTransactionAmount() {
        return transactionAmount;
    }
}
