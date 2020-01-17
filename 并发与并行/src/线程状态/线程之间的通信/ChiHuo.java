package 线程状态.线程之间的通信;
/*
    消费者(吃货)类:是一个线程类,可以继承Thread
    设置线程任务(run):吃包子
    对包子的状态进行判断
    false:没有包子
        吃货调用wait方法进入等待状态
    true:有包子
        吃货吃包子
        吃货吃完包子,修改状态为false
        吃货唤醒包子铺线程,生产包子
 */
public class ChiHuo extends Thread{
    private BaoZi bz;

    public ChiHuo(BaoZi bz) {
        this.bz = bz;
    }

    // 消费者(吃货)类:是一个线程类
    @Override
    public void run() {
        // 使用死循环,一致吃包子
        while (true) {
            //必须使用同步技术保证两个线程只能有一个在执行
            synchronized (bz) {
//                对包子的状态进行判断
                if (bz.flag == false) {
                    // 吃货调用wait方法进入等待状态
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                // 被唤醒之后执行的代码,吃包子
                System.out.println("吃货正在吃: "+ bz.pi + bz.xian);

                // 吃货吃完包子,修改状态为false
                bz.flag = false;
                // 吃货唤醒包子铺线程,生产包子
                bz.notify();
                System.out.println("吃货已经把: "+ bz.pi + bz.xian + "吃完了,包子铺赶紧生产包子吧");
                System.out.println("====================================");
            }
        }
    }
}
