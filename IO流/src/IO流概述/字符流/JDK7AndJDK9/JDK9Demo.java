package IO流概述.字符流.JDK7AndJDK9;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*
    JDk9新特性
    try的前边可以定义流对象
    在try后边的()中可以直接引入流对象的名称(变量名)

    在try代码执行完毕后,流对象也可以释放掉,不用写finally
    格式:
        A a = new A();
        B b = new B();
        try(a, b){
        }catch(){
        }
 */
public class JDK9Demo {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter(new File("G:\\my_share\\code\\HelloWorld.txt"))
        try(fw){
            for (int i=0; i<10; i ++) {
                fw.write("HelloWorld" + i + "\r\n");
            }
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
