package leeyf.factory.abstractfactory.product.factory;

import leeyf.factory.abstractfactory.product.a.ProductA;
import leeyf.factory.abstractfactory.product.b.ProductB;
import leeyf.factory.factory.Product;

public interface AbstractFactory {
    public ProductA createA();
    public ProductB createB();
}
