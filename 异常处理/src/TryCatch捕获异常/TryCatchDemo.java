package TryCatch捕获异常;

import java.io.FileNotFoundException;
import java.io.IOException;

/*
    try ... catch: 异常处理的第二种方式,自己处理异常
    格式:
        try{
            可能产生异常的代码
        }catch(定义一个异常的变量,用来接受try中抛出的异常对象){
            异常的处理罗技,异常之后,怎么处理异常对象
            一般会把异常的信息记录到一个日志中
        }
        ...
        catch(异常类名 变量名){

        }
    注意:
        1. try 中可能会抛出多异常对象,那么就可以使用多个catch来处理这些异常对象
        2. 如果try中产生异常,那么就会执行catch中的异常逻辑,执行完毕catch中的处理逻辑们继续执行try..catch之后的代码
        如果try中没有产生异常,那么就不会执行catch中异常的处理逻辑,执行完try中的代码,继续执行try..catch之后的代码
 */
public class TryCatchDemo {
    public static void main(String[] args) {
        try {
            // 可能产生异常的代码
            readFile("d://a.txt");
        } catch (Exception e) { // try中抛出什么异常对象,catch就定义什么异常变量来接受异常对象
            // 异常处理逻辑
            System.out.println("catch里边的代码...");

            /*
                Throwable类中定义了3个异常处理方法
                    1. String getMessage(); 返回此 throwable 的纤细信息字符串
                    2. String toString() 返回 throwable 的简短描述
                    3. void printStackTrace() JVM打印异常对象,默认打印此方法,打印的异常信息是最全面的
             */
//            System.out.println(e.getMessage()); // -> 找不到文件
//            System.out.println(e.toString());  // -> java.io.FileNotFoundException: 找不到文件
            e.printStackTrace();  // 最全面
        }
        System.out.println("后续代码...");
    }

    public static void readFile(String path) throws Exception {
        if (!path.equals("c:\\a.txt")) {
            throw new FileNotFoundException("找不到文件");
        }

        // 如果不是.txt结尾
        //那么就抛出IO异常对象,告知调用者文件后缀名不对
        if (!path.endsWith(".txt")) {
            throw new IOException("文件后缀名不对");
        }

        System.out.println("已找到文件");
    }
}
