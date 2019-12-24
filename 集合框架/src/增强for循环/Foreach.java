package 增强for循环;
/*
    增强for循环，底层使用的也是迭代器，使用for循环的格式，简化了迭代器的书写
    是JDK1.5之后出现的新特性
    Collection<E> extends Iterable<E>: 所有的单列集合都可以使用增强for

    public interface Iterator Iterable<T>  实现这个接口允许对象成为 ”foreach“ 语句的目标
    格式：
        for(集合/数组的数据类型 变量名: 集合名/数组名){
            print(变量名)
        }
 */

import java.util.ArrayList;

public class Foreach {
    public static void main(String[] args) {
        demo01();
        demo02();
    }

    private static void demo02() {
        ArrayList<String > arrStr = new ArrayList<>();
        arrStr.add("aaa");
        arrStr.add("bbb");
        arrStr.add("ccc");

        for (String str: arrStr){
            System.out.println(arrStr);
        }
    }

    // 使用增强 for 循环遍历数组
    private static void demo01() {
        String[] arrList = {"aaa", "bbb", "ccc"};
        for (String arr: arrList){
            System.out.println(arr);
        }
    }
}
