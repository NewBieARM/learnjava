package 线程安全.LockDemo;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
    卖票案例出现了线程安全问题
    卖出了不存在的票和重复的票

    解决线程安全问题的第三种方案：使用Lock锁
    java.util.concurrent.locks.Lock接口
    Lock实现提供比使用synchronized方法和语句可以获得的更广泛的锁定操作。
    Lock接口中的方法:
        void lock()   获取锁
        void unlock() 释放锁
    java.util.concurrent.locks.ReentrantLock implements Lock接口

    使用步骤:
        1.在成员位置创建一个 ReentrantLock 对象
        2.在可能会出现安全问题的代码前调用Lock接口中的lock方法 获取锁
        3.在可能会出现安全问题的代码后调用Lock接口中的unlock方法 释放锁

 */
public class RunnableImpl implements Runnable {
    // 定义一个多个线程共享的票源
    private int ticket = 100;

//    1.在成员位置创建一个 ReentrantLock 对象
    Lock l = new ReentrantLock();

    // 设置线程任务:卖票
    @Override
    public void run() {
        //先进行判断是否存在
        while (true) {
            // 2.在可能会出现安全问题的代码前调用Lock接口中的lock方法 获取锁
            l.lock();
            if (ticket > 0) {
                try {
                    Thread.sleep(10);
                    System.out.println(Thread.currentThread().getName() + "-> 在卖第" + ticket + "张票");
                    ticket--;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    // 3.在可能会出现安全问题的代码后调用Lock接口中的unlock方法 释放锁
                    l.unlock(); // 无论程序是否异常,都会把锁释放
                }
            }
        }
    }
}

