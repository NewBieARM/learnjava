package 斗地主有序;

import java.util.*;

public class DouDiZhu {
    public static void main(String[] args) {

        List<String> colors = List.of("♠", "♥", "♣", "♦");
        List<String> numbers = List.of("2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3");

        // 组排
        Map<Integer, String> pokerMap = ZuPai.zuPai(colors, numbers);

        // 取出编号 集合
        Set<Integer> key = pokerMap.keySet();

        // 因为要将编号打乱顺序 所以 应该先进行转换到 list集合中
//        ArrayList<Integer> keyList = new ArrayList<>(key);   // 也可以直接写在括号里
        ArrayList<Integer> keyList = new ArrayList<>();
        keyList.addAll(key);

        // 洗牌
        Collections.shuffle(keyList);

        //发牌
        FaPai.faPai(keyList, pokerMap);

    }
}
