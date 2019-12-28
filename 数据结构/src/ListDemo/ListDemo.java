package ListDemo;

import java.util.ArrayList;
import java.util.List;

/*
    java.util.List 接口 extends Collections接口
    List接口的特点:
        1.有序的集合，存储元素合取元素的顺序是一致的
        2.有索引，包含了一些带索引的方法
        3.允许存储重复元素

    List 接口中带索引的方法(特有)：
        - public void add(int index, E element): 将指定的元素，添加到该集合中的指定位置上
        - public E get(int index): 返回集合中指定位置的元素
        - public E remove(int index)：移除列表中指定位置的元素，返回的是被移除的元素
        - public E set(int index, E element): 用指定元素替代集合中指定位置的元素，返回值是更新前的元素
    注意：
        操作索引的时候，一定要防止索引越界异常
 */
public class ListDemo {
    public static void main(String[] args) {
        // 创建一个元素 多态
        List<String> list = new ArrayList<>();

        // 添加元素
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");  //  [a, b, c, d]

        list.add(2, "tom");  //  [a, b, tom, c, d]

        //get 元素
        System.out.println(list.get(0));

        //移除
        String remove = list.remove(1);
        System.out.println(remove);  // b
        System.out.println(list);  // [a, c, d]

        // 替换
        String alex = list.set(2, "alex");
        System.out.println(alex);
        System.out.println(list);
    }
}
