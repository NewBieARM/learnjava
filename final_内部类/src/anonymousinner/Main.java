package anonymousinner;
/*
如果接口的实现类或者弗雷德子类，只需要使用唯一一次：
那么 这种情况下，就可以省略掉该类的定义，而改为使用类【匿名内部类】

定义格式：
    接口名称 对象名 = new 接口名称() {
        // 覆盖重写所有抽象方法
    }
 */
public class Main {
    public static void main(String[] args) {
//        MyInterface obj = new MyInterfaceImpl();
//        obj.method();

        //使用内部匿名类
        MyInterface obj = new MyInterface() {
            @Override
            public void method() {
                System.out.println("匿名内部类实现了方法：111");
            }

            @Override
            public void method2() {
                System.out.println("匿名内部类实现了方法：222");

            }
        };

        obj.method();
        obj.method2();

    }
}
