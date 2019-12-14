package mathdemo;
/*
java.util.Math 类是数学相关的工具类，里面提供了大量的静态方法，完成于数学运算相关操作

public static double abs(double num): 获取绝对值
public static double ceil(double num): 向上取整。 13.1 --> 14.0   不是四舍五入
public static double floor(double num): 向下取整
public static long round(double num): 四舍五入
 */
public class MathDemo {
    public static void main(String[] args) {
        // 获取绝对值
        System.out.println(Math.abs(-3.14));  // 3.14

        //向上取整。
        System.out.println(Math.ceil(13.1));  // 14.0

        //向下取整。
        System.out.println(Math.floor(13.9));  //  13.0

        //四舍五入
        System.out.println(Math.round(13.45));  //13
    }
}
