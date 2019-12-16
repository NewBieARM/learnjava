package interface_static;
/*
注意，不能通过接口实现类的对象来调用接口当中的静态方法

接口当中的静态方法调用方式：
    接口名称.静态方法名(参数);
 */
public class InterfaceRunner {
    public static void main(String[] args) {
        //创建实现类
        MyInterfaceImpl impl = new MyInterfaceImpl();

        //错误写法
//        impl.methodStatic();

        // 接口当中的静态方法 通过接口名称.静态方法名(参数);
        MyInterfaceStatic.methodStatic();
    }
}
