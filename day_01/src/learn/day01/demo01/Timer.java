package learn.day01.demo01;

public class Timer {
    public static void main(String[] args) {
        for (int h=0; h < 24; h++){
            for (int m=0; m < 60; m++){
                System.out.println(h + "点" + m + "分");
            }
        }
    }
}
