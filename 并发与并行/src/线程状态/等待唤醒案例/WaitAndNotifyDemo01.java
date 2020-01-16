package 线程状态.等待唤醒案例;
/*
    等待唤醒案例:线程之间的通信
        创建一个顾客线程(消费者):告知老板要的包子的种类和数量,调用 wait 方法,放弃cpu的执行,进去到 WAITING 状态(无限等待)
        创建一个老板线程(生产者):花了5秒做包子,做好包子之后,调用 notify 方法,唤醒顾客吃包子

    注意:
        顾客和老板线程必须使用同步代码块包裹起来,保证等待和唤醒只能有一个在执行
        同步使用的锁对象,必须保证是唯一的
        只有锁对象才能调用 wait 和 notify 方法

    Object类中的方法:
        wait()
            在其他线程调用该对象的 notify()方法或 notifyAll()方法前,导致当前线程等待.
        notify()
            唤醒正在等待对象监视器的单个线程。会继续执行 wait 之后的代码
 */
public class WaitAndNotifyDemo01 {
    public static void main(String[] args) {
        // 创建一个锁对象,保证唯一
        Object obj = new Object();
        // 创建一个顾客线程(消费者)
        new Thread(){
            @Override
            public void run() {
                // 保证等待和唤醒的线程只能有一个执行,需要使用同步技术
                synchronized (obj) {
                    System.out.println("告知老板要包子数量和种类");
                    //调用 wait 方法,放弃cpu的执行,进去到 WAITING 状态(无限等待)
                    try {
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("包子已经做好,开吃...");
                }
            }
        }.start();

        // 创建一个老板线程(生产者)
        new Thread(){
            @Override
            public void run() {
                // 花5秒做包子
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                // 保证等待和唤醒的线程只能有一个执行,需要使用同步技术
                synchronized (obj){
                    System.out.println("5秒之后,包子已经做好了,拿去");
                    // 调用 notify 方法,唤醒顾客吃包子
                    obj.notify();
                }
            }
        }.start();
    }
}
