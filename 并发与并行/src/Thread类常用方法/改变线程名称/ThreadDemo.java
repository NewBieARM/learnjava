package Thread类常用方法.改变线程名称;

/*

 */
public class ThreadDemo {
    public static void main(String[] args) {
        //开启多线程
        MyThread mt = new MyThread();
        mt.setName("小强");
        mt.start(); // 小强

        // 第二种方式
        MyThread mt2 = new MyThread("哇哈哈");
            mt2.start();
    }
}
