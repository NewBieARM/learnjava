package finaldemo;
/*
当一个 final 关键字修饰一个类的时候，格式：
    public final class 类名称 {
        // ...
    }
含义：
    当前这个类不能有任何子类（太监类）

注意：
    一个类如果是 final 类，那么其中所有的成员方法都无法进行覆盖重写
 */
public final class MyClass {
    public void method(){
        System.out.println("方法执行..");
    }
}
