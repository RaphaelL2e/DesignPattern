package leeyf.singleton.type6;

public class SingletonTest06 {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1==instance2);
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }
}

//双重检查
class Singleton{
    private static volatile Singleton instance;

    private Singleton(){};

    //提供一个静态的额公有方法，加入双重检查代码
    //解决线程安全问题与懒加载问题
    public static synchronized Singleton getInstance(){
        if(instance==null){
            synchronized(Singleton.class) {
                if(instance==null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
