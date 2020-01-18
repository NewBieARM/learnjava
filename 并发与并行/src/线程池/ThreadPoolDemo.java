package 线程池;

import java.lang.reflect.Executable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/*
    线程池: JDK1.5之后提供的
    java.util.concurrent.Executors: 线程池的工厂类,用来生成线程池
    Executors 类中的静态方法
        static ExecutorService newFixedThreadPool(int nThreads) 创建一个线程池，该线程池重用固定数量的从共享无界队列中运行的线程
        参数:
            int nThreads:创建线程池中包含的线程数量
        返回值:
            ExecutorService接口,返回的是ExecutorService接口的实现类对象,我们可以使用ExecutorService接口接受(面向接口编程)
    java.util.concurrent.ExecutorService:线程池接口
        用来从线程池中获取线程,调用start方法,执行线程任务
            submit(Runnable task) 提交一个 Runnable 任务用于执行，
        关闭/销毁线程池的方法
            void shutdown()

    线程池的使用步骤:
        1.使用线程池的工厂类 Executors 里边提供的静态方法 newFixedThreadPool 生产一个指定线程数量的线程池
        2.创建一个类,实现 Runnable 接口,重写run方法,设置线程任务
        3.调用 ExecutorService中的方法 submit,传递线程任务(实现类),开启线程,执行 run方法
        4.调用 ExecutorService 中的方法 shutdown 销毁线程池(不建议执行)
 */
public class ThreadPoolDemo {
    public static void main(String[] args) {
        //1.使用线程池的工厂类 Executors 里边提供的静态方法 newFixedThreadPool 生产一个指定线程数量的线程池
        ExecutorService es = Executors.newFixedThreadPool(2);

        //2.创建一个类,实现 Runnable 接口,重写run方法,设置线程任务
        RunnableImpl ri = new RunnableImpl();

        // 3.调用 ExecutorService中的方法 submit,传递线程任务(实现类),开启线程,执行 run方法
        es.submit(ri); //pool-1-thread-1创建了一个新的线程执行
        // 线程池会一直开启,使用完了线程,会自动把线程归还给线程池,线程可以继续使用
        es.submit(ri); // pool-1-thread-2创建了一个新的线程执行
        es.submit(ri);

        // 4.调用 ExecutorService 中的方法 shutdown 销毁线程池(不建议执行)
        es.shutdown();

        es.submit(ri); //抛异常,线程池都没了,就不能获取线程了

    }
}
