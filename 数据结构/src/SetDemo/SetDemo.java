package SetDemo;

import java.util.HashSet;
import java.util.Set;

/*
    java.util.Set 接口 extends Collections 接口
    Set接口的特点：
        1.不允许存储重复的元素
        2.没有索引，没有带索引的方法，也不能使用普通的 for 循环遍历

    java.util.HashSet 集合 implements Set 接口
    HashSet特点：
        1.不允许存储重复的元素
        2.没有索引，没有带索引的方法，也不能使用普通for循环遍历
        3.是一个无序的集合，存储元素合取出元素的顺序有可能不一致
        4.底层是一个哈希表结构（查询的速度非常快）
 */
public class SetDemo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("a");
        set.add("b");
        set.add("c");
        set.add("d");
        for (String s : set) {
            System.out.println(s);
        }
    }
}
