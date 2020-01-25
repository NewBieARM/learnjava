package 常用的函数式接口.practice;

import java.util.function.Consumer;

public class PrintDemo {
    public static void printInfo(String[] arr, Consumer<String> con1, Consumer<String> con2) {
        for (String str : arr) {
            con1.andThen(con2).accept(str);
        }
    }

    public static void main(String[] args) {
        String[] arr = {"迪丽热巴,女", "阿尔曼,男", "古力娜扎, 女"};
        printInfo(arr, info -> {
            String[] split = info.split(",");
            System.out.print("姓名: " + split[0] + "\t");
        }, info -> {
            String[] split = info.split(",");
            System.out.println("性别: " + split[1]);
        });
    }

}