package randomdamo;

import java.util.Random;

/*
题目要求：
    根据int变量n的值，来获取随机数字，范围是[1, 0]， 可以取1也可以取到n

思路：
    1.定义一个int变量n，随意赋值；
    2.要使用Random
    3.如果写10，那么就是0~9，然而想要的是 1~10 可以发现，整体加1
 */
public class Random1_n {
    public static void main(String[] args) {
        int n = 5;
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int result = random.nextInt(n) + 1; //本来范围是[0, n) 整体加1之后，也就是[1, n]

            System.out.println(result);

        }
    }
}
