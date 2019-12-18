package interface_const;
/*
接口当中也可以定义“成员变量”，但是必须使用public static final 三个关键字，进行修饰
效果上看，这其实就是接口的【常量】
格式：
    public static final 数据类型 常量名称 = 数据值;
PS：
一旦使用 final 关键字进行修饰，说明不可变

注意事项：
    1.接口当中的常量，可以省略 public static final ，但是 不写也照样是这样
    2.接口中的常量，必须进行赋值
    3.接口中常量的名称使用完全大写字母，用下划线连接
 */
public interface MyInterfaceConst {
    // 这其实是一个常量，一旦赋值，不可以修改
    // 可以 只写 int num = 10; 但是 是一模一样的
    public static final int NUM_OF_MY_CLASS = 10;
}
