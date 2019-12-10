package demo02;

public class Array_max_min {
    public static void main(String[] args) {
        int[] array = {51, 1, 20, 60, 330, 2, 58, 220, 48};
        // 求最大值
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("最大的数字为：" + max);

        //求最大值
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("最小的数字为：" + min);

    }
}
