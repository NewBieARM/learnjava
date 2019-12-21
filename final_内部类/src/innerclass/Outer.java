package innerclass;
/*
如果出现了 重名现象，那么格式是：外部类.this.外部类成员变量
 */
public class Outer {
    int num = 10;  // 外部类成员变量

    public class Inner {
        int num = 20;  // 内部类成员变量

        public void method() {
            int num = 30;  //内部类方法的局部变量
            System.out.println(num);  // 30
            System.out.println(this.num);  // 20
            System.out.println(Outer.this.num);  // 10
        }
    }
}
