package randomdamo;

import java.util.Random;

/*
用来生成随机数字

使用：
next.Int() （获取一个随机的 int 数字（范围是int的所有范围，有正负两种） int num = random.nextInt()
获取一个随机int数（参数代表了范围，左闭右开区间） int num = random.nextInt(3)  实际上代表的含义是[0, 3)  0~2
 */
public class RandomDemo {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println(random.nextInt());

    }
}
