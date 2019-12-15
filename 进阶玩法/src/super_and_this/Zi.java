package super_and_this;

/*
super 关键字用来访问父类内容，this 关键字用来访问本来内容 用法 也有三种
    1.在本类的成员方法中，访问本类的成员变量
    2.在本类的成员方法中，访问本类的另一个成员方法
    3.在本类的构造方法中，访问本类的另一个构造方法

第三种用法当中的注意点：
    A.  this(...) 调用也必须是构造方法的第一个语句，唯一一个
    B.  super 和 this 两种构造方法，不能同时用  ***

 */
public class Zi extends Fu {
    int num = 10;

    public Zi() {
//        super();      //这一行不再赠送
        this(500);   //本类的无参构造，调用本类的有参构造
//        this(20,51);  //错误写法！
    }

    public Zi(int n) {

    }

    public Zi(int n, int n2) {

    }

    public void showNum() {
        int num = 20;
        System.out.println(num);        //局部变量
        System.out.println(this.num);   //本类中的成员变量
        System.out.println(super.num);  //父类中的成员变量
    }

    public void methodA() {
        System.out.println("AAA");
    }

    public void methodB() {
        methodA();
        this.methodA();  //两者一样 ，这个只是有强调作用
        System.out.println("BBB");
    }
}
