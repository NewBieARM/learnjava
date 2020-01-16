package 线程安全.SynchronizedDemo;

public class TicketDemo {
    public static void main(String[] args) {
        RunnableImpl run = new RunnableImpl();
        Thread t0 = new Thread(run, "T0");
        Thread t1 = new Thread(run, "T1");
        Thread t2 = new Thread(run, "T2");
        t0.start();
        t1.start();
        t2.start();
    }
}
