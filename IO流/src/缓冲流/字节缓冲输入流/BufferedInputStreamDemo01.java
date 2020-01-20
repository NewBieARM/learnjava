package 缓冲流.字节缓冲输入流;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/*
    java.io.bufferedInputStream extends InputStream
    BufferedInputStream:字节缓冲输入流
        abstract int read() 从输入流读取数据的下一个字节。
        int read(byte[] b) 从输入流读取一些字节数，并将它们存储到缓冲区 b 。
        void close(); 释放资源
    继承自父类成员方法:
        BufferedInputStream(InputStream in) 创建一个 BufferedInputStream并保存其参数，输入流 in ，供以后使用。
        BufferedInputStream(InputStream in, int size) 创建 BufferedInputStream具有指定缓冲区大小，并保存其参数，输入流 in ，供以后使用。

    步骤:
        1.创建FileInputStream对象,
        2.创建BufferedInputStream对象,并把FileInputStream对象传递到参数里
        3.使用BufferedInputStream对象的read方法,把数据写入到内部缓冲区中
        4.释放资源


 */
public class BufferedInputStreamDemo01 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("G:\\my_share\\code\\1-20.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
//        int len;
//        while ((len = bis.read()) != -1){
//            System.out.print((char)len);
//        }

        // 数组缓冲
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = bis.read(bytes)) != -1) {
            System.out.print(new String(bytes, 0, len));
        }
        bis.close();
    }
}
