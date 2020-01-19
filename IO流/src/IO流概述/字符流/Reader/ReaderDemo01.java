package IO流概述.字符流.Reader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/*
    java.io.Reader: 字符输入流的最顶层的父类,定义了一些共性的成员方法,是一个抽象类

    共性成员方法:
        int read() 读一个字符
        int read(char[] cbuf) 将字符读入数组。
        abstract void close() 关闭流并释放与之相关联的任何系统资源。

    java.io.FileReader extends InputStreamReader extends Reader
    FileReader:文件字符输入流
        作用:把硬盘文件中的数据以字符的方式读取到内存中

    构造方法:
        FileReader(File file) 创建一个新的 FileReader ，给出 File读取。
        FileReader(String fileName) 创建一个新的 FileReader ，给定要读取的文件的名称。

    字符输入使用步骤:
        1.创建FIleReader对象,构造方法中绑定要读取的数据源
        2.使用FileReader对象中的方法 read 读取
        3.释放资源
 */
public class ReaderDemo01 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader(new File("G:\\my_share\\code\\a.txt"));

//        int len = 0;
//        while ((len = fr.read())!= -1){
//            System.out.print((char)len);
//        }

        /*
        int read(char[] cbuf) 将字符读入数组。
            缓冲读取多个
         */
        char[] cs = new char[1024];  // 存储读取到的多给付
        int len = 0; // 记录的是每次读取的有效字符个数
        while ((len = fr.read(cs))!=-1) {
            /*
                String类的构造方法
                    String(char[] value)
                    String(char[] value, int offset, int count)
             */
            System.out.println(new String(cs, 0, len));
        }

        // 释放资源
        fr.close();
    }
}
