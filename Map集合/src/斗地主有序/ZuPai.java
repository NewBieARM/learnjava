package 斗地主有序;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ZuPai {
    public static Map<Integer, String> zuPai(List<String> colors, List<String> numbers){
        Map<Integer, String> map = new HashMap<>();

        int count = 0;
        map.put(count++, "大王");
        map.put(count++, "小王");
        for (String number : numbers) {
            for (String color : colors) {
                map.put(count++, color + number);
            }
        }


        return map;
    }
}
