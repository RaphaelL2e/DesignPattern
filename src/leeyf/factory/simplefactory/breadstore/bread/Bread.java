package leeyf.factory.simplefactory.breadstore.bread;

public abstract class Bread {
    protected String name;//面包的名字

    public abstract void prepare();//制作前的准备工作

    public void bake() {
        System.out.println(name + " 制作中～");
    }

    public void box(){
        System.out.println(name + " 打包中～");
    }

    public void setName(String name) {
        this.name = name;
    }
}
