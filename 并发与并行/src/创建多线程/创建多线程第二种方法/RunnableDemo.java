package 创建多线程.创建多线程第二种方法;
/*
    创建多线程程序的第二种方式: 实现Runnable接口
    java,lang.Runnable
        Runnable 接口应该由哪些打算通过某一线程执行其示例的类来实现.类必须定义一个称为 run 的无参方法
    java.lang.Thread类的构造方法
        Thread(Runnable target) 分配新的Thread对象
        Thread(Runnable target, String name) 分配新的Thread对象
    实现步骤
     1. 创建一个Runnable接口实现类
     2. 在实现类中重写Runnable接口的run方法,设置线程任务
     3. 创建一个Runnable接口的实现类对象
     4. 创建Thread类对象,构造方法中传递Runnable接口的的实现类对象
     5. 调用Thread类种的start方法,开启新线程
 */
public class RunnableDemo {
    public static void main(String[] args) {
        //3. 创建一个Runnable接口的实现类对象
        RunnableImpl runnable = new RunnableImpl();
        //4. 创建Thread类对象,构造方法中传递Runnable接口的的实现类对象
        Thread thread = new Thread(runnable);
        //5. 调用Thread类种的start方法,开启新线程
        thread.start();
    }
}
