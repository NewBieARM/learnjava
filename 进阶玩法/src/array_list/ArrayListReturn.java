package array_list;

import java.util.ArrayList;
import java.util.Random;

/*
题目：
    用一个大集合存入20个随机数字，然后筛选其中的偶数元素，放到小集合当中
要求使用自定义的方法实现筛选；
 */
public class ArrayListReturn {

    // 此方法是过滤器
    public static ArrayList<Integer> numFilter(ArrayList<Integer> listInt) {
        ArrayList<Integer> listNum = new ArrayList<>();
        for (int i = 0; i < listInt.size(); i++) {
            if (listInt.get(i) % 2 == 0) {
                listNum.add(listInt.get(i));
            }
        }
        return listNum;
    }

    public static void main(String[] args) {
        ArrayList<Integer> listInt = new ArrayList<>();
        Random random = new Random();

        // 生成 20 个随机数， 添加到列表
        for (int i = 0; i < 20; i++) {
            listInt.add(random.nextInt());
        }
        System.out.println(listInt);

        // 将列表传到筛选器，并接受返回值
        ArrayList<Integer> listResult = numFilter(listInt);
        System.out.println(listResult);

    }
}
