package Map接口的方法;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
    Map 集合的第一种遍历方式：通过键找值
    Map集合中的方法：
        public Set<K> keySet(): 获取Map集合中所有的键，存储到Set集合中。
    实现步骤：
        1.使用Map集合中的方法 keySet(), 把Map集合所有的key取出来,存储到一个Set集合中
        2.遍历set集合,获取Map集合中的每一个key
        3.通过Map集合中的方法get(key),通过key找到value

    第二种方法：
        public Set<Map.Entry<K,V>> entrySet(): 获取到Map集合中所有的键值对对象的集合(Set集合)。
 */
public class MapSetDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("赵丽颖", 165);
        map.put("迪丽热巴", 168);
        map.put("林志玲", 178);

        //1. 使用Map集合中的方法 keySet(), 把Map集合所有的key取出来,存储到一个Set集合中
        Set<String> set = map.keySet();

        //2.使用迭代器遍历set集合
        Iterator<String> it = set.iterator();
        while (it.hasNext()){
            String key = it.next();
            //3.
            Number value = map.get(key);
            System.out.println(value);
        }
        //2.使用迭代器遍历set集合  增强for循环
        for (String key: set) {
            System.out.println("key: " + map.get(key));
        }
    }
}