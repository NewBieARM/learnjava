package 缓冲流.字符缓冲输出流;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
    java.io.BufferedWriter extends Writer
    BufferedWriter:字符缓冲输出流

    继承自父类的成员共性方法:
        void write(int c) 写入单个字符。
        void write(char[] cbuf) 写入字符数组。
        abstract  void write(char[] cbuf, int off, int len) 写入字符数组的某一部分,off数组的开始索引,len写的字符个数。
        void write(String str) 写入字符串。
        void write(String str, int off, int len) 写入字符串的某一部分,off字符串的开始索引,len写的字符个数。
        void flush() 刷新该流的缓冲。
        void close() 关闭此流，但要先刷新它。

    构造方法:
        BufferedWriter(Writer out) 创建使用默认大小的输出缓冲区的缓冲字符输出流。
        BufferedWriter(Writer out, int sz) 创建一个新的缓冲字符输出流，使用给定大小的输出缓冲区。

    特有的成员方法:
        void newLine() 写入一个行分隔符

 */
public class BufferedWriterDemo {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("G:\\my_share\\code\\1-20-2.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("好好学习");
        bw.newLine();
        bw.write("天天向上");

        bw.flush();
        bw.close();
    }
}
