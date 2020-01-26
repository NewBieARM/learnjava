package MethodReference;

public class MethodReferenceDemo{
    //定义一个方法,参数传递 Printable 接口,对字符串进行打印
    public static void printString(Printable p) {
        p.print("Hello,World");
    }

    public static void main(String[] args) {
        // 调用 printString 方法, 参数 Printable 是一个函数式接口,所以可以传递 Lambda
        printString(s-> System.out.println(s));

        /*
            分析:
                Lambda 表达式的目的,打印参数传递的字符串
                把参数s,传递给了System.out对象,调用了out对象中的方法 println 对字符串进行了输出
                注意:
                    1.System.out对象是已经存在的
                    2.println方法也是已经存在的
                所以可以使用方法引用来优化 Lambda 表达式
                可以使用System.out方法直接引用(调用) println 方法
         */
        printString(System.out::println);
    }
}
