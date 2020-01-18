package leeyf.factory.simplefactory.pizzastore.order;

//客户端,发出订购
public class PizzaStore {

    public static void main(String[] args) {
        //new OrderPizza();
        new OrderPizza(new SimpleFactory());
        System.out.println("exit!");
    }
}
