package 类的构造器引用;
/*
    定义一个创建Person对象的函数式接口
 */
@FunctionalInterface
public interface PersonBuilder {
    // 根据传递的姓名,创建Person对象返回
    Person builderPerson(String name);
}
