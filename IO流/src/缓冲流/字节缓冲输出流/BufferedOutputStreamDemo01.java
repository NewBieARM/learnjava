package 缓冲流.字节缓冲输出流;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    java.io.BufferedOutputStream extends OutputStream
    BufferedOutputStream :字节缓冲输出流

    继承自父类的共性成员方法
        void close() 关闭此输出流并释放与此流相关联的任何系统资源。
        void flush() 刷新此输出流并强制任何缓冲的输出字节被写出。
        void write(byte[] b) 将 b.length字节从指定的字节数组写入此输出流。
        void write(byte[] b, int off, int len) 从指定的字节数组写入 len个字节，从偏移 off开始输出到此输出流。
        abstract void write(int b) 将指定的字节写入此输出流。

     构造方法:
        BufferedOutputStream(OutputStream out) 创建一个新的缓冲输出流，以将数据写入指定的底层输出流。
        BufferedOutputStream(OutputStream out, int size) 创建一个新的缓冲输出流，以便以指定的缓冲区大小将数据写入指定的底层输出流。
     参数:
        OutputStream out: 字节输出流
          可以传递FileOutputStream,缓冲流会给FileOutputStream增加一个缓冲区,提高FileOutputStream的写入效率
        int size: 指定缓冲流内部缓冲区的大小,不指定就默认

     步骤:
        1.创建FileOutputStream对象,
        2.创建BufferedOutputStream对象,并把FileOutputStream对象传递到参数里
        3.使用BufferedOutputStream对象的write方法,把数据写入到内部缓冲区中
        4.使用flush方法,把内部缓冲区的数据刷新到文件中
        5.释放资源
 */
public class BufferedOutputStreamDemo01 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream(new File("G:\\my_share\\code\\1-20.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        bos.write("我把数据写入到内部缓冲区中".getBytes());
        bos.flush();
        bos.close();

    }
}
