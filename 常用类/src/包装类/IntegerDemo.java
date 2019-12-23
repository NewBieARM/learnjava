package 包装类;
/*
    装箱：把基本类型的数据包装到包装类中（基本类型的数据 -> 包装类）
        构造方法：
            Integer(int value) 构造一个新分配的 Integer 对象，他表示指定的 int 值；
            Integer(String s) 构造一个新分配的 integer 对象，他表示 String 参数所指示的 int 值
                传递的字符串必须是基本类型的字符串，否则会抛出异常 "100"正确  ”a“抛异常
        静态方法：
            static Integer valueOf(int t) 返回一个表示指定的 int 值的 Integer 实例
            static Integer valueOf(String s) 返回保存指定的 String 的值的 Integer 对象

    拆箱：把包装类中取出基本类型的数据（包装 -> 基本类型的数据）
        成员方法：
            int intValue() 以 int 类型返回该 Integer 值
 */
public class IntegerDemo {
    public static void main(String[] args) {
//        demo01();  // 装箱   老的方法
//        demo02();  // 拆箱     老的方法
    }


    private static void demo02() {
        Integer in1 = new Integer(1);

        int i = in1.intValue();
        System.out.println(i);
    }

    private static void demo01() {
        // 构造方法
        Integer in1 = new Integer(1);
        System.out.println(1);
        Integer in2 = new Integer("1");
        System.out.println(in2);

        //静态方法
        Integer in3 = Integer.valueOf(1);
        System.out.println(in3);
        Integer in4 = Integer.valueOf("1");
        System.out.println(in4);
    }
}
