package leeyf.factory.simplefactory.pizzastore.pizza;

public class CheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("为制作芝士披萨准备原材料");
    }
}
