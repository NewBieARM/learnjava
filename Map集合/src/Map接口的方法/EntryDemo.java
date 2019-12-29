package Map接口的方法;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
    Map.Entry<K, V>:在Map接口中有一个内部接口Entry
    作用:当Map集合一创建,那么就会在Map集合中创建一个Entry对象,用来记录键与值(键值对对象,键于值的映射关系)
 */
public class EntryDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("赵丽颖", 165);
        map.put("迪丽热巴", 168);
        map.put("林志玲", 178);

        Set<Map.Entry<String, Integer>> set = map.entrySet();

        for (Map.Entry<String, Integer> item : set) {
            System.out.println(item.getKey() + "=" + item.getValue());
        }
    }
}
