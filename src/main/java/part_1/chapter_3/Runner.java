package part_1.chapter_3;

public class Runner {
    public static void main(String[] args) {
        Account from = new Account(78031864L, 258.5);
        Account to = new Account(58510009L, 12.1);
        TransferAction action = new TransferAction(52.0);
        boolean complete = action.transferIntoAccount(from, to);
        if (complete) {
            System.out.println("Сумма: " + action.getTransacionAmount() + " переведена успешно!");
            System.out.print("На счету клиента ID = " + to.getId());
            System.out.println(" находится сумма: " + to.getAmount());
            System.out.println("На счету клиента ID = " + from.getId() +
                    " остаток средств после транзакции: " + from.getAmount());
        } else {
            System.out.println("Транзакция не выполнена!");
            System.out.print("На счету клиента ID = " + from.getId());
            System.out.println(" недостаточно средств.");
        }
    }
}
