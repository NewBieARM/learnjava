package Stream流常用方法;

import java.util.stream.Stream;
/*
    skip: 用于跳过元素
    如果希望跳过前几个元素,可以使用skip方法获取一个截取之后的新流
    Stream<T> skip(long n);
        如果流的当前长度大于n,则跳过前n个;否则将会得到一个长度为0的空流
 */
public class SkipDemo {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("张三", "李四", "王五", "赵六");

        // 跳过前两个元素
        Stream<String> skip = stream.skip(2);

        skip.forEach(name -> System.out.println(name));

    }
}
