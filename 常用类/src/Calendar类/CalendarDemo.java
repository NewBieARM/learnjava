package Calendar类;

import java.util.Calendar;

/*
    java.util.Calendar 类；日历类
    Calendar 类是一个抽象类，里边提供了很多操作日历的方法（YEAR,MONTH,DAY_OF_MONTH,HOUR）
    Calendar 类是无法直接创建对象使用，里边有一个【静态方法】叫getInstance()，该方法返回Calendar类的子类对象
    static Calendar getInstance() 使用默认时区和语言环境获得一个日历

    Calendar类的常用成员方法：
        public int get(int field) 返回给定字段的值
        public void set(int field, itn value): 将给定的日历字段设置为给定值
        public abstract void add(int field, int amount): 根据日历规则，为给定的日历字段添加或减去指定的时间量
        public Date getTime();返回一个表示此Calendar时间值的Date对象

 */
public class CalendarDemo {
    public static void main(String[] args) {
//        demo01();
//        demo02();
        demo03();
    }

    private static void demo03() {
        /*
            public abstract void add(int field, int amount)
            参数：
                int field: 传递指定的日历字段
                int amount: 增加/减少指定的值
  ·      */
        Calendar result = Calendar.getInstance();
        result.add(Calendar.YEAR, -2);
        int year = result.get(Calendar.YEAR);
        System.out.println(year);

        int month = result.get(Calendar.MONTH);
        System.out.println(month);   //西方的月份 0-11

        int dayOfMonth = result.get(Calendar.DAY_OF_MONTH);
        System.out.println(dayOfMonth);  // 这个月的第几天

        int hour = result.get(Calendar.HOUR);
        System.out.println(hour);
    }

    private static void demo02() {
        /*
            public void set(int field, inr value): 将给定的日历字段设置为给定值
            参数：
                int field 传递指定的日历字段(YEAR, MONTH ...)
                int value 给指定字段设置的值
         */


        Calendar result = Calendar.getInstance();
        // 设置年为 9999 年
        result.set(Calendar.YEAR, 9999);
        result.set(Calendar.MONTH, 5);

        // 同时设置年月日, 重载方法
        result.set(1997,5,3);

        int year = result.get(Calendar.YEAR);
        System.out.println(year);

        int month = result.get(Calendar.MONTH);
        System.out.println(month);   //西方的月份 0-11

        int dayOfMonth = result.get(Calendar.DAY_OF_MONTH);
        System.out.println(dayOfMonth);  // 这个月的第几天

        int hour = result.get(Calendar.HOUR);
        System.out.println(hour);
    }

    private static void demo01() {
        /*
            public int get(int field):返回给定日历字段的值
            参数：传递指定的日历字段(YEAR, MONTH ...)
            返回值：日历字段代表的具体的值
         */
        Calendar result = Calendar.getInstance();
        int year = result.get(Calendar.YEAR);
        System.out.println(year);

        int month = result.get(Calendar.MONTH);
        System.out.println(month);   //西方的月份 0-11

        int dayOfMonth = result.get(Calendar.DAY_OF_MONTH);
        System.out.println(dayOfMonth);  // 这个月的第几天

        int hour = result.get(Calendar.HOUR);
        System.out.println(hour);
    }
}
