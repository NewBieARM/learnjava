package ThreadSafe;
/*
    实现买票案例:
 */
public class RunnableImpl implements Runnable {
    // 定义一个多个线程共享的票源
    private int ticket = 100;

    // 设置线程任务:卖票
    @Override
    public void run() {
        //先进行判断是否存在
        while (true) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (ticket>=0) {
                System.out.println(Thread.currentThread().getName() + "-> 在卖第"+ticket+"张票");
                ticket--;
            }
        }
    }
}
