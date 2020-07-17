package leeyf.factory.abstractfactory.product.a;

import leeyf.factory.factory.Product;

public class ProductA1 implements ProductA {
    @Override
    public void operate1() {
        System.out.println("A1：operate1");
    }

    @Override
    public void operate2() {
        System.out.println("A1：operate2");
    }
}
