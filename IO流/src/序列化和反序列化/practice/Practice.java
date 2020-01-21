package 序列化和反序列化.practice;

import java.io.*;
import java.util.ArrayList;

/*
    练习: 序列化集合
        当我们想在文件中保存到多个对象的时候
        可以把多个对象存储到一个集合中
        对集合进行序列化和反序列化

    分析:
        1.定义一个存储Person对象的ArrayList集合
        2.往ArrayList集合中把若干Person对象
        3.创建一个序列化流ObjectOutputStream,对集合进行序列化
        4.创建一个反序列化流ObjectInputStream, 对集合进行反序列化
 */

public class Practice {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person p1 = new Person("arman", 23);
        Person p2 = new Person("迪丽热巴", 24);
        Person p3 = new Person("古力娜扎", 24);

        ArrayList<Person> arr = new ArrayList<>();
        arr.add(p1);
        arr.add(p2);
        arr.add(p3);

        serialization(arr);
        deserialization();
    }

    public static void serialization(ArrayList<Person> list ) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("G:\\my_share\\code\\Practice_Person.txt"));
//        for (Person person : list) {
//            oos.writeObject(person);
//        }
        oos.writeObject(list);
        oos.close();
        System.out.println("序列化成功!");
    }

    public static void deserialization() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("G:\\my_share\\code\\Practice_Person.txt"));

        Object obj = ois.readObject();

        ArrayList<Person> arrList= (ArrayList<Person>)obj;

        for (Person person : arrList) {
            System.out.println(person.getName() + "->" + person.getAge());
        }

        ois.close();

    }
}
