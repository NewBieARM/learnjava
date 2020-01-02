package Thread类常用方法.sleep;
/*
    public static void sleep(long millis): 是当前正在执行的线程已指定的毫秒数暂停(暂停执行)
    毫秒数结束之后,线程继续执行
 */
public class SleepDemo {
    public static void main(String[] args){
        // 模拟秒表
        for (int i = 1; i <= 60; i++) {
            System.out.println(i);

            //使用Thread类的sleep方法让程序睡眠一秒
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
