package SetDemo;

import java.util.HashSet;
import java.util.LinkedHashSet;

/*
    java.util.LinkedHashSet集合 extends HashSet集合
    LinkedHashSet集合特点：
        底层是一个哈希表（数组+链表/红黑树）+链表；多了一条链表（记录元素的存储顺序），保证元素有序
 */
public class LinkedHashSetDemo {
    public static void main(String[] args) {
        demo01();
        demo02();
    }

    private static void demo02() {
        /*
            有序的
         */
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("abc");
        set.add("顶呱呱");
        set.add("www");
        System.out.println(set);
    }

    private static void demo01() {
        /*
            无序的
         */
        HashSet<String> set = new HashSet<>();
        set.add("abc");
        set.add("顶呱呱");
        set.add("www");
        System.out.println(set);
    }
}
