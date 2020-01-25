package 常用的函数式接口.practice;

import java.util.function.Function;

/*
    练习:自定义函数模型拼接
        请使用Function进行函数模型的拼接,按照顺序需要执行的多个函数操作:
        String str = "迪丽热巴,20"
    分析:
        1.将字符串截取数字年龄部分,得到字符串;
        2.将上一步的字符串转换为int类型的数字
        3.将上一步的int数字累计加100,得到int数字
 */
public class FunctionPractice {
    public static void change(String info, Function<String, String> func1, Function<String, Integer> func2, Function<Integer, Integer> func3) {
        Integer result = func1.andThen(func2).andThen(func3).apply(info);
        System.out.println(result);
    }

    public static void main(String[] args) {
        change("迪丽热巴,20", str -> str.split(",")[1], str ->Integer.parseInt(str), str-> str+100);
    }
}
