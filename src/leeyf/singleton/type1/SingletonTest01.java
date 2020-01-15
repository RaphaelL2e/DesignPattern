package leeyf.singleton.type1;

/**
 * 设计模式-单例模式
 */
public class SingletonTest01 {

}

 //饿汉式实现(静态遍历)
class Singleton{
    //1.构造器私有化，外部不能new
    private Singleton(){}

    //奔雷内部创建对象实例
    private final static Singleton instance = new Singleton();

    //提供一个公有的静态方法，返回实例对象
    public static Singleton getInstance(){
        return instance;
    }
}


