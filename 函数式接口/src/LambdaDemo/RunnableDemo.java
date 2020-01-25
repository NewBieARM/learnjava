package LambdaDemo;
/*
    例如 java.lang.Runnable 接口就就是一个函数式接口,
    假设有一个startThread方法使用该接口作为参数,那么就可以使用Lambda进行传参
    这种情况其实和Thread类的构造方法参数未Runnable没有本质的区别
 */
public class RunnableDemo {
    public static void startThread(Runnable run){
        // 开启多线程
        new Thread(run).start();
    }

    public static void main(String[] args) {

        // 参数传递匿名内部类
        startThread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"线程已启动");
            }
        });
        // 参数传递 Lambda 表达式
        startThread(()-> System.out.println(Thread.currentThread().getName()+"线程已启动"));
    }
}
