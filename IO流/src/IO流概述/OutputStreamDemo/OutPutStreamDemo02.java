package IO流概述.OutputStreamDemo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/*
    一次写多个字节的方法:
        void write(byte[] b) 将 b.length字节从指定的字节数组写入此输出流。
        void write(byte[] b, int off, int len) 从指定的字节数组写入 len个字节，从偏移 off开始输出到此输出流。
 */
public class OutPutStreamDemo02 {
    public static void main(String[] args) throws IOException {
        // 创建FileOutPutStream对象,构造方法中绑定要写入的路径
        FileOutputStream fos = new FileOutputStream(new File("G:\\my_share\\code\\test.txt"));

        /*
        void write(byte[] b) 将 b.length字节从指定的字节数组写入此输出流。
        一次多个字节:
            如果写的第一个字节是正数(0-127),那么显示的时候会查询ASCII表
            如果写的第一个字节是负数,那么第一个字节会和第二个字节组成一个中文显示,查询系统默认码表(GBK)

         */
        byte[] bt = {65, 66, 67, 68, 69};
        byte[] bt2 = {-65, -66, -67, 68, 69};

        fos.write(bt);  // ABCDE
        fos.write(bt2);  //  烤紻E

        /*
         void write(byte[] b, int off, int len) 从指定的字节数组写入 len个字节，从偏移 off开始输出到此输出流。
            int off: 数组的开始索引
            int len: 写几个字节
         */

        fos.write(bt,1, 2);

        /*
            写入字符的方法:可以使用String类中的方法把字符串转换为字节数组
                byte[] getBytes()
         */

        byte[] bytes = "你好".getBytes();
        System.out.println(Arrays.toString(bytes)); // [-28, -67, -96, -27, -91, -67]
        fos.write(bytes);

        //释放资源
        fos.close(); // BC
    }
}
