package FunctionalInterface;


public class Demo {

    public static void main(String[] args) {
        //调用 show 方法,方法参数是一个接口,所以可以传递接口的实现类对象
        show(new MyFunctionalInterfaceImpl());

        //调用 show 方法,方法参数是一个接口,可以传递接口的匿名内部类
        show(new MyFunctionalInterface() {
            @Override
            public void method() {
                System.out.println("匿名内部类");
            }
        });

        //调用 show 方法,方法参数是一个接口,可以传递Lambda 表达式
        show(()->{
            System.out.println("Lambda 表达式");
        });

        // 简化后的Lambda表达式
        show(()-> System.out.println("简化 Lambda"));

    }

    public static void show(MyFunctionalInterface myInter){
        myInter.method();
    }
}
