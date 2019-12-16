package interface_static;

/*
从 java8 开始 可以定义静态放方法

格式：
public static 返回值类型 方法名称 (参数名称) {
    方法体
}

 */
public interface MyInterfaceStatic {
    public static void methodStatic(){
        System.out.println("这是接口的静态方法");
    }
}
