package demo05;
/*
参数 name 是对方的名字；
成员变量 name 似乎我的名字；

this.成员变量名 可以访问成员变量

*** 重要： 通过谁调用的方法，谁就是 this

 */
public class PersonThis {
    String name;
    public void sayHello(String name){
        System.out.println(name + "你好，我是" + this.name);
    }
}
