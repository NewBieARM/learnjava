package 常用的函数式接口.ConsumerDemo;

import java.util.function.Consumer;

/*
    Consumer 接口的默认方法 andThen
    作用:需要两个 Consumer 接口,可以把两个 Consumer 接口组合到一起,在对数据进行消费

    例如:
        Consumer<String> com1
        Consumer<String> com2
        String s = "hello";
        con1.accept(s);
        con2.accept(s);

    andThen连接两个Consumer接口,在进行消费
        con1.andThen(con2).accept(s);
 */
public class andThenDemo {
    public static void method(String s, Consumer<String> con1,Consumer<String> con2){
//        con1.accept(s);
//        con2.accept(s);

        con1.andThen(con2).accept(s);


    }

    public static void main(String[] args) {
        method("hello,world", t->{
            //消费方式:把字符串转换为大写字母
            System.out.println(t.toUpperCase());
        }, t->{
            //消费方式:把字符串转换为小写字母
            System.out.println(t.toLowerCase());
        });

    }
}
