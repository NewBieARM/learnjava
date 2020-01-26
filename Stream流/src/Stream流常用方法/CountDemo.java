package Stream流常用方法;

import java.util.stream.Stream;

/*
    count 方法用于统计Stream流中元素的个数
    long count();
    count方法是一个终结方法,返回值是一个long类型的整数
    所以不能继续调用Stream流中的其他方法了
 */
public class CountDemo {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("张三", "李四", "王五", "赵六");
        long count = stream.count();
        System.out.println(count);
    }
}
