package stringdemo;

import java.util.Arrays;

/*
String 当中与转换相关的常用方法有：
    1. public char[] toCharArray(): 将当前字符串拆分成为字符数组作为返回值；
    2. public byte[] getBytes(): 获的当前字符串底层的字节数组
    3. public String replace(CharSequence oldString, CharSequence newString)
    将所有出现的老字符串替换成新的字符串，返回替换之后的结果新字符串
    PS: CharSequence 意思就是说可以接受字符串类型
 */
public class StringConvert {
    public static void main(String[] args) {
        // 转换成为字符数组
        char[] chars = "Hello".toCharArray();
        System.out.println(chars[0]);  // H

        // 转换成为字节数组
        byte[] bytes = "abc".getBytes();
        System.out.println(bytes);      // [B@1540e19d
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }

        //public String replace(CharSequence oldString, CharSequence newString)
        String str1 = "How do you do";
        String str2 = str1.replace("o", "*");
        System.out.println(str2);      //  H*w d* y*u d*
    }
}
