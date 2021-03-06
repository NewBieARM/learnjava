package interfacedemo;
/*
任何版本的Java中，都能定义抽象方法
格式：
    public abstract 返回值类型 方法名称(参数列表);  *** 没有方法体

注意事项：
    1.接口当中的抽象方法，修饰符必须是两个固定的关键字, public abstract
    2.这两个关注尖子修饰符，可以选择性的省略；
    3.方法的三要素，可以随意定义
 */
public interface MyInterfaceAbstract {
    //一个抽象方法
    public abstract void methodAbs();

    // 也是抽象方法
    //abstract void methodAbs1();

    // 也是抽象方法
    //public void methodAbs2();

    // 也是一个抽象方法
    //void methodAbs3();

}
