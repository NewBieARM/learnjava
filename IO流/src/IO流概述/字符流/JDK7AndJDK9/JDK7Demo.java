package IO流概述.字符流.JDK7AndJDK9;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*
    JDK7的i你特性:
        在try的后边可以增加一个(),在括号中可以定义流对象
        啊么这个流对象的作用域就在try中有效
        try中的代码执行完毕,会自动把流对象释放,不用写finally

        格式:
            try (定义流对象;定义流对象 ... ) {
            }catch(异常类变量 变量名){
            }
 */
public class JDK7Demo {
    public static void main(String[] args) {
        try(FileWriter fw = new FileWriter(new File("G:\\my_share\\code\\HelloWorld.txt"))){
            for (int i=0; i<10; i ++) {
                fw.write("HelloWorld" + i + "\r\n");
            }
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
