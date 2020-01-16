package 创建多线程.创建多线程第二种方法;
// 1. 创建一个Runnable接口实现类
public class RunnableImpl implements Runnable {
    //2. 在实现类中重写Runnable接口的run方法,设置线程任务
    @Override
    public void run() {
        System.out.println("这是Runnable中的run方法");
    }
}
