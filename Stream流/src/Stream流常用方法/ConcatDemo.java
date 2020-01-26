package Stream流常用方法;

import java.util.stream.Stream;

/*
    concat方法:用于把流组合到一起
    如果有两个流,希望合并成一个流,那么可以使用Stream就扣的静态方法 concat
    static <T> Stream<T> concat(Stream<? extends T> a, Stream<? extends T> b)
 */
public class ConcatDemo {
    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("张三", "李四", "王五", "赵六");
        Stream<String> stream2 = Stream.of("1", "2", "3", "4");

        // 使用 Stream流 的静态方法concat, 把两个流组合到一起
        Stream<String> concat = Stream.concat(stream1, stream2);

        concat.forEach(str -> System.out.println(str));
    }
}
