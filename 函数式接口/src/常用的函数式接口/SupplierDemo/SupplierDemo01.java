package 常用的函数式接口.SupplierDemo;

import org.w3c.dom.ls.LSOutput;

import java.util.function.Supplier;

/*
    常用的函数式接口
    java.util.function.Supplier<T>接口仅包含一个无参的方法: T get(). 用来获取一个泛型参数指定类型的对象数据

    Supplier<T>接口被称为生产型接口,指定接口的泛型是什么类型,那么接口中的get方法就会生产什么类型的数据
 */
public class SupplierDemo01 {
    // 定义一个方法,方法的参数传递Supplier<T>接口,泛型执行 String, get 方法就会返回一个String
    public static String getString(Supplier<String> sup) {
        return sup.get();
    }

    public static void main(String[] args) {
        // 调用 getString 方法,方法的参数 Supplier 是一个函数式接口,所以可以传递 Lambda 表达式
        String str = getString(() -> "迪丽热巴"); // 生产一个字符并返回
        System.out.println(str);
    }
}
