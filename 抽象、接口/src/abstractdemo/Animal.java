package abstractdemo;
/*
抽象方法：
    加上 abstract 关键字，然后去掉大括号，直接分号结束
*** 抽象方法所在类，必须是抽象类才行。 在 class 之前写上 abstract 即可

如何使用抽象类和抽象方法
    1. 不能直接创建 new 抽象类对象
    2. 必须用一个子类来继承抽象父类
    3. 子类必须覆盖重写抽象父类当中所有抽象方法
覆盖重写（实现）：去掉抽象方法的 abstract 关键字，然后不上方法体大括号

一个抽象类不一定含有抽象方法，
只要保证抽象方法所在的类是抽象类，即可

这样没有抽象方法的抽象类，也不能直接创建对象，在一些特殊的场景下有用途
 */
public abstract class Animal {
    public Animal(){
        System.out.println("抽象父类构造方法执行");
    }
    // 这是一个抽象方法，代表吃东西，但是具体吃什么（大括号的内容）不确定
    public abstract void eat();
    // 普通的成员方法
    public void normalMethod(){

    }
}
