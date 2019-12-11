package demo04;
/*
面向对象三大特征：封装、继承、多态

封装：就是将一些细节信息隐藏起来，对与外界不可见

封装在java当中的体现：
    1.方法就是一种封装  （只管调用，不用注意细节）
    2.关键字 private 也是一种封装
 */
public class DemoMethod {
    public static void main(String[] args) {
        PrivatePerson person = new PrivatePerson();
        person.name = "arman";
        person.setAge(22);
        person.func();
    }
}
