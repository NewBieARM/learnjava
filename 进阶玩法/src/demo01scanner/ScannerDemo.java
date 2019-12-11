package demo01scanner;

import java.util.Scanner;

/*
Scanner 类的功能，可以实现键盘输入数据，到程序当中

引用类型的一般使用步骤：
1.导包 import 包路径.类名称     2.创建      3.使用
如果使用的类在同一个包，可以省略导入步骤
 *** 注意： 只有 java.lang 包下的内容不需要导包，其他的包都需要 import语句

 */
public class ScannerDemo {
    public static void main(String[] args) {
        // System.in 代表从键盘进行输入
        Scanner input = new Scanner(System.in);

        System.out.print("请输入姓名：");
        String name = input.nextLine();
        System.out.print("请输入年龄：");
        input.next();
        int age = input.nextInt();

        System.out.println("姓名：" + name + ", 年龄：" + age);
    }
}
