package IO流概述.字符流.Writer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*
    字符输出流写数据的其他方法
        void write(char[] cbuf) 写入字符数组。
        abstract  void write(char[] cbuf, int off, int len) 写入字符数组的某一部分,off数组的开始索引,len写的字符个数。
        void write(String str) 写入字符串。
        void write(String str, int off, int len) 写入字符串的某一部分,off字符串的开始索引,len写的字符个数。

    续写和换行和字节流一样!
 */
public class WriteDemo02 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter(new File("G:\\my_share\\code\\WriteDemo021.txt"));

        // 1. void write(char[] cbuf) 写入字符数组。
        char[] cs = {'a', 'b', 'c', 'd', 'e', 'f'};
        fw.write(cs);

        // 2. abstract  void write(char[] cbuf, int off, int len) 写入字符数组的某一部分,off数组的开始索引,len写的字符个数。
        fw.write(cs, 1, 3);  // bcd

        // 3. void write(String str) 写入字符串。
        fw.write("Hello, World!");

        // 4. void write(String str, int off, int len) 写入字符串的某一部分,off字符串的开始索引,len写的字符个数。
        fw.write("好好学习,天天向上", 2, 5);
        fw.close();

    }
}
