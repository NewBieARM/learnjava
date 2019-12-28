package Collections;

import java.util.ArrayList;
import java.util.Collections;

/*
    public static <T> void sort(List<T> list): 将集合中元素按照默认规则排序

    注意：
        sort(List<T> list) 使用前提：
        被排序的集合里边存储的元素，必须实现Comparable 重写接口的方法compareTo 定义排序规则

    Comparable 接口的排序规则：
        自己(this) - 参数： 升序
 */
public class SortDemo {
    public static void main(String[] args) {
        // Integer
        ArrayList<Integer> list01 = new ArrayList<>();
        Collections.addAll(list01, 1, 3, 2, 7, 5);
        Collections.sort(list01);
        System.out.println(list01);

        // String
        ArrayList<String> list02 = new ArrayList<>();
        Collections.addAll(list02, "a", "b", "g", "c");
        Collections.sort(list02);
        System.out.println(list02);

        // 自定义类 Person
        ArrayList<Person> list03 = new ArrayList<>();
        list03.add(new Person("arman", 18));
        list03.add(new Person("alex", 17));
        list03.add(new Person("atom", 20));
        Collections.sort(list03);
        System.out.println(list03);

    }
}
