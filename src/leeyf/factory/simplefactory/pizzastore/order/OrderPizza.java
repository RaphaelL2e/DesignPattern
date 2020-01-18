package leeyf.factory.simplefactory.pizzastore.order;

import leeyf.factory.simplefactory.pizzastore.pizza.CheesePizza;
import leeyf.factory.simplefactory.pizzastore.pizza.GreekPizza;
import leeyf.factory.simplefactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {

    //构造器
    //public OrderPizza() {
    //    Pizza pizza = null;
    //    String orderType;//订购pizza类型
    //
    //    do {
    //        orderType = getType();
    //        if(orderType.equals("greek")){
    //            pizza = new GreekPizza();
    //            pizza.setName(orderType);
    //        }
    //        else if(orderType.equals("cheese")){
    //            pizza = new CheesePizza();
    //            pizza.setName(orderType);
    //        }else {
    //            break;
    //        }
    //        //输出pizza制作过程
    //        pizza.prepare();
    //        pizza.bake();
    //        pizza.cut();
    //        pizza.box();
    //    }while (true);
    //}

    //构造器
    public OrderPizza(SimpleFactory simpleFactory) {
        setSimpleFactory(simpleFactory);
    }

    //定义一个简单工厂对象
    SimpleFactory simpleFactory = null;
    Pizza pizza = null;
    public void setSimpleFactory(SimpleFactory simpleFactory){
        String orderType =""; //用户输入

        this.simpleFactory = simpleFactory;

        do {
            orderType = getType();
            pizza = simpleFactory.createPizza(orderType);

            //输出信息
            if(pizza!=null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();

            }else {
                System.out.println("没有该种类pizza");
            }
        }while (true);
    }

    //获取客户需要订购的pizza种类
    private String getType(){
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type:");
            String str = br.readLine();
            return str;
        }catch (IOException e){
            e.printStackTrace();
            return "";
        }
    }


}
