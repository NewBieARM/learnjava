package interfacedemo;

public class MyInterfaceDefaultRun implements MyInterfaceDefault{
    @Override
    public void methodAbs(){
        System.out.println("实现了 接口的 abs 方法");
    }

    @Override
    public void methodDefault() {
        System.out.println("重写了接口的默认方法");
    }
}
