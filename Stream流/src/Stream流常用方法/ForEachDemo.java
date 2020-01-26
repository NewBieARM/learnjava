package Stream流常用方法;

import java.util.stream.Stream;

/*
    Stream 流中的常用方法_forEach
    void forEach(Consumer<? super T> action;
    该方法接受一个 Consumer接口函数,会将每一个流元素交给该函数进行处理.
    Consumer接口是一个消费型的函数式接口,可以传递一个Lambda表达式

    简单记:
        forEach方法,用来遍历流中的数据
        是一个终结方法,遍历之后就不能继续调用Stream流中的其他方法
 */
public class ForEachDemo {
    public static void main(String[] args) {
        // 获取一个Stream流
        Stream<String> stream = Stream.of("张三", "李四", "王五", "赵六");
        // 使用forEach对Stream流中的数据进行遍历
        stream.forEach(name -> System.out.println(name));
    }
}
