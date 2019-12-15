package overvidedemo;
/*
方法覆盖重写的注意事项:
1.必须保证父子类之间方法的名称相同，参数列表也相同
@Override ：写在方法前面，用来检测是不是有效的正确覆盖重写。  ***注解
这个注解只是验证是否重写正确    推荐写

2.子类方法的返回值，必须【小于等于】父类方法的返回值范围
小拓展提示：java.lang.Object 类是所有类的公共最高类（祖宗类）

3.子类方法的权限必须【大于等于】父类方法的权限修饰符。
小拓展提示：public > protected > (default) > private
备注： (default) 不是关键字 default ，而是什么都不写
 */
public class OverrideDemo {
}
