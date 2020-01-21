package 序列化和反序列化.反序列化;

import 序列化和反序列化.序列化.Person;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/*
    java.io.ObjectInputStream extends InputStream
        ObjectInputStream: 对象的反序列化流
        作用：把文件中保存的对象,以流的方式读取出来
    构造方法:
        ObjectInputStream(InputStream in) 创建从指定的InputStream读取的ObjectInputStream
    特有的方法:
        Object readObject() 从ObjectInputStream读取一个对象。

    步骤:
        1.创建ObjectInputStream对象,构造方法中传递字节输入流
        2.使用readObject()方法读取保存对象的文件
        3.释放资源
        4.使用读取出来的对象

    readObject方法声明抛出了 ClassNotFoundException(class文件找不到异常)
    当不存在对象的class文件时会抛出此异常
    反序列化的前提:
        1.类必须实现Serializable
        2.必须存在类对应的class文件
 */
public class ObjectInputStreamDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("G:\\my_share\\code\\object.txt"));
        Object obj = ois.readObject();
        ois.close();
        System.out.println(obj);
        Person o = (Person)obj;
        System.out.println(o);
    }
}
