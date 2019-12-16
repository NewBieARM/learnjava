package interfacedemo;

/*
从 java8 开始，接口里允许定义默认方法。

public default 返回值类型 方法名称 (参数列表) {
    方法体
}
PS： 接口当中的默认方法可以解决接口升级问题
 */
public interface MyInterfaceDefault {
    // 抽象方法
    public abstract void methodAbs();

    /*
    如果在 methodAbs 接口已经写好的情况下，想升级接口写另外接口的话
    如果用 abstract 就会报错！ 因为在程序还没实现这个接口方法

    所以这时候用 default 可以避免报错，default 这个方法 会在实现里继承，用于调用

    ***
    1.接口的默认方法，可以通过接口实现类对象，直接调用
    2.接口默认方法，也可以被接口实现类进行覆盖重写
     */
//    public abstract void methodAbs2();


    public default void methodDefault() {
        System.out.println("这是一个default 方法");
    }
}
