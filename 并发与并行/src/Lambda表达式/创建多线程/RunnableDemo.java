package Lambda表达式.创建多线程;

public class RunnableDemo {
    public static void main(String[] args) {
        // 创建 Runnable 接口的实现类对象
        RunnableImpl impl = new RunnableImpl();
        // 创建Thread类对象,构造方法中传递 Runnable 接口的实现类
        Thread t = new Thread(impl);
        // 开启新线程,执行run方法
        t.start();



        // 简化代码,使用匿名内部类实现多线程程序
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "新线程任务创建");

            }
        };
        new Thread(r).start();
    }
}
