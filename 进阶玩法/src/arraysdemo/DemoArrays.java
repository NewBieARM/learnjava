package arraysdemo;

import java.util.Arrays;

/*
java.util.Arrays 是一个与数组相关的工具类，里面提供了大量的静态方法，用来实现数组常见的操作

public static String toString(数组) ：将参数数组变成字符串（按照默认格式： [元素1，元素2， 元素3]
public static void sort(数组) : 按照默认升序对数组的元素进行排序

PS：
    1. 如果实数值，sort 默认按照升序从小到大
    2. 如果是字符串，sort默认按照字母升序
    3. 如果是自定义类，那么这个自定义的类需要有 Comparable 或者 Comparator 接口支持
 */
public class DemoArrays {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        String intArray = Arrays.toString(array);  //  [1, 2, 3, 4]

        int[] array2 = {5, 8, 4, 10, 2, 1, 44};
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array2));  //  [1, 2, 4, 5, 8, 10, 44]

        String[] array3 = {"arman", "Darn", "alex", "tom"};
        Arrays.sort(array3);
        System.out.println(Arrays.toString(array3));   //  [Darn, alex, arman, tom]  //第一个字母 ASCII 码排序
    }
}
