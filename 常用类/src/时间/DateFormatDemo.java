package 时间;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 java.text.DateFormat: 是日期/时间格式化子类的抽象类
 作用：
    格式化（也就是日期 -> 文本）、解析（文本 -> 日期）
 成员方法：
    String format(Date date)  按照指定的模式，把 Date 日期，格式化为符合模式的字符串
    Date parse()  把符合模式的字符串，解析为 Date 日期
 DateFormat 类说一个抽象类，无法直接创建对象使用，可以使用 DateFormat 类的子类

 java.text.SimpleDateFormat  extends DateFormat
 构造方法：
    SimpleDateFormat(String pattern)
        用给定的模式和默认语言环境的日期格式符号构造 SimpleDateFormat
      参数：a
        String pattern: 传递指定的模式   区分大小写
        y  年    H   时
        M  月    m   分
        d  日    s    秒

      写对应的模式，会把模式替换为对应的日期和时间
            "yyy-MM-dd HH:mm:ss"
      注意：
        模式中的字母不能更改，连接模式的符号可以改变
 */
public class DateFormatDemo {
    public static void main(String[] args) throws ParseException {
        demo01();
        demo02();
    }

    private static void demo01() {
        /*
        使用 DateFormat 类中的 format ，把日期格式化为文本
        步骤：
            1.创建 SimpleDateFormat 对象，构造方法中传递指定的模式
            2.调用 SimpleDateFormat 对象的方法 format ，按照构造方法中的指定模式，把Date 日期格式化为符合模式的字符串
         */
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY年MM月dd日  HH点mm分ss秒");
        Date date = new Date();  // 创建 一个 Date 对象，获取时间

        String d = sdf.format(date.getTime());

        System.out.println(date);  //  Sun Dec 22 21:27:01 GMT+08:00 2019
        System.out.println(d);  //  2019年12月22日  21点27分01秒
    }

    private static void demo02() throws ParseException {
        /*
        使用DateFormat类中的 parse ，把文本解析为日期
        使用步骤：
            1.创建 SimpleDateFrame 对象，构造方法中传递指定模式
            2.调用 SimpleDateFrame 对象中的方法 parse，把符合构造的方法中模式的字符串。解析为 Date 日期

            注意事项：
                public Date parse(String source) throw ParseException

                parse 方法声明了一个异常叫 ParseException
                如果字符串和构造方法的模式不一样，那么程序就会抛出异常
                调用另一抛出了异常的方法，就必须得处理这个异常，要么 throws 继续抛出这个异常，要么 try catch 自己处理
         */
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY年MM月dd日  HH点mm分ss秒");
        Date resualt = sdf.parse("2019年12月22日  21点27分01秒");  // 这个里的模式得和 上面的一模一样，不然会抛出异常
        System.out.println(resualt);  //  Sun Dec 30 21:27:01 GMT+08:00 2018
    }
}
