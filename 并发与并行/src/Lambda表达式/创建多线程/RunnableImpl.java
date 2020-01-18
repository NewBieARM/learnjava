package Lambda表达式.创建多线程;

public class RunnableImpl implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "新线程任务创建");
    }
}
