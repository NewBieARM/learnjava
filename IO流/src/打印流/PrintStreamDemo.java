package 打印流;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/*
    java.io.PrintStream:打印流
         PrintStream为另一个输出流添加了功能，即能够方便地打印各种数据值的表示。

    PrintStream extends OutputStream
        继承自父类的方法:
            void close() 关闭此输出流并释放与此流相关联的任何系统资源。
            void flush() 刷新此输出流并强制任何缓冲的输出字节被写出。
            void write(byte[] b) 将 b.length字节从指定的字节数组写入此输出流。
            void write(byte[] b, int off, int len) 从指定的字节数组写入 len个字节，从偏移 off开始输出到此输出流。
            abstract void write(int b) 将指定的字节写入此输出流。

    PrintStream特点:
        1.只负责数据的输出,不负责数据的读取
        2.与其他输出流不同， PrintStream从不抛出IOException
        3.有特有的方法,print,println
            void print(任意类型的值)
            void println(任意类型的值并换行)

    构造方法:
        PrintStream(File file)  输出的目的地时一个文件
        PrintStream(OutputStream out)  输出的目的地时一个输出流
        PrintStream(String fileName)

    注意:
        如果使用继承自父类的write方法写数据,那么查看数据的时候会查询编码表 97->a
        如果使用自己特有的方法print/println方法写数据,写的数据会原样输出 97->97

 */
public class PrintStreamDemo {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = new PrintStream("G:\\my_share\\code\\print.txt");
        ps.write(97);

        ps.println(97);
        ps.println(8.8);
        ps.println(true);
        ps.println("hello");

        ps.close();

    }
}
