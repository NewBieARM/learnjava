package FunctionalInterface;
/*
    函数式接口:有且仅有一个抽象方法的接口,称为函数式接口
    可以包含其他的方法(默认,静态,私有)

    @FunctionalInterface 注解
    作用：
        可以检测接口是否时一个函数式接口
            是：编译成功
            否：编译失败(接口中没有抽象方法或抽象方法多余 1)
 */
@FunctionalInterface
public interface MyFunctionalInterface {
    //定义一个抽象方法
    void method();

}
