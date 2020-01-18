package leeyf.factory.simplefactory.breadstore.order;

import leeyf.factory.simplefactory.breadstore.bread.Bread;

import java.util.Scanner;

public class OrderBread {

    //public OrderBread() {
    //    Bread bread = null;
    //    String oderType = null;
    //
    //    do {
    //        oderType = getBreadType();
    //        if(oderType.equals("blackBread")){
    //            bread = new BlackBread();
    //            bread.setName("黑面包");
    //        }else if(oderType.equals("freachBread")){
    //            bread = new FrenchBread();
    //            bread.setName("法式面包");
    //        }else {
    //            break;
    //        }
    //        bread.prepare();
    //        bread.bake();
    //        bread.box();
    //
    //    }while (true);
    //}
    //添加构造器


    public OrderBread() {

    }

    public OrderBread(SimpleFactory simpleFactory) {
        setSimpleFactory(simpleFactory);
    }

    //定义一个简单工厂对象
    SimpleFactory simpleFactory = null;
    Bread bread = null;

    public void setSimpleFactory(SimpleFactory simpleFactory) {
        String orderType =""; //用户输入
        this.simpleFactory = simpleFactory;

        do {
            orderType = getBreadType();
            bread = simpleFactory.createBread(orderType);

            if(bread!=null){
                bread.prepare();
                bread.bake();
                bread.box();
            }else {
                System.out.println("当前没有该种类面包");
            }
        }while (true);
    }

    public String getBreadType(){
        System.out.println("input bread type:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
