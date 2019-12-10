package demo03;

/*
数组的反转：
之前的样子： [1, 2, 3, 4, 5]
之后的样子： [5, 4, 3, 2, 1]

1.数组的反转，其实就是堆成位置的元素的交换
2.需要两个索引值， 用三个变量倒手
3.
    （1）要么 for 循环时 i < array.length/2 ；
    （2）要么加一个条件 if (min < max)
 */
public class ArrayReverse {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        for (int min = 0, max = array.length - 1; min < max; min++, max--) {
            int index = array[min];
            array[min] = array[max];
            array[max] = index;
        }
    }
}
