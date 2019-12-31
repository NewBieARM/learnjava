package 创建多线程程序;
/*
    创建多线程程序的第一种方式: 创建Thread类的子类
    java.lang.Thread类: 是描述线程的类,我们想要实现多线程程序,就必须继承Thread类

    实现步骤:
        1. 创建一个Thread类的子类
        2. 在Thread类的子类中重写Thread类中的run方法,设置线程任务(开启线程要做什么?)
        3. 创建Thread类的 子类对象
        4. 调用Thread类中的方法start方法,开启新的线程,执行run方法
            start() 导致此线程开始执行; Java虚拟机调用此线程的run方法。
            结果是两个线程同时运行：当前线程（main线程）和另一个线程（创建的新线程,执行其run方法）。
            多次启动线程是非法的。特别是当线程执行完成后,不能在重新启动。
     java程序属于抢占式调度,哪个线程优先级高,哪个线程先运行;同一个优先级,随机选择一个执行

 */
public class ThreadDemo {
    public static void main(String[] args) {
        // 3.创建Thread类的 子类对象
        MyThread mt = new MyThread();
        // 4.调用Thread类中的方法start方法,开启新的线程,执行run方法
        mt.start();

        for (int i=0; i<20; i++){
            System.out.println("main->" + i);
        }

    }
}
