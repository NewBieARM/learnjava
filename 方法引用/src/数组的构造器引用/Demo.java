package 数组的构造器引用;

import java.util.ArrayList;
import java.util.Arrays;

/*
    数组的构造器引用
 */
public class Demo {
    /*
        方法的参数,传递创建数组的长度和ArrayBuilder接口
        方法内部根据传递的长度使用ArrayBuilder中的方法创建数组并返回
     */
    public static int[] creatArray(int length, ArrayBuilder ab){
        return ab.builderArray(length);
    }

    public static void main(String[] args) {
        //调用creatArray方法传递数组的长度和lambda表达式
        int[] arr1 = creatArray(5, len -> {
            // 根据数组的长度,创建数组并返回
            return new int[len];
        });  //  5

        /*
            使用方法应用优化Lambda表达式
            已知创建的就是int[]数组
            数组长度也是已知的
            就可以使用方法引用
            int[] 应用new
         */
        int[] arr2 = creatArray(10, int[]::new); //  10

        System.out.println(arr1.length);  //  5
        System.out.println(arr2.length);

        System.out.println(Arrays.toString(arr2));  // [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]

    }
}
