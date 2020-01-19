package IO流概述.字符流.TryCatchDemo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TryCatchDemo01 {
    public static void main(String[] args) {
        // 提高变量 fw 的作用域
        // 变量在定义的时候可以没有值,但是在使用的时候必须有值
        // fw = new FileWriter(new File("G:\\my_share\\code\\HelloWorld.txt"));
        FileWriter fw = null;
        try {
            fw = new FileWriter(new File("G:\\my_share\\code\\HelloWorld.txt"));
            for (int i=0; i<10; i ++) {
                fw.write("HelloWorld" + i + "\r\n");
            }
        }catch (IOException e) {
            System.out.println(e);
        }finally {
            // 一定会执行的代码
            // 创建对象失败了,fw的默认值就是null,null时不能调用方法的,会抛出NUlPointerException,需要增加一个判断,不是null在释放资源
            if (fw != null) {
                try {
                    // fw.close() 方法声明抛出了 IOException 异常对象,所以我们就地处理这个异常对象,要么throws,要么try catch
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
