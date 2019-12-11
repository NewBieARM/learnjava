package demo01scanner;

import java.util.Scanner;

public class TreeNum {
    public static int TreeNumMax(int a, int b, int c) {
        if (a >= b) {
            if (a > c) return a;
        } else {
            if (b > c) return b;
        }
        return c;
    }

    // 三元运算符  比较简单
    public static int TreeNumMax_2(int a,int b, int c){
        int temp = a > b ? a : b;
        int max = temp > c ? temp : c;
        return max;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("输入第一个数字: ");
        int n1 = input.nextInt();
        System.out.print("输入第二个数字: ");
        int n2 = input.nextInt();
        System.out.print("输入第一个数字: ");
        int n3 = input.nextInt();

        int result = TreeNumMax(n1, n2, n3);
        int result1 = TreeNumMax_2(n1, n2, n3);
        System.out.println("最大的数为： " + result);
        System.out.println("最大的数为： " + result);
    }
}
