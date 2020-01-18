package leeyf.factory.simplefactory.breadstore.bread;

public class FrenchBread extends Bread {
    @Override
    public void prepare() {
        System.out.println("制作法式面包的准备工作");
    }
}
