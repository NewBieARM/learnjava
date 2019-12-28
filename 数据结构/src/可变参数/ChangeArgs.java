package 可变参数;

import java.util.Arrays;
/*
    可变参数：是JDK1.5之后出现的新特性
    使用前提：
        当方法的参数列表数据类型已经确定，但是参数的个数不确定，就可以使用可变参数
    使用格式：
        修饰符 返回值类型 方法名(数据类型... 变量名) {}
    可变参数原理：
        可变参数底层就是一个数组，根据传递参数个数不同，会创建不同长度的数组，来存储这些参数
        传递的参数个数，可以是0(不传递), 2, 3...  多个

    注意事项：
        1.一个方法的参数列表，只能有一个可变参数
        2.如果方法的参数有多个，可变参数必须写在参数列表最后
 */
public class ChangeArgs {
    public static void main(String[] args) {
        int result = add(1, 2, 3, 4);
        System.out.println(result);
    }

    public static int add(int... nums) {
        /*
            add()，就会创建一个长度为0的数组， new int[0]
            add(10, 20)，就会创建一个长度为2的数组， new int[]{10, 20}

         */

        int total = 0;
        for (int num: nums) {
            total += num;
        }
        return total;
    }
}
