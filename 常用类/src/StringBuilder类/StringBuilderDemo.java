package StringBuilder类;

/*
    StringBuilder 两个常用的方法：
        public StringBuilder append(...)； 添加任意类型数据的 字符串形式，并返回当前对象本身

    StringBuilder 和 String 相互转换：
        String -> StringBuilder :可以使用StringBuilder 的构造方法
            StringBuilder(String str) 构造一个字符串生成器，并初始化为指定的字符串内容
        StringBuilder -> String ：可以使用用 StringBuilder的toString方法：
            public String toString(): 将当前的 StringBuilder 对象转换为String 对象
 */
public class StringBuilderDemo {
    public static void main(String[] args) {
//        demo01();
//        demo02();
        demo03();
    }

    private static void demo03() {
        // String -> StringBuilder
        String str = "hello";
        StringBuilder bu = new StringBuilder(str);
        System.out.println(bu);

        // StringBuilder -> String
        StringBuilder bu2 = new StringBuilder("abc");
        String str2 = bu2.toString();
        System.out.println(str2);
    }

    private static void demo02() {
        StringBuilder str = new StringBuilder();
        // append 方法返回的是 this， 调用方法的对象 str， this== str
//        StringBuilder str2 = str.append("abc");  // 把 str 的地址 赋值给了 str2
//        System.out.println(str);
//        System.out.println(str2);
//        System.out.println(str == str2);  // true

        // 因为返回值还是StringBuilder类型  所以可以链式编程
        str.append("abd").append(123).append('中');
        System.out.println(str);

    }

    private static void demo01() {
        /*
            两种构造方法
         */
        StringBuilder str = new StringBuilder();
        System.out.println(str);  //默认是空的
        StringBuilder str2 = new StringBuilder("abc");
        System.out.println(str2);  // abc

    }

}
