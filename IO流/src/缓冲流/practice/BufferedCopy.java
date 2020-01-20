package 缓冲流.practice;

import java.io.*;

/*
    字节缓冲流复制文件

        运行时间(一个一个写): 1109
        运行时间: 6
 */
public class BufferedCopy {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(new File("G:\\my_share\\code\\picture.jpg"));
        FileOutputStream fos = new FileOutputStream(new File("G:\\my_share\\code\\pic\\picture.jpg"));

        long start = System.currentTimeMillis();

        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(fos);

//        int len = 0;
//        while ((len = fis.read()) != -1){     // 运行时间(一个一个写): 1109毫秒
//            bos.write(len);
//        }

        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = fis.read(bytes)) != -1){  // 运行时间: 6毫秒
            bos.write(bytes, 0, len);
        }

        fos.close();
        fis.close();

        long stop = System.currentTimeMillis();
        System.out.println("运行时间: " + (stop - start));

    }
}
