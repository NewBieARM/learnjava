package 包装类;
/*
    基本类型与字符串类型之间的相互转换
    基本类型 ——>  字符串(String)
        1.基本类型的值 + "" 最简单的方法（工作中常用）
        2.包装类的静态方法 toString(参数)，【不是 Object 类的toString() 重载】
            static String toString(int i)
            返回一个表示指定整数的额String对象
        3.String 类的静态方法 valueOf(参数)
            static String valueOf(int i) 返沪 int 参数的字符串表示形式/

     字符串(String) -> 基本类型
        使用包装类的静态方法ParseXXX("字符串")；
          Integer类 ： static int parseInt(String s);
          Double类 ： static double parseDouble(String s); ...
 */
public class StringDemo {
    public static void main(String[] args) {
        // 基本类型 ——>  字符串(String)
//        demo01();

        // 字符串(String) -> 基本类型
        demo02();
    }

    private static void demo02() {
        int in1 = Integer.parseInt("100");
        System.out.println(in1 + 200); // 300

        double d1 = Double.parseDouble("100.1");
        System.out.println(d1 + 10);  // 110.1

        //错误写法
        int result = Integer.parseInt("a");
        System.out.println(result);  // 抛异常 NumberFormatException
    }

    private static void demo01() {
        int i1 = 100;
        String s1 = i1 + "";
        System.out.println(s1 + 200);  // 100200

        String s2 = Integer.toString(100);
        System.out.println(s2 + 200);

        String s3 = String.valueOf(100);
        System.out.println(s3 + 200);

    }
}
