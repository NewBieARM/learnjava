package 时间;

import java.util.Date;

/*
    java.util.Data 表示日期和时间的类
    类 Data 表示特定的瞬间，精确到毫秒
    毫秒： 千分之一秒
    特定的瞬间：一个时间点

    日期转换为毫秒：
        时间原点：1970年1月1日 00:00:00
    把毫秒转换为日期：
        1天 = 24 x 60 x 60 = 86400 秒 x 1000 = 86400,000 毫秒

    中国属于东八区，会把时间增加 8 个小时  所以：1970年1月1日 08:00:00

 */
public class DemoDate {
    public static void main(String[] args) {
        // 获取系统的毫秒值
//        System.out.println(System.currentTimeMillis());
        demo2();
        demo3();
    }

    private static void demo2() {
        Date date = new Date();
        System.out.println(date);   // 当前时间
    }

    private static void demo3() {
        Date date = new Date();
        long time = date.getTime();
        System.out.println(time);  //System.currentTimeMillis()  跟这个一样的结果
    }
}
