package 异常声明throws;

import java.io.FileNotFoundException;
import java.io.IOError;
import java.io.IOException;

/*
    throws关键字:异常处理的第一种方式,交给别人处理
    作用:
        可以使用throws关键字处理异常,会把异常对象声明抛出给方法的调用者处理(给别人处理),最终交给JVM处理 -->中断处理
    格式:
        修饰符 返回值类型 方法名(参数列表) throws {
            throw new AAAException("产生原因");
            throw new BBBException("产生原因");
            ...
        }

    注意:
        1. throws关键字必须写在方法声明处
        2. throws关键字后边声明的异常必须是Exception或者Exception子类
        3. 方法体内部如果抛出了多个异常,那么throws后面也必须声明多个异常,
            如果抛出的多个异常对象有子父关系,那么直接声明父类异常即可
        4. 调用了一个声明抛出异常的方法,就必须处理声明的异常,
            要么继续使用throws声明抛出,交给方法的调用者处理,最终交给JVM
            要么try...catch 自己处理异常
 */
public class ThrowsDemo {
    /*
        FileNotFoundException extends IOException
            所以之声明 IOException就好

        所有异常都是 Exception 的子类 所以直接写Exception也可以
     */
//    public static void main(String[] args) throws FileNotFoundException, IOException {
//    public static void main(String[] args) throws IOException {
    public static void main(String[] args) throws Exception {
        readFile("c:\\a.txt");
    }
    /*
       定义一个方法,对传递的文件路径进行合法性判断
       如果路径不是 "c:\\a.txt",那么就抛出文件找不到异常x对象,告知方法的调用者
     */
//    public static void readFile(String path) throws FileNotFoundException,IOException {
//    public static void readFile(String path) throws IOException {
    public static void readFile(String path) throws Exception {
        if (!path.equals("c:\\a.txt")){
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
