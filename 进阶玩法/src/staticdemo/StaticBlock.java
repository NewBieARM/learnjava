package staticdemo;
/*
    静态代码块 的格式是：
    public class 类名称 {
        static {
            // 静态代码块的内容
        }
    }

特点：当第一次用到本类时，静态代码块执行唯一一次
静态内容总是优于非静态

静态代码块的典型用途：
    用来一次性地对静态成员变量进行赋值；
 */
public class StaticBlock {
    public static void main(String[] args) {
        Person one = new Person();  //  先执行 静态代码块 然后执行构造方法
        Person two = new Person();  //  执行构造方法
    }
}
