package throw关键字;

import java.util.Objects;

/*
    throw 关键字
        作用:
            可以使用throw关键字在指定的方法中抛出指定的异常
        使用格式:
            throw new xxxException("异常产生的原因");
        注意:
            1. throw关键字必须写在方法的内部
            2. throw关键字后边new的对象必须是Exception或者Exception的子类对象
            3. throw关键字抛出指定的异常对象,就必须处理这个异常
                throw关键字后边创建的是RuntimeException或者它的了类对象,我们可以不处理,默认交给JVM处理(打印结果,中断程序)
                throw关键字后边创建的是编译异常,我们就必须处理这个异常,要么throws,要么try...catch
 */
public class ThrowDemo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
//        int[] arr = null;
        int index = -1;
        int result = getElement(arr, index);
        System.out.println(result);
    }

    private static int getElement(int[] arr, int index) {
        /*
            必须对象方法传递过来的参数进行合法性校验
            如果参数不合法:那么我们就必须使用抛出异常的方法,告知方法的调用者,参数有问题
         */

        if (arr == null) {
            throw new NullPointerException("传递的数组的值是null");
        }
//        Objects.requireNonNull(arr, "没有元素");  // 上面的判断语句相当于这个

        if (index < 0 || index > arr.length - 1) {
            throw new IndexOutOfBoundsException("超出范围..");
        }

        return arr[index];
    }

}
