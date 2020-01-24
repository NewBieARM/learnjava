package LambdaDemo;
/*
    日志案例

    一下代码存在一些性能浪费
    盗用 showLog 方法,传递的第二个参数是一个拼接后的字符串
    先把字符串拼接好,然后在调用 showLog 方法
    showLog 方法中如果传递的日志等级不是 1 级
    那么就不会是如此拼接后的字符串
    所以感觉字符串就百聘接了,存在浪费
 */
public class LoggerDemo {
    // 定义一个根据日志的级别,显示日志信息的方法
    public static void showLog(int lever, String msg){
        //对日志的等级进行判断,如果是1级别,那么输出日志信息
        if (lever == 1) {
            System.out.println(msg);
        }
    }

    public static void main(String[] args) {
        // 定义三个日志信息
        String msg1 = "Hello";
        String msg2 = "World";
        String msg3 = "Java";

        // 调用 showLog 方法
        showLog(2, msg1 + msg2 + msg3);
    }
}
