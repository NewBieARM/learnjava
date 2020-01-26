package Stream流常用方法;

import java.util.stream.Stream;

/*
    Stream流中的常用方法_filter:用于对Stream流中的数据进行过滤
    Stream<T> filter(Predicate<? super T> predicate);
    filter方法的参数Predicate是一个函数式接口,所以可以传递Lambda表达式,对数据进行过滤
    Predicate中的抽象方法:
        boolean test(T t)
 */
public class FilterDemo {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("张三丰", "张催化", "赵六", "张无忌", "迪丽热巴");
        // 利用filter对Stream流进行过滤,只要姓张的
        Stream<String> stream1 = stream.filter(name -> name.startsWith("张"));
        stream1.forEach(name -> System.out.println(name));

        /*
            Stream流属于管道流,只能被消费(使用)一次
            第一个Stream流调用完毕方法,数据就会流转到下一个Stream
            而这时第一个Stream流已经使用完毕,就会关闭
            所以第一个Stream流就不能调用方法
         */

//        stream.forEach(name-> System.out.println(name)); // stream has already been operated upon or closed

    }
}
