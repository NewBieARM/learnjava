package 缓冲流.字符缓冲输入流;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/*
    继承父类共性成员方法:
        int read() 读一个字符
        int read(char[] cbuf) 将字符读入数组。
        abstract void close() 关闭流并释放与之相关联的任何系统资源。
    构造方法:
        BufferedReader(Reader in) 创建使用默认大小的输入缓冲区的缓冲字符输入流。
        BufferedReader(Reader in, int sz) 创建使用指定大小的输入缓冲区的缓冲字符输入流

     特有的方法:
        String readLine() 读取一个文本行
        行的终止符号
        返回值:
            包含改行内容的字符串,不包含任何行终止符,如果已达到流末尾,则返回 null
 */
public class BufferedReaderDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("G:\\my_share\\code\\1-20-2.txt"));

//        String s = br.readLine(); //  好好学习
//        String s1 = br.readLine(); // 天天向上

        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

//        int len = 0;
//        while ((len = br.read()) != -1) {
//            System.out.print(len);
//        }

//        char[] cs = new char[1024];
//        int len = 0;
//        while ((len = br.read(cs)) != -1) {
//            System.out.print(new String(cs, 0, len));
//        }
        br.close();

    }
}
