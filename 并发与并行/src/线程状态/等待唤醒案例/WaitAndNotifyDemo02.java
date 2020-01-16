package 线程状态.等待唤醒案例;
/*
    进入到 TimeWaiting(计时等待)有两种方式
        1.使用sleep(long m) 方法,在毫秒值结束时候,线程睡醒进入到 Runnable/Blocked 状态
        2.使用wait(long m) 方法,wait方法如果在毫秒值结束之后,还没有被notify唤醒,就会自动醒来,线程睡醒进入到 Runnable/Blocked 状态
    唤醒的方法:
        void notify() 唤醒正在等待对象监视器的单个线程。
        void notifyAll() 唤醒正在等待对象监视器的所有线程。
 */
public class WaitAndNotifyDemo02 {
    public static void main(String[] args) {
        // 创建一个锁对象,保证唯一
        Object obj = new Object();
        // 创建一个顾客线程(消费者)
        new Thread(){
            @Override
            public void run() {
                // 保证等待和唤醒的线程只能有一个执行,需要使用同步技术
                synchronized (obj) {
                    System.out.println("顾客1-告知老板要包子数量和种类");
                    //调用 wait 方法,放弃cpu的执行,进去到 WAITING 状态(无限等待)
                    try {
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("包子已经做好,顾客1开吃...");
                }
            }
        }.start();

        // 创建一个锁对象,保证唯一
        // 创建一个顾客2线程(消费者)
        new Thread(){
            @Override
            public void run() {
                // 保证等待和唤醒的线程只能有一个执行,需要使用同步技术
                synchronized (obj) {
                    System.out.println("顾客2-告知老板要包子数量和种类");
                    //调用 wait 方法,放弃cpu的行,进去到 WAITING 状态(无限等待)
                    try {
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("包子已经做好,顾客2开吃...");
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
//                    obj.notify(); // 如果有多个等待线程,随机唤醒一个
                    obj.notifyAll(); // 唤醒所有等待的线程
                }
            }
        }.start();
    }
}
