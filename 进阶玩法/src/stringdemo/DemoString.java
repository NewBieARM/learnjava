package stringdemo;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/*
java.lang.String 类代表字符串
 Java程序中的所有字符串文字（例如"abc" ）都被实现为此类的实例。
    意思就是：程序当中所有的双引号字符串，都是String类的对象。（就算没有 new，也照样是。）

字符串的特点：
    1.内容不能更改 【重点】
    2.正因为不可变，所以字符串可以共享使用
    3.字符串效果上相当于 char[] 字符数组，但底层原理是 byte[] 字节数组

创建字符串的常见 3+1 种方式。
三种构造方法：
    1. public String();     创建一个空白字符串
    2. public String(char[] array);     根据字符数组的内容，来创建对应的字符串
    3. public String(byte[] array);     根据字节数组的内容，来创建对应的字符串
    4. 直接创建  String str = "xxxix";     *** 注意：直接写上双引号，就是字符串对象
 */
public class DemoString {
    public static void main(String[] args) {
        //使用空参构造
        String str1 = new String(); //  ->  String str1 = "";

        //使用字数组 创建字符串
        char[] charArray = {'A', 'B', 'C'};
        String str2 = new String(charArray);
        System.out.println(str2);  //   ->  ABC

        //根据字节数组创建字符串
        byte[] array = {97, 98, 99};
        String str3 = new String(array);
        System.out.println(str3);  //   ->  abc
    }
}
