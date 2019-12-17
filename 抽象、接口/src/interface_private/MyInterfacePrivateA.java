package interface_private;

public class MyInterfacePrivateA implements MyInterfacePrivate {
    public void methodAnother(){
        // 直接访问到了 接口的默认方法，这样是错误的，不应该被实现类用
//        methodCommon();
        methodDefault1();
        methodPrivate2();

    }
}
