package extendsconstructor;
/*
继承关系中，父子类构造方法的访问特点
    1.子类构造方法当中有一个默认隐含的 “super()” 调用，所以一定是先调用父类构造方法，然后子类
    2.子类构造可以通过 super 关键字在调用父类重载构造
    3.super 的父类构造调用，必须是子类构造方法的第一句
 */
public class ConstructorDemo {
    public static void main(String[] args) {
        Zi zi = new Zi();

    }
}
