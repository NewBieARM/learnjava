package 常用的函数式接口.FunctionDemo;

import java.util.function.Function;
/*
    需求:
        把String类型的"123",转换为Integer类型,把转换后的结果加10
        把增加之后的Integer类型的数据,转换为String类型
 */
public class Function_andThen {
    public static void method(String str, Function<String, Integer> func1, Function<Integer, String> func2){
        String result = func1.andThen(func2).apply(str);
        System.out.println(result);
    }

    public static void main(String[] args) {
        method("123", str -> Integer.parseInt(str)+10, str->str+"");
    }
}
