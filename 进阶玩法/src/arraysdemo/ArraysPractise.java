package arraysdemo;

import java.util.Arrays;

/*
题目：
    1.请使用 Arrays 相关的 API ，将一个随机字符串中的所有字符升序排列，并倒序打印。
 */
public class ArraysPractise {
    public static void sortList(char[] str) {
        for (int num = str.length - 1; num >= 0; num--) {
            System.out.println(str[num]);
        }
    }

    public static void main(String[] args) {
        String strList = "afasf7ioahcio23";

        // String --> 数组
        char[] charArray = strList.toCharArray();
        // 排序
        Arrays.sort(charArray);  //  237aaacffhiioos
        System.out.println(charArray);
        //倒序输出
        sortList(charArray);
    }
}
