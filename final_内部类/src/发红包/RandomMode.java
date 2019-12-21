package 发红包;

import red.OpenMode;

import java.util.ArrayList;
import java.util.Random;

public class RandomMode implements OpenMode {
    @Override
    public ArrayList<Integer> divide(final int totalMoney, final int totalCount) {
        ArrayList<Integer> list = new ArrayList<>();
        //  随机分配，有可能多，有可能少
        //  最好1分, 最多不超过“剩下平均数的2倍”
        // 第一次发红包 随即范围 0.01元~ 6.66元
        //第一次发完之后，剩下的至少是 3.34元
        //此时还需要再发2个红包
        //此时的再发范围应该是 0.01元~3.34元 （取不到右边，剩下0.01元）

        // 总结一下，范围的【公式】： 1 + random.nextInt(leftMoney / leftCount * 2);
        Random r = new Random();  // 首先创建一个随机数生成器
        // totalMoney 和 totalCount 不变
        // 额外定义两个变量，剩下多少钱，剩下多少份
        int leftMoney = totalMoney;
        int leftCount = totalCount;

        //随机发前 n-1 个，最后一个不需要随机
        for (int i = 0; i < totalCount - 1; i++) {
            // 按公式生成随即金额
            int money = r.nextInt(leftMoney / leftCount * 2) + 1;
            list.add(money);
            leftMoney -= money;  //总金额越发越少
            leftCount --; //剩下还应该在发的的红包个数，递减
        }
        // 最后一个红包不需要随机，直接放进去
        list.add(leftMoney);
        return list;
    }
}
