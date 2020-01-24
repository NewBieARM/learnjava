package LambdaDemo;
/*
    使用 Lambda优化日志案例
    Lambda的特点:延迟加载
    Lambda的使用前提,必须存在函数式接口
 */
public class LoggerDemo2 {
    // 定义一个方法显示日志等级,方法的参数传递日志的等级和 MessageBuilder
    public static void showLog(int level, MessageBuilder mb){
        //对日志的等级进行判断, 如果是一级则调用MessageBuilder中的builderMessage方法
        if (level == 1){
            System.out.println(mb.builderMessage());
        }}


        public static void main(String[] args) {
            // 定义三个日志信息
            String msg1 = "Hello";
            String msg2 = "World";
            String msg3 = "Java";

            /*
                调用 showLog 方法,参数 MessageBuilder 是一个函数式接口,所以可以传递Lambda表达式

                使用 Lambda 表达式作为参数传递,仅仅是把参数传递到 showLog 方法中
                只有满足条件
                    才会调用接口中的方法,进行字符串拼接
                如果条件不满足,
                    就不对掉哦那个接口的方法,也不会进行拼接, 不会存在性能浪费
             */
            showLog(1, ()-> msg1+msg2+msg3);
        }
}

