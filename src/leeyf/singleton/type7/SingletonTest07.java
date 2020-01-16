package leeyf.singleton.type7;

public class SingletonTest07 {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1==instance2);
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }
}

//静态内部类
class Singleton{
    private static volatile Singleton instance;
    //构造器私有化
    private Singleton(){};
    //静态内部类
    private static class SingletonInstance{
        private static final Singleton INSTANCE = new Singleton();
    }

    public static synchronized Singleton getInstance(){
        return SingletonInstance.INSTANCE;
    }
}
