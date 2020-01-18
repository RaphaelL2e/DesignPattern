package leeyf.factory.simplefactory.breadstore.order;

import leeyf.factory.simplefactory.breadstore.bread.BlackBread;
import leeyf.factory.simplefactory.breadstore.bread.Bread;
import leeyf.factory.simplefactory.breadstore.bread.FrenchBread;

public class SimpleFactory {
    public Bread createBread(String breadType){
        Bread bread = null;
        System.out.println("这是一个简单工厂模式");
        if(breadType.equals("blackBread")){
            bread = new BlackBread();
            bread.setName("黑面包");
        }else if(breadType.equals("frenchBread")){
            bread = new FrenchBread();
            bread.setName("法式面包");
        }
        return bread;
    }
}
