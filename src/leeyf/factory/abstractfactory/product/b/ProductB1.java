package leeyf.factory.abstractfactory.product.b;

import leeyf.factory.factory.Product;

public class ProductB1 implements ProductB {
    @Override
    public void operate1() {
        System.out.println("B1：operate1");
    }

    @Override
    public void operate2() {
        System.out.println("B1：operate2");
    }
}
