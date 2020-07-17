package leeyf.factory.abstractfactory.product.factory;

import leeyf.factory.abstractfactory.product.a.ProductA;
import leeyf.factory.abstractfactory.product.a.ProductA2;
import leeyf.factory.abstractfactory.product.b.ProductB;
import leeyf.factory.abstractfactory.product.b.ProductB2;

public class Factory2 implements AbstractFactory {
    @Override
    public ProductA createA() {
        return new ProductA2();
    }

    @Override
    public ProductB createB() {
        return new ProductB2();
    }
}
