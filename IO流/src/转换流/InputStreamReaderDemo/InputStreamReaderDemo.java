package 转换流.InputStreamReaderDemo;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    java.io.InputStreamReader extends Reader
    InputStreamReader:是从字节流到字符流的桥：它读取字节，并使用指定的charset将其解码为字符 。
    (把看不懂的变成看得懂的)

    继承共性成员方法:
        int read() 读一个字符
        int read(char[] cbuf) 将字符读入数组。
        abstract void close() 关闭流并释放与之相关联的任何系统资源。

    构造方法:
        InputStreamReader(InputStream in) 创建一个使用默认字符集的InputStreamReader。
        InputStreamReader(InputStream in, String charsetName) 创建一个使用命名字符集的InputStreamReader。
        参数:
            InputStream in: 字节输入流,用来读取文件中保存的字节
    步骤:
        1.创建 InputStreamReader 对象,传递字节输入流和指定的编码表格是
        2.使用read方法读取文件
        3.释放资源
    注意事项:
        构造方法中指定的编码表名称要和文件的编码相同,否则会发生乱码
 */
public class InputStreamReaderDemo {
    public static void main(String[] args) throws IOException{

        read_gbk();

    }

    private static void read_gbk() throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("G:\\my_share\\code\\gbk.txt"), "gbk");
        int len = 0;
        while ((len = isr.read()) != -1){
            System.out.print((char) len);
        }
        isr.close();
    }
}
