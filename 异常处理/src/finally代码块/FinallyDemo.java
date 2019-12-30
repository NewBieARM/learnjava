package finally代码块;

import java.io.FileNotFoundException;
import java.io.IOException;

/*
    finally代码块
    无论发布发生异常都要执行
    格式:
        try{
            可能产生异常的代码
        }catch(定义一个异常的变量,用来接受try中抛出的异常对象){
            异常的处理罗技,异常之后,怎么处理异常对象
            一般会把异常的信息记录到一个日志中
        }
        ...
        catch(异常类名 变量名){

        }finally{
            无论是否出现异常都会执行
        }
        注意实现:
            1. finally 不能单独使用,必须和try一起使用
            2. finally一般用于资源释放(资源回收),无论程序是否出现异常,最后都要释放资源(IO)
 */
public class FinallyDemo {
    public static void main(String[] args) {
        try{
            readFile("c:\\ab.txt");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("finally 代码块");
        }
        System.out.println("后续代码");
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
