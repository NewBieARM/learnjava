package Lambda表达式.创建多线程;

public class LambdaDemo {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "新线程任务创建");
            }
        }).start();

        //使用 Lambda变大时实现多线程
        new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + "新线程任务创建");
        }).start();
    }
}