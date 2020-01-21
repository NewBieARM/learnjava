package 打印流;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/*
    可以改变输出语句的目的地(打印流的流向)
    输出语句,默认在控制台输出
    使用System.setOut方法改变输出语句的目的地,改为参数中传递的打印流的目的地
        static void setOut(printStream out)
            重新分配"标准"输出流
 */
public class PrintStreamDemo2 {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("在控制台输出");

        PrintStream ps = new PrintStream("G:\\my_share\\code\\目的地打印流.txt");
        System.setOut(ps);
        System.out.println("我在打印流的目的地中输出");
        System.out.println("输出的内容在 'G:\\my_share\\code\\目的地打印流.txt' 文件中");

        ps.close();
    }
}
