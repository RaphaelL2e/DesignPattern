package leeyf.factory.factory;

public class FactoryB implements FactoryMethod {
    @Override
    public Product create() {
        return new ProductB();
    }
}
