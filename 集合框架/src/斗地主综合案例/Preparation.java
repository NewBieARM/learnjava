package 斗地主综合案例;

import java.util.ArrayList;

public class Preparation {
    public static ArrayList<String> combination(String[] list1, String[] list2) {

        ArrayList<String> poker = new ArrayList<>();

        // 把大小王加进去
        poker.add("大王");
        poker.add("小王");

        for (String number : list1) {
            for (String color : list2) {
                poker.add(number + color);
            }
        }

        return poker;
    }
}