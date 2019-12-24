package 斗地主综合案例;

import java.util.ArrayList;
/*
3.发牌
    定义4个集合，存放玩家的牌合底牌
 */
public class FaPai {
    public static void faPai(ArrayList<String> poker){
        ArrayList<String> one = new ArrayList<>();
        ArrayList<String> two = new ArrayList<>();
        ArrayList<String> three = new ArrayList<>();
        ArrayList<String> other = new ArrayList<>();

        /*
            遍历poker集合，获取每一张牌
            使用poker集合的索引 %3 给三个玩家轮流发牌
            剩余三张给底牌
                注意：先判断 底牌 if (i >= 51)  不然牌就会全发
         */
        for (int i = 0; i < poker.size(); i++) {
            if (i >= 51) {
                other.add(poker.get(i));
            } else if (i % 3 == 0) {
                one.add(poker.get(i));
            } else if (i % 3 == 1) {
                two.add(poker.get(i));
            } else {
                three.add(poker.get(i));
            }
        }
        System.out.println("一号玩家" + one + ", 共" + one.size() + "张牌");
        System.out.println("二号玩家" + two + ", 共" + two.size() + "张牌");
        System.out.println("三号玩家" + three + ", 共" + three.size() + "张牌");
        System.out.println("底牌" + other + ", 共" + other.size() + "张牌");
    }
}
