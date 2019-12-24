package 斗地主综合案例;

import java.util.ArrayList;
import java.util.Collections;

/*
    1.准备牌
    2.洗牌
    3.发牌
    4.看牌
 */
public class DouDIZhu {
    public static void main(String[] args) {
        // 1.准备牌
        String[] colors = {"♠", "♥", "♣", "♦"};
        String[] numbers = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        // 自定义的组合拍的方法 参数是两个 String[]的列表
        ArrayList<String> poker = Preparation.combination(colors, numbers);  //自定义静态方法

//        Preparation preparation = new Preparation();  // 普通方法
//        ArrayList<String> poker = preparation.combination(colors, numbers);

        // 2.洗牌
        /*
            使用集合的工具类 Collections 中的方法
            static void shuffle(List<?> list) 使用默认随机源对指定列表进行置换
         */
        Collections.shuffle(poker);  //洗牌

        //3.发牌
        FaPai.faPai(poker);
    }
}
