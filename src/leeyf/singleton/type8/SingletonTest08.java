package leeyf.singleton.type8;

public class SingletonTest08 {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.INSTANCE;
        Singleton singleton2 = Singleton.INSTANCE;
        System.out.println(singleton1==singleton2);
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());
        singleton1.sayOk();


    }
}


enum Singleton{
    INSTANCE;
    public void sayOk(){
        System.out.println("ok");
    }
}