package 局部内部类;
/*
局部内部类，如果希望访问所在方法的局部变量，那么这个局部变量必须是【有效 final 的】

PS: java 8+ 开始，只要局部变量事实不变，那么 final 关键字可以省略
 */
public class Outer {

    public void methodOuter() {
        int num = 10;  //所在方法的局部变量   或者 final int num = 10；
        class Inner { // 权限修饰符什么都不能写
            public void methodInner() {
                System.out.println(num);
            }
        }
    }
}
