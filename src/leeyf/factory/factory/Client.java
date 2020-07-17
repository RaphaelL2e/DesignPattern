package leeyf.factory.factory;

public class Client {
    public static void main(String[] args) {
        FactoryMethod factoryMethod = new FactoryA();
        Product product = factoryMethod.create();
        product.operate1();
        product.operate2();
    }
}
