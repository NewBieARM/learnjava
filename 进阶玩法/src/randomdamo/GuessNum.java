package randomdamo;

import java.util.Random;
import java.util.Scanner;

public class GuessNum {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(100);
        int count = 1;
        while (true) {
            System.out.print("请输入数字: ");
            int userNum = new Scanner(System.in).nextInt();
            if (userNum == num) {
                System.out.println("恭喜猜对了!!!, 你猜了" + count + "次！");
                break;
            } else if (userNum < num) {
                count+=1;
                System.out.println("猜小了");
            } else {
                count+=1;
                System.out.println("猜大了...");
            }
        }
    }
}
