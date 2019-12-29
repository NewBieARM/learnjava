package Map接口的方法;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
    第二种方法：使用Entry对象遍历
    Map集合中的方法:
        public Set<Map.Entry<K,V>> entrySet(): 获取到Map集合中所有的键值对对象的集合(Set集合)。

    Map.Entry<K, V>:在Map接口中有一个内部接口Entry
    作用:当Map集合一创建,那么就会在Map集合中创建一个Entry对象,用来记录键与值(键值对对象,键于值的映射关系)

    实现步骤:
        1.使用Map集合中的方法entrySet(),把Map集合中多个Entry对象取出来,存储到一个Set集合中
        2.遍历Set集合,获取每一个Entry对象
        3.使用Entry对象中的方法getKey()和getValue()获取键于值
 */
public class EntryDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("赵丽颖", 165);
        map.put("迪丽热巴", 168);
        map.put("林志玲", 178);

        // 1.
        Set<Map.Entry<String, Integer>> set = map.entrySet();

        // 2.
        for (Map.Entry<String, Integer> item : set) {
            System.out.println(item.getKey() + "=" + item.getValue());
        }
        
        //或 2.
        Iterator<Map.Entry<String, Integer>> it = set.iterator();
        while (it.hasNext()) {
            Map.Entry<String, Integer> entry = it.next();
            String key = entry.getKey();
            Number value = entry.getValue();
            System.out.println(key + "=" + value);
        }
    }
}
