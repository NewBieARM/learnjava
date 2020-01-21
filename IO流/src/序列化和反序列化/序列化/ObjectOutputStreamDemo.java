package 序列化和反序列化.序列化;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*
    java.io.ObjectOutputStream extends OutputStream
    ObjectOutputStream: 对象的序列化流
    作用：把对象以流的方式写入到文件中保存

    构造方法：
        ObjectOutputStream(OutputStream out) 创建写入指定的OutputStream的ObjectOutputStream/

    特有的成员方法:
        void writeObject(Object obj) 将指定的对象写入ObjectOutputStream。
    步骤:
        1.创建ObjectOutputStream对象,构造方法中传递字节输出流
        2.使用writeObject方法,把对象写入到文件中
        3.释放资源

 */
public class ObjectOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("G:\\my_share\\code\\object.txt"));
        oos.writeObject(new Person("arman", 24));
        oos.close();
    }
}
