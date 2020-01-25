package 常用的函数式接口.practice;

import java.util.function.Supplier;

/*
    练习:求数组元素的最大值
        使用Supplier接口作为方法的参数类型,通过 Lambda 表达式求出 int 数组中的最大值
        提示:接口的泛型请使用 java.Lang.Integer 类
 */
public class MaxNumTest {
    // 定义一个方法,用于获取int类型数组中元素的最大值,方法的参数传递 Supplier 接口,泛型使用Integer
    public static int getMaxNum(Supplier<Integer> sup){
        return sup.get();
    }

    public static void main(String[] args) {
        // 定义一个int类型的数组,并给它赋值
        int[] arr = {-50, 100, 88, 0, 22, -30};
        // 调用getMaxNum方法
        int maxNum = getMaxNum(() -> {
            //获取数组的最大值
            int max = arr[0];
            for (int i : arr) {
                if (i > max) {
                    max = i;
                }
            }
            return max;
        });

        System.out.println(maxNum);
    }
}
