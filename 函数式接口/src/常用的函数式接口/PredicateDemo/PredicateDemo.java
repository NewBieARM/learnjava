package 常用的函数式接口.PredicateDemo;

import java.util.function.Predicate;

/*
    java.util.function.Predicate<T>接口
    作用:对某种数据类型的数据进行判断,结果返回一个 boolean 值

    Predicate 接口中包含一个抽象方法:
        boolean test<T t>:用来对指定数据类型进行判断的方法
        及如果:
            符合条件: true
            不符合: false
 */
public class PredicateDemo {
    /*
        定义一个方法
        参数传递一个String类型的字符串
        传递一个Predicate接口,泛型使用String
        使用Predicate中的方法test对字符串进行判断,并把结果返回
     */
    public static boolean checkString(String s, Predicate<String> pre){
        return pre.test(s);
    }

    public static void main(String[] args) {
        //调用checkString方法对字符串进行校验,参数传递字符串和Lambda表达式
        boolean bl = checkString("abide", (String str) -> {
            // 对参数传递的字符串进行判断,判断字符串的长度是否大于5, 并返回结果
            return str.length() > 5;
        });

        // 优化 Lambda
        boolean b = checkString("abide", str -> str.length() > 5);


        System.out.println(bl);
    }
}
