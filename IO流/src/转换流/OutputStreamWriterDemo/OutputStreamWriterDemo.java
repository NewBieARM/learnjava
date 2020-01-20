package 转换流.OutputStreamWriterDemo;

import java.io.*;
import java.nio.charset.StandardCharsets;

/*
    java.io.OutputStreamWriter extends Writer
    OutputStreamWriter：是字符流通向字节流的桥梁：可使用指定的charset将要写入流中的字符编码成字节.(编码:能把看懂的变成看不懂得)

    继承自父类的共性成员方法:
        void write(int c) 写入单个字符。
        void write(char[] cbuf) 写入字符数组。
        abstract  void write(char[] cbuf, int off, int len) 写入字符数组的某一部分,off数组的开始索引,len写的字符个数。
        void write(String str) 写入字符串。
        void write(String str, int off, int len) 写入字符串的某一部分,off字符串的开始索引,len写的字符个数。
        void flush() 刷新该流的缓冲。
        void close() 关闭此流，但要先刷新它。
    构造方法:
        OutputStreamWriter(OutputStream out) 创建一个使用默认字符编码的OutputStreamWriter。
        OutputStreamWriter(OutputStream out, String charsetName) 创建一个使用命名字符集的OutputStreamWriter。
    参数:
        OutputStream out:字节输出流,可以用来转换之后的字节到文件中
        String charsetName:指定的编码表名称,不区分大小写(utf-8/UTF-8,gbk/GBK) 不指定默认使用utf-8

    使用步骤:
        1.创建一个 OutputStreamWriter 对象,构造方法中传递字节输出流和指定的编码表名称
        2.使用 OutputStreamWriter 对象中的方法write,把字符转换为字节存储缓冲区中(编码)
        3.使用 flush() 方法,把字节存储缓冲区的数据刷新到文件中
        4.释放资源
 */
public class OutputStreamWriterDemo {
    public static void main(String[] args) throws IOException {
//        write_utf_8();
        write_gbk();
    }

    private static void write_gbk() throws IOException{
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("G:\\my_share\\code\\gbk.txt"), "gbk");
        osw.write("这是我用OutputStreamWriter写的GBK编码内容");
        osw.flush();
        osw.close();
    }

    private static void write_utf_8() throws IOException{
    /*
        使用转换流OutputStreamWriter些utf-8文件
     */
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("G:\\my_share\\code\\utf-8.txt"), StandardCharsets.UTF_8);
        osw.write("这是我用OutputStreamWriter写的utf-8编码内容");
        osw.flush();
        osw.close();
    }
}
