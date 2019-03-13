package part_4.factorymethod;

public abstract class Creator {
    public abstract Product factoryMethod();

    public void anOperation() {
        System.out.println("operation");
    }
}
