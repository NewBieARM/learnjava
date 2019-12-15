package abstractdemo;

public class Cat extends Animal{
    public Cat(){
        System.out.println("子类构造法功法执行");
    }

    // 必须实现 eat() 类
    @Override
    public void eat(){
        System.out.println("猫吃鱼");
    }
}
