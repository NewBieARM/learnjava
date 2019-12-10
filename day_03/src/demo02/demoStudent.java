package demo02;
//import demo02.;
/*
    导包 -> import 包名称.类名称;
    对于和当前类属于同一个包的情况，可以省略导包语句不写
 */
public class demoStudent {
    public static void main(String[] args) {
        Student st1 = new Student();
        st1.name = "arman";
        st1.age = 22;
        st1.study("努力");
        st1.eat();
    }
}
