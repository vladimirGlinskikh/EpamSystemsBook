package part_4.factorymethod;

public class ConcreteProduct implements Product {
    @Override
    public void check() {
        System.out.println("concrete product");
    }
}
