package leeyf.factory.abstractfactory.product;

import leeyf.factory.abstractfactory.product.factory.AbstractFactory;
import leeyf.factory.abstractfactory.product.factory.Factory1;
import leeyf.factory.abstractfactory.product.factory.Factory2;

public class Client {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = new Factory1();
        abstractFactory.createA().operate1();
        abstractFactory.createB().operate1();
        abstractFactory =new Factory2();
        abstractFactory.createA().operate1();
        abstractFactory.createB().operate2();
    }
}
