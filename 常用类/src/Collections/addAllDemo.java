package Collections;

import java.util.ArrayList;
import java.util.Collections;
/*
    public static <T> boolean addAll(Collection<T> c, T... elements) :往集合中添加一些元素。
 */
public class addAllDemo {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        Collections.addAll(arr, "arman", "alex");
        System.out.println(arr);
    }
}
