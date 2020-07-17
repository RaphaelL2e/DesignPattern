package leeyf.factory.factory;

public class ProductA implements Product{
    @Override
    public void operate1() {
        System.out.println("A：operate1");
    }

    @Override
    public void operate2() {
        System.out.println("A：operaAte2");
    }
}
