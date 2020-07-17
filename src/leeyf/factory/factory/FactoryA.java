package leeyf.factory.factory;

public class FactoryA implements FactoryMethod{
    @Override
    public Product create() {
        return new ProductA();
    }
}
