package stringdemo;
/*
String 当中与获取相关的常用方法有：
    1. public int length(): 获取字符串当中含有的字符个数，拿到字符串长度
    2. public String concat(String str) : 将当前字符串和参数字符串拼接成为返回值新的字符串。
    3. public char charAt(int index) : 获取指定索引位置的单个字符。（索引从0开始）
    4. public inr indexOf(String str) : 查找参数字符串在本字符串当中首次出现的索引位置，如果没有 返回 -1 值
 */
public class StringGet {
    public static void main(String[] args) {
        String str = "asdasfabskdjfbaskdfkjsdbsd";
        System.out.println(str.length());

        //拼接
        String str1 = "Hello";
        String str2 = ",world";
        String str3 = str1.concat(str2);
        System.out.println(str3);   //  Hello,world

        // 获取指定索引位置的单个字符
        char ch = "Helli".charAt(1);
        System.out.println(ch);     //e

        //查找参数字符串在本来字符出当中出现的第一次索引位置
        String original = "Hello world";
        int index = original.indexOf("llo");
        System.out.println(index);     // 2
        int index1 = original.indexOf("abc");
        System.out.println(index1);     // -1  因为没有

    }
}
