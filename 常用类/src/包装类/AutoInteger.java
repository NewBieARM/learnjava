package 包装类;

import java.util.ArrayList;

/*
    自动装箱与自动拆箱：
        基本类型的数据和包装类之间可以自动相互转换， JDK1.5 之后出现的新特性
 */
public class AutoInteger {
    public static void main(String[] args) {
        demo01();
    }

    private static void demo01() {
        /*
        自动装箱: 直接把 int 类型的整数赋值包装类
        Integer in = 1; 就相当于 Integer in = new Integer(1);
         */
        Integer in = 1;

        /*
        自动拆箱： in 是包装类，他无法直接参与运算，可以自动转换为基本数据类型，再进行计算
        in + 2 就相当于 in.intValue() + 2 = 3;
        in = in.intValue() + 2 = 3  又是一个自动装箱
         */
        in = in + 2;

        ArrayList<Integer> list = new ArrayList<>();
        /*
            ArrayList 集合无法直接存储整数，可以存储 Integer 包装类
         */
        list.add(1); // --> 自动装箱 list.add(new Integer(1))

        int a = list.get(0); // --> 自动拆箱 list.get(0).intValue();
    }
}
