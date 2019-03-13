package part_4.factorymethod;

public class ConcreteCreator extends Creator {
    @Override
    public Product factoryMethod() {
        this.anOperation();
        return new ConcreteProduct();
    }
}
