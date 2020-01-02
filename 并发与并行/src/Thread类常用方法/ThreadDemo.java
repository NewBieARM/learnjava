package Thread类常用方法;
/*
    线程名称:
        主线程: main
        新线程:Thread-0, Thread-1, Thread-2 ..
 */
public class ThreadDemo {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.start();

        new MyThread().start();
        System.out.println(Thread.currentThread().getName()); // 当前线程名称  main
    }
}
