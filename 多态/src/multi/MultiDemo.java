package multi;
/*
代码当中体现多态性，其实就是一句话： 父类引用指向子类对象

格式：
    父类名称 对象名 = new 子类名称();
或者：
    接口名称 对象名 = new 实现类名称();



 */
public class MultiDemo {
    public static void main(String[] args) {
        //多态的写法
        //左侧父类引用，指向了右侧子类的对象
        Fu obj = new Zi();

        obj.method();  // 父子都有，优先子
        obj.methodFu();  // 子类没有，向上找到父类

        // 编译看左边，左边是 Fu， Fu 当中没有methodZi() 方法，所以编译报错

//        obj.methodZi();  //错误写法
    }
}
