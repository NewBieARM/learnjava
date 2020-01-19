package IO流概述.InputStreamDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/*
    java.io.InputStream: 字节输入流
    这个抽象类是表示输入字节流的所有类的超类。

    定义了所有子类共性的方法:
        abstract int read() 从输入流读取数据的下一个字节。
        int read(byte[] b) 从输入流读取一些字节数，并将它们存储到缓冲区 b 。
        void close(); 释放资源

    java.io.FileInputStream extends InputStream
    FileInputStream:文件字节输入流
    作用:把硬盘文件中的数据,读取到内存中使用

    构造方法:
        FileInputStream(File file) 通过打开与实际文件的连接创建一个 FileInputStream ，该文件由文件系统中的 File对象 file命名。
        FileInputStream(String name)通过打开与实际文件的连接来创建一个 FileInputStream ，该文件由文件系统中的路径名 name命名

    读取数据的原理(硬盘 -> 内存)
        java程序 -> JVM -> OS -> OS读取数据的方法 -> 读取

    步骤:
        1.创建FileInputStream对象,构造方法中绑定数据源
        2.使用FileInputStream 中的方法 read,读取
        3.释放资源
 */
public class InputStreamDemo01 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(new File("G:\\my_share\\code\\a.txt"));
        int len; //记录读取到的字节
        /*
            布尔表达式(len = fis.read())!= -1)
                1.fis.read(): 读取一个字节
                2.len = fis.read(): 吧读取到的字节赋值给变量len
                3.(len = fis.read())!= -1):判断是你后不等于-1
         */
        while ((len = fis.read())!= -1) {
            System.out.println(len); // 97 98 99
            System.out.println((char)len); // abc
        }
        /*
        错误写法:
        因为每一次read() 都会把指针指到下一位
            while (fis.read()!= -1) {   // fis.read = 97
            System.out.println(fis.read()); // fis.read = 98
        }
         */

        fis.close();
    }
}
