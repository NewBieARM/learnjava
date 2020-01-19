package IO流概述.InputStreamDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/*
    字节输入流一次读取多个字节的方法:
        int read(byte[] b) 从该输入流读取最多 b.length个字节的数据为字节数组。
    明确两件事情:
        1.方法的参数byte[] 作用是什么?
            起到缓冲作用,存储每次读取到的多个字节
            书这样的长度一般定义为1024(1kb)过着1024的整数倍
        2.方法的返回值又是什么?
            每次读取的有效字节个数
 */
public class InputStreamDemo02 {
    public static void main(String[] args) throws IOException {
//        FileInputStream fis = new FileInputStream(new File("G:\\my_share\\code\\a.txt"));
        // 使用FileInputStream对象的read读取
        // int read(byte[] b)
//        byte[] bytes = new byte[2];
//        int len = fis.read(bytes);
//        System.out.println(len); // 2
//        System.out.println(Arrays.toString(bytes)); // [97, 98]
//        System.out.println(new String(bytes));  // ab
//
//        len = fis.read(bytes);
//        System.out.println(len); // 2
////        System.out.println(Arrays.toString(bytes)); // [97, 98]
//        System.out.println(new String(bytes));  // ab
//
//        len = fis.read(bytes);
//        System.out.println(len); // 2
////        System.out.println(Arrays.toString(bytes)); // [97, 98]
//        System.out.println(new String(bytes));  // ab
        /*
            以上读取时是一个重复过程,可使用循环
         */
        byte[] bytes = new byte[1024]; // 存储读取到的多个字节
        int len;
        FileInputStream fis = new FileInputStream(new File("G:\\my_share\\code\\a.txt"));
        while ((len = fis.read(bytes))!= -1){
            System.out.println(new String(bytes, 0, len));
        }
        fis.close();
    }
}