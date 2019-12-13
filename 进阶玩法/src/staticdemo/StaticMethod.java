package staticdemo;
/*
一旦使用 static 修饰成员方法，那么这就成为了静态方法
静态方法不属于对象，而是属于类的

如果没有 static 关键字，那么必须先创建对象，然后通过对象才能使用他
如果有了 static 关键字，那么不需要创建对象，直接就能通过类名称来使用它

无论是成员变量，还是成员方法 都推荐使用类名称进行调用；

 ***注意事项：
    1.静态不能直接访问非静态   【重要】
原因：因为在内存当中是【先】有的静态内容,【后】有的非静态内容
    2.静态方法当中 不能写 this。
原因：this 代表当前【对象】,通过谁调用的方法，谁就是当前对象；
 */
public class StaticMethod {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        //现在能使用没有 static 关键字的内容
        obj.method();

        // 对于静态方法来说，可以通过对象名进行调用，也可以直接通过类名称
        obj.methodStatic();        // 正确 不退按
        MyClass.methodStatic();    // 正确 推荐
    }

    public static void myMethod(){
        System.out.println("这是自己的方法");
    }
}
