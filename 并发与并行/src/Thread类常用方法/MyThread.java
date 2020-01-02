package Thread类常用方法;
/*
    获取线程的名称:
        1.使用Thread类中的方法getName()
            String getName() 返回该线程的名称
        2.可以先获取到当前正在执行的线程,使用线程中的方法getName() 获取线程的名称
             static Thread currentThread()  返回对当前正在执行的现成的引用
 */
public class MyThread extends Thread {
    // 重写Thread类中的run方法,设置线程任务
    @Override
    public void run() {
        //获取线程成名称
        // 第一种方式
//        String name = getName();
//        System.out.println("线程名: " + name);

        //第二种方法
//        Thread t = Thread.currentThread();
//        System.out.println(t);

        //Thread[Thread-0,5,main]
        //Thread[Thread-1,5,main]

        // 链式编程 雅俗哟成一行
        System.out.println(Thread.currentThread().getName()); // Thread-0
    }
}
