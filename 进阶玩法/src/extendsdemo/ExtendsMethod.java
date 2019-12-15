package extendsdemo;
/*
在父子类的继承关系当中，创建子类对象，访问成员方法的规则
    创建的对象是谁，就优先谁，如果没有则向上找

重写（Override）：
    在继承概关系中，方法的名称一样，参数列表【也一样】。  覆盖、覆写
重载（Overload）:
    方法的名称一样，参数列表【不一样】
 */
public class ExtendsMethod {
    public static void main(String[] args) {
        Zi z = new Zi();

        z.methodFu();
        z.methodZi();

        // 优先用子类方法 没有就向上找
        z.methodRename();
    }
}
