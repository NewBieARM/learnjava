package 常用的函数式接口.ConsumerDemo;

import java.util.function.Consumer;

/*
    java.util.function.Consumer<T>接口则正好与Supplier接口相反,
        他不是生产一个数据,而是消费一个数据,其数据类型由泛型决定.
    Consumer接口中包含抽象方法 void accept(T t), 意为消费一个指定泛型的数据

    Consumer接口是一个消费型接口,泛型执行什么类型数据,就可以使用accept方法消费什么类型的数据
    至于怎么消费需要自定义(输出,计算)
 */
public class ConsumerDemo {
    /*
        定义一个方法
        方法的参数传递一个字符串的姓名
        方法的参数传递 Consumer 接口,泛型使用String
        方法使用Consumer 接口消费字符串
     */
    public static void method(String name, Consumer<String> con){
        con.accept(name);
    }

    public static void main(String[] args) {
        method("迪丽热巴", (String name)->{
            // 对传递的字符串进行消费
            //消费方式:直接输出
            System.out.println(name);

            //消费方式:字符串反转
            String rename = new StringBuffer(name).reverse().toString();
            System.out.println(rename);


        });
    }
}
