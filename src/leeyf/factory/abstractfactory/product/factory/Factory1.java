package leeyf.factory.abstractfactory.product.factory;

import leeyf.factory.abstractfactory.product.a.ProductA;
import leeyf.factory.abstractfactory.product.a.ProductA1;
import leeyf.factory.abstractfactory.product.b.ProductB;
import leeyf.factory.abstractfactory.product.b.ProductB1;

public class Factory1 implements AbstractFactory {
    @Override
    public ProductA createA() {
        return new ProductA1();
    }

    @Override
    public ProductB createB() {
        return new ProductB1();
    }
}
