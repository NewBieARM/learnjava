package IO流概述.OutputStreamDemo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    java.io.OutputStream：个抽象类是表示字节输出流的所有类的超类。
    定义了一些子类共性的成员方法：
        void close() 关闭此输出流并释放与此流相关联的任何系统资源。
        void flush() 刷新此输出流并强制任何缓冲的输出字节被写出。
        void write(byte[] b) 将 b.length字节从指定的字节数组写入此输出流。
        void write(byte[] b, int off, int len) 从指定的字节数组写入 len个字节，从偏移 off开始输出到此输出流。
        abstract void write(int b) 将指定的字节写入此输出流。

    java.io.FilterOutputStream extends OutPutStream
    FileOutPutStream: 文件字节输出流
    作用：把内存红的数据写入到影片你的文件中

    构造方法：
        FileOutputStream(String name) 创建文件输出流以指定的名称写入文件。
        FileOutputStream(File file) 创建文件输出流以写入由指定的 File对象表示的文件。
        参数：写入数据的目的地
            String name：目的地是一个文件的路径
            File file：目的地是一个文件
        构造方法的作用：
            1.创建一个 FileOutputStream 对象
            2.会根据构造方法中传递的文件/文件路径，创建一个空文件
            3.会把 FileOutputStream 对象指向创建好的文件

    写入数据的原理（内存 --> 硬盘)
        Java程序 --> JVM(java虚拟机) --> OS(操作系统) --> OS调用写数据的方法 --> 写入文件

    字节输出流的使用步骤(重点):
        1.创建一个 FileOutPutStream 对象,构造方法中写入数据的目的地
        2.调用 FileOutPutStream 对象中的方法write,把数据写入到文件中
        3.释放资源

*/
public class OutPutStreamDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("G:\\my_share\\code\\a.txt");
        // 1.创建一个 FileOutPutStream 对象,构造方法中写入数据的目的地
        FileOutputStream fos = new FileOutputStream(file);
        // 2.调用 FileOutPutStream 对象中的方法write,把数据写入到文件中
        fos.write(97);
        // 3.释放资源
        fos.close();
    }
}
