package IO流概述.practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    文件的复制: 一读一写
        数据源 -> 数据的目的地
    步骤:
        1.创建一个字节输入流对象,构造方法中绑定要读取的数据源
        2.创建一个字节输出流对象,构造方法中绑定要写入的目的地
        3.使用字节输入流对象中的方法 read 读取文件
        4.使用字节输出流中的方法 write,把读取到的字节写入到目的地的文件中
        5.释放资源
 */
public class FileCopyDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(new File("G:\\my_share\\code\\picture.jpg"));
        FileOutputStream fox = new FileOutputStream(new File("G:\\my_share\\code\\pic\\picture.jpg"));
        long start = System.currentTimeMillis();
        /*
            这个方法一次读写一个字节,速度会很慢
         */
//        int len = 0;
//        while ((len = fis.read()) != -1){
//            fox.write(len);
//        }

        //使用数组缓冲读取多个字节,写入多个字节
        byte[] bytes = new byte[1024];
        int len = 0; // 每次读取的有效字节个数
        while ((len = fis.read(bytes)) != -1) {
            fox.write(bytes, 0, len);
        }
        // 释放资源 (先关闭写的,后关闭读的)
        fox.close();
        fis.close();

        long end = System.currentTimeMillis();

        System.out.println("用时: " + (end-start) + "毫秒");
    }
}
