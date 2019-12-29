package linkedhashmap;

import java.util.LinkedHashMap;
/*
    有序的集合
    底层原理:
        哈希表+链表(记录元素的顺序)
 */
public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        map.put("arman", "newbie");
        map.put("alex", "newbie");
        map.put("tom", "hanPi");
        System.out.println(map);
    }
}
