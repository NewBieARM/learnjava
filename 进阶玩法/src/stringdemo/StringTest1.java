package stringdemo;

/*
题目：
    定义一个方法，把数组{1， 2， 3}按照格式拼接成一个字符串。格式： [word1#word2#word3]
 */
public class StringTest1 {

    public static String fromArrayToString(int[] list) {
        String str = "[";
        for (int i = 0; i < list.length; i++) {
            if (i == list.length - 1) {
                str = str.concat("word" + list[i] + "]");
            } else {
                str = str.concat("word" + list[i] + "#");
            }
        }
        return str;
    }


    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4};
        String i = fromArrayToString(intArray);
        System.out.println(i);
    }
}
