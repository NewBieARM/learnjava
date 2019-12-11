package demo02;

import java.util.Scanner;

public class AnonymousDomo2 {
    public static void main(String[] args) {
        // 普通使用方式
//        Scanner input = new Scanner(System.in);
//        int num = input.nextInt();

        // 匿名对象的方式
//        int num01 = new Scanner(System.in).nextInt();

        //使用一般写法传入参数
//        Scanner input = new Scanner(System.in);
//        methodParam(input)

        // 使用匿名对象进行传参
//        methodParam(new Scanner(System.in));

//        Scanner sc = methodReturn();
//        sc.nextInt();
    }

    public static void methodParam(Scanner cs) {
        int num = cs.nextInt();
        System.out.println("输入的是: " + num);
    }

    public static Scanner methodReturn() {
        return new Scanner(System.in);
    }
}
