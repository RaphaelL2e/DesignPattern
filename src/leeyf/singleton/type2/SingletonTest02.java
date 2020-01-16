package leeyf.singleton.type2;

/**
 * 设计模式-单例模式
 */
public class SingletonTest02 {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1==instance2);
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }

}

//饿汉式实现(静态代码块)
class Singleton{
   //1.构造器私有化，外部不能new
   private Singleton(){}

   //奔雷内部创建对象实例
   private static Singleton instance;

   //在静态代码块中创建单例对象
   static {
       instance = new Singleton();
   }
   //提供一个公有的静态方法，返回实例对象
   public static Singleton getInstance(){
       return instance;
   }
}


