package Thread类常用方法.改变线程名称;
/*
    设置线程名称:
        1.使用Thread类中的方法setName(名字)
            void setName(String name) 改变线程名称,使之于参数 name 相同

        2.创建一个带参数的构造方法,参数传递线程的名称;调用父类的带参构造方法,把线程名称传递给父类,让父类给子线程起一个名字
            Thread(String name) 分配新的Thread对象
 */
public class MyThread extends Thread {

    public MyThread(){}

    // 第二种方式
    public MyThread(String name){
        super(name);
    }


    // 重写Thread类中的run方法,设置线程任务
    @Override
    public void run() {
        // 获取线程名称
        System.out.println(Thread.currentThread().getName());
    }
}
