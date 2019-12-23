package System类;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
  java.lang.System 类中提供了大量的静态方法，可以获取与系统相关的信息或系统级操作，在System类的API文档中，常用的方法有：

    1. public static long currentTimeMillis()：返回以毫秒为单位的当前时间。

    2. public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)`：
    将数组中指定的数据拷贝到另一个数组中。
    参数：
                 Object     src            源数组
                 int        srcPos         源数组索引起始位置
                 Object     dest           目标数组
                 int        destPos        目标数组索引起始位置
                 int        length         复制元素个数

 */
public class SystemDemo {
    public static void main(String[] args) {
//        demo01();
        demo02();
    }

    private static void demo02() {
        /*
        将src数组中前3个元素，复制到dest数组的前3个位置上
        复制元素前：
            src数组元素[1,2,3,4,5]，dest数组元素[6,7,8,9,10]
        复制元素后：
            src数组元素[1,2,3,4,5]，dest数组元素[1,2,3,9,10]
         */
        int[] src = {1, 2, 3, 4};
        int[] dest = {6, 7, 8, 9, 10};

        System.out.println(Arrays.toString(dest));
        System.arraycopy(src, 0, dest, 0, 3);
        System.out.println(Arrays.toString(dest));
    }

    private static void demo01() {
        // 测试 程序运行时间
        long start = System.currentTimeMillis();
        for (int i = 0; i < 9999; i++) {
            System.out.println(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("程序运行时间：" + (end - start) + " 毫秒");
    }
}
