package IO流概述.字符流.Writer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*
    flush方法和close方法的区别:
        flush:刷新缓冲区,流对象可以继续使用
        close:先刷新缓冲区,然后通过系统释放资源, 流对象不可以在被使用了
 */
public class CloseAndFlush {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter(new File("G:\\my_share\\code\\c.txt"));

        fw.write(97);
        fw.flush();
        fw.write(98); // ab 可以继续使用

        fw.close();
//        fw.write();  // 不可行,因为已经释放了
    }
}
