package interface_private;

import interface_static.MyInterfaceImpl;

public class MyInterfaceRun {
    public static void main(String[] args) {
        MyInterfacePrivateA impl = new MyInterfacePrivateA();
        impl.methodDefault1();
        impl.methodPrivate2();
    }
}
