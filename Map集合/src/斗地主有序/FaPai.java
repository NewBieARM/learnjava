package 斗地主有序;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

public class FaPai {
    public static void  faPai (ArrayList<Integer> pokerList, Map<Integer, String> pokerMap){
        ArrayList<Integer> one = new ArrayList<>();
        ArrayList<Integer> two = new ArrayList<>();
        ArrayList<Integer> three = new ArrayList<>();
        ArrayList<Integer> other = new ArrayList<>();

        for (int i = 0; i < pokerList.size(); i++) {
            if (i >= 51) {
                other.add(pokerList.get(i));
            }else if (i % 3 == 0) {
                one.add(pokerList.get(i));
            }else if (i % 3 == 1) {
                two.add(pokerList.get(i));
            }else {
                three.add(pokerList.get(i));
            }
        }
        Collections.sort(one);
        Collections.sort(two);
        Collections.sort(three);
        Collections.sort(other);

//        System.out.println(one);
//        System.out.println(two);
//        System.out.println(three);
//        System.out.println(other);
        
        
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        ArrayList<String> diPai = new ArrayList<>();

        for (Integer i : one) {
            String card = pokerMap.get(i);
            player1.add(card);
        }
        for (Integer i : two) {
            String card = pokerMap.get(i);
            player2.add(card);
        }
        for (Integer i : three) {
            String card = pokerMap.get(i);
            player3.add(card);
        }
        for (Integer i : other) {
            String card = pokerMap.get(i);
            diPai.add(card);
        }
        System.out.println(player1);
        System.out.println(player2);
        System.out.println(player3);
        System.out.println(diPai);
    }
}
