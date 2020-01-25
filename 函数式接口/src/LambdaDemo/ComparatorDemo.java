package LambdaDemo;

import java.util.Arrays;
import java.util.Comparator;

/*
    如果一个方法的返回值类型是一个函数式接口,那么就可以直接返回一个 Lambda 表达式
    当需要通过一个方法来获取一个 java.util.Comparator 接口类型的对象作为排序器时,就可以掉该方法获取
 */
public class ComparatorDemo {
    // 定义一个方法,方法的返回值类型使用函数式接口 Comparator
    public static Comparator<String> getComparator(){
        //方法的返回值类型是一个接口, 所以可以返回接口的匿名内部类
//        return new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o2.length() - o1.length();
//            }
//        };

        //方法的返回值类型是一个接口, 所以可以返回 Lambda 表达式
        return (o1, o2)-> o2.length() - o1.length();
    }

    public static void main(String[] args) {
        String[] arr = {"a", "bbb", "cc"};
        System.out.println(Arrays.toString(arr));  // 排序前

        Arrays.sort(arr, getComparator());  //按照定义的规则排序

        System.out.println(Arrays.toString(arr));  // 排序后

    }
}
