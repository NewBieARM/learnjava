package array_list;

import java.util.ArrayList;
import java.util.Random;

/*
题目：
    生成六个 1- 33 之间的随机整数，添加到集合，并遍历集合
 */
public class ArrayListRandom {
    public static void main(String[] args) {
        ArrayList<Integer> listInt = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            listInt.add(random.nextInt(33) + 1);
        }
        for (int i = 0; i < listInt.size(); i++) {
            System.out.println(listInt.get(i));
        }
    }
}
