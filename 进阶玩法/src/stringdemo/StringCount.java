package stringdemo;

import java.util.Scanner;

/*
提示：
    键盘输入一个字符串，并且统计其各种字符出现的次数
    种类有： 大写字母、小写字母、数字、其他
 */
public class StringCount {
    public static void stringClassify(String strByte) {
        char[] charStringArray = strByte.toCharArray();
        int countUpper = 0, countLower = 0, countNum = 0, countOther = 0;

        for (int i = 0; i < charStringArray.length; i++) {
            char ch = charStringArray[i];
            if ('A' <= ch && 'Z' >= ch) {
                countUpper++;
            } else if ('a' <= ch && 'z' >= ch) {
                countLower++;
            } else if ('0' <= ch && '9' >= ch) {
                countNum++;
            } else {
                countOther++;
            }
        }
        System.out.println("大写字母出现：" + countUpper + "次");
        System.out.println("小写字母出现：" + countLower + "次");
        System.out.println("数字出现：" + countNum + "次");
        System.out.println("其他字符粗线：" + countOther + "次");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入内容：");
        String userInput = input.nextLine();
        stringClassify(userInput);
    }
}
