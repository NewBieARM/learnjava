package Stream流常用方法;

import java.util.stream.Stream;

/*
    如果需要将流中的元素映射到另一个流中,可以使用map方法,
    <R> Stream<R> map<Function<? super T, ? extends R> mapper);
    该接口需要一个Function函数式接口参数,可以将流中的T类型数据转换为另一个R类型的流
    Function中的抽象方法
        R apply(T t);
 */
public class MapDemo {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("1", "2", "3", "4");
        //使用map方法,把字符串类型的整数,转换(映射)为Integer类型的数据
        Stream<Integer> integerStream = stream.map(s -> Integer.parseInt(s));
        integerStream.forEach(i -> System.out.println(i));
    }
}
