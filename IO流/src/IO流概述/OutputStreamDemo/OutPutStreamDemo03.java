package IO流概述.OutputStreamDemo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    追加写/续写:使用两个参数的构造方法
    FileOutputStream(File file, boolean append) 创建文件输出流以写入由指定的 File对象表示的文件。
    FileOutputStream(String name, boolean append) 创建文件输出流以指定的名称写入文件。
    参数:
        boolean append:追加写开关 true:创建对象不会覆盖原文件,继续在文件末尾追加

    写换行:写换行符号
        windows: \r\n
        linux: /n
        mac: /r
 */
public class OutPutStreamDemo03 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream(new File("G:\\my_share\\code\\test.txt"), true);
        for (int i = 0; i < 10; i++) {
            fos.write("哈喽".getBytes());
            fos.write("\r\n".getBytes());
        }
        fos.close();
    }
}
