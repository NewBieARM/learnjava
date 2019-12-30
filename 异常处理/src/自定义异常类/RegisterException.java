package 自定义异常类;
/*
    自定义异常类:
        java提供的异常类,不够我们使用,需要自定义一些异常类
    格式:
        public class XXXException extends Exception / RuntimeException{
            添加一个空参数的构造方法
            添加一个带异常信息的构造方法
        }
    注意:
        1. 自定义异常类一般都是Exception结尾,说明该类是一个异常类
        2. 自定义异常类,必须得继承Exception或者RuntimeException
            继承Exception:那么自定义的异常类就是一个编译器一场,如果方法内部出现了编译器异常,就必须处理个异常.要么throws,要么try..catch
            继承RuntimeException:那么自定义的异常类就是一个运行期异常,无需处理,交给JVM处理(中断处理)
 */
public class RegisterException extends /*Exception*/ RuntimeException{
    // 添加一个空参数构造方法
    public RegisterException(){
        super();
    }

    // 添加一个带异常信息的构造方法
    public RegisterException(String message) {
        super(message);
    }

}
