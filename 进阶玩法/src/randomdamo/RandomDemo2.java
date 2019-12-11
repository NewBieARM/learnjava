package randomdamo;

import java.util.Random;

public class RandomDemo2 {
    public static void main(String[] args) {
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            int num = r.nextInt(10); // 0~9
            System.out.println(num);
        }
    }
}
