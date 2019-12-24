package 泛型;

import java.util.ArrayList;

/*
    创建集合对象，不使用泛型
        好处：
            集合不使用泛型，默认的类型就是 Object 类型，可以存储任意类型的数据
        弊端：
            不安全，会引发异常

    创建集合对象，使用泛型
        好处：
            1.避免了类型转换的麻烦，存储的是什么类型，取出就是什么类型
            2.把运行期异常（代码运行之后会抛出的异常）提升到了编译期（写代码回报错）
        弊端：
            泛型是什么类型，只能存储什么类型的数据
 */
public class GenericDemo {
    public static void main(String[] args) {
        show01();
        show02();
    }

    private static void show02() {
        ArrayList<String> strList = new ArrayList<>();
        strList.add("asb");
//        strList.add(12); // 会报错
    }

    private static void show01() {
        ArrayList list = new ArrayList();
        list.add("asd");
        list.add(1);
        // 需要使用 String 类特有的方法，length获取字符串的长度；不能使用  多态 Object obj = "pbj"
        //需要向下转型
        for (Object o : list) {
            System.out.println(o);
            String s = (String)o; // ClassCastException 因为不能把Integer类型转换为String类型
        }
        System.out.println(list);

    }
}
