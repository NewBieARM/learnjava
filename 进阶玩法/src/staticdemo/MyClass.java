package staticdemo;

public class MyClass {

    int num;  //成员变量
    static int numStatic;  //静态变量
    public void method(){
        System.out.println("这是一个普通的成员方法");

        //成员方法可以访问静态变量和成员变量
        System.out.println(num);
        System.out.println(numStatic);
    }

    public static void methodStatic(){
        System.out.println("这是一个静态方法");

        //静态方法可以访问静态变量
        System.out.println(numStatic);
        //静态方法不能直接访问非静态变量【重点】
        //System.out.println(num);

        //静态方法中不能使用 this关键字
//        System.out.println(this);


    }
}
