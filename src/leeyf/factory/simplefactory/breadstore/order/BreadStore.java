package leeyf.factory.simplefactory.breadstore.order;

public class BreadStore {
    public static void main(String[] args) {
        //new OrderBread();
        new OrderBread().setSimpleFactory(new SimpleFactory());
    }
}
