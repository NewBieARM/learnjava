package demo01scanner;

import java.util.Scanner;

public class ScannerSum {

    public static int twoNumSum(int one, int two) {
        return one + two;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入第一个数字：");
        int num1 = input.nextInt();
        System.out.print("请输入第二个数字：");
        int num2 = input.nextInt();
        int result = twoNumSum(num1, num2);
        System.out.println("两数之和为： " + result);
    }
}
