package SynchronizedMethod;

/*
    卖票案例出现了线程安全问题
    卖出了不存在的票和重复的票

    解决线程安全问题的的第二种方案：使用同步方法
    使用步骤:
        1.把访问了共享数据的代码抽取出来,放到一个方法中去
        2.在方法上添加synchronized修饰符
    格式：
        修饰符 synchronized 返回值类型 方法名(参数列表) {
            可能会出现线程安全问题的代码(访问了共享数据的代码)
        }

 */
public class RunnableImpl implements Runnable {
    // 定义一个多个线程共享的票源
    private static int ticket = 100;

    // 设置线程任务:卖票
    @Override
    public void run() {
        System.out.println("this->" + this);
        //先进行判断是否存在
        while (true) {
//            payTicket01();
//            payTicket02();
            payTicket03();
        }
    }

    /*
        静态同步方法
        锁对象不能是this, 因为 this是创建对象之后产生的,静态方法优先于对象
        静态方法的锁对象是本来的class属性-->class文件对象(反射)
     */
    public static synchronized void payTicket03() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (ticket > 0) {
            System.out.println(Thread.currentThread().getName() + "-> 在卖第" + ticket + "张票");
            ticket--;
        }
    }

    /*
        定义一个同步方法
        同步方法也会把方法内部的代码锁住
        只让一个线程执行
        同步的方法的锁对象是是 实现类对象 -> new RunnableImpl()  也就是this
     */
    public synchronized void payTicket01() {
        //同步代码块
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (ticket > 0) {
            System.out.println(Thread.currentThread().getName() + "-> 在卖第" + ticket + "张票");
            ticket--;
        }
    }

    public /*synchronized*/ void payTicket02() {
        //同步代码块
        synchronized (this) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (ticket > 0) {
                System.out.println(Thread.currentThread().getName() + "-> 在卖第" + ticket + "张票");
                ticket--;
            }
        }
    }
}
