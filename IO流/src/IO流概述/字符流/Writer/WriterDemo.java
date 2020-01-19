package IO流概述.字符流.Writer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*
    java.io.Writer : 字符输出流

    成员共性方法:
        void write(int c) 写入单个字符。
        void write(char[] cbuf) 写入字符数组。
        abstract  void write(char[] cbuf, int off, int len) 写入字符数组的某一部分,off数组的开始索引,len写的字符个数。
        void write(String str) 写入字符串。
        void write(String str, int off, int len) 写入字符串的某一部分,off字符串的开始索引,len写的字符个数。
        void flush() 刷新该流的缓冲。
        void close() 关闭此流，但要先刷新它。

    java.io.FileWriter extends OutputStreamWriter extends Writer
    FileWriter: 文件字符输出流
    作用:把内存中的字符数据写入到文件中

    构造方法:
        FileWriter(File file) 给一个File对象构造一个FileWriter对象。
        FileWriter(String fileName) 构造一个给定文件名的FileWriter对象。

    字符输出流的使用步骤:(重要)
        1.创建FileWriter对象,构造方法中绑定要写入数据的目的地
        2.使用FileWriter中的方法write,把数据写入到内存缓冲区中(字符转换为字节的过程)
        3.使用FileWriter中的方法flush,把内存缓冲区中的数据,刷新到文件中
        4.释放资源(会先把内存缓冲区中的数据刷新到文件中)
 */
public class WriterDemo {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter(new File("G:\\my_share\\code\\c.txt"));

        fw.write(97);  // 如果不调用 flush() 或者close() 是不会把文件写进去的
        fw.flush(); // 如果不写flush() close()会先把内存缓冲区中的数据刷新到文件中
        fw.close();
    }
}
