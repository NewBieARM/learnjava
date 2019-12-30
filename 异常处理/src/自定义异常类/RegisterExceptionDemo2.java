package 自定义异常类;

import java.util.Scanner;

/*
    要求:模拟注册操作,如果用户名已存在,则抛出异常并提示:亲,该用户名已经被注册

    分析:
        1.使用数组保存已经注册过的用户名(数据库)
        2.使用Scanner获取用户输入的用户名(前端页面)
        3.定义一个方法,对用户输入的用户名进行判断
            遍历存储已经注册过的数组,获取每一个用户名
                true:
                    用户名已经存在,抛出RegisterException异常
                false:
                    继续遍历
                如果循环结束了,还没有找到重复的用户名,提示 "恭喜,注册成功"
 */
public class RegisterExceptionDemo2<Static> {
    static String[] userNames = {"张三", "李四", "王五"};

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入用户名: ");
        String userName = input.next();
        checkUsername(userName);
    }

    private static void checkUsername(String userName) {
        for (String name : userNames) {
            if (userName.equals(name)) {
                // RuntimeException 会中断处理
                throw new RegisterException("亲,该用户名已经被注册"); // 抛出运行期异常,无需处理,交给JVM处理,中断处理
            }
        }
        System.out.println("恭喜,注册成功");
    }
}

