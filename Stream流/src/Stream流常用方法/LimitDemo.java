package Stream流常用方法;

import java.util.stream.Stream;

/*
    limit:用于截取六种的元素
    limit方法可以对流进行截取,只取用前n个,
    Stream<T> limit(long maxSize);
        参数是一个long类型,如果集合长度大于参数则进行截取;否则不进行操作
    limit是一个延迟方法,只对流中的元素进行截取,返回的是一个新的流,返回的是一个新的流,所以可以继续调用Stream流中的其他方法
 */
public class LimitDemo {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("张三", "李四", "王五", "赵六");

        // 截取前两个
        Stream<String> limit = stream.limit(2);

        limit.forEach(name -> System.out.println(name));
    }
}
