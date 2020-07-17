package leeyf.factory.factory;

public class ProductB implements Product{
    @Override
    public void operate1() {
        System.out.println("B：operate1");
    }

    @Override
    public void operate2() {
        System.out.println("B：operate2");
    }
}
