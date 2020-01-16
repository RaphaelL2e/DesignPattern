package leeyf.singleton.type5;

public class SingletonTest05 {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1==instance2);
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }
}

//懒汉式(线程安全，同步代码块)
class Singleton{
    private static Singleton instance;

    private Singleton(){};

    //提供一个静态的额公有方法，加入同步处理代码 synchronized
    //懒汉式
    public static Singleton getInstance(){
        if(instance==null){
            synchronized(Singleton.class) {
                instance = new Singleton();
            }
        }
        return instance;
    }
}
