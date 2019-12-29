package Map接口的方法;

import java.util.HashMap;
import java.util.Map;

/*
    Map接口中常用的方法

    public V put(K key, V value):  把指定的键与指定的值添加到Map集合中。
    public V remove(Object key): 把指定的键 所对应的键值对元素 在Map集合中删除，返回被删除元素的值。
    public V get(Object key) 根据指定的键，在Map集合中获取对应的值。
    boolean containsKey(Object key) 判断集合中是否包含指定的键。
    public Set<K> keySet(): 获取Map集合中所有的键，存储到Set集合中。
    public Set<Map.Entry<K,V>> entrySet(): 获取到Map集合中所有的键值对对象的集合(Set集合)。
 */
public class MapDemo {
    public static void main(String[] args) {
//        show01();  // put方法
//        show02(); // remove 方法
//        show03();  //get 方法
        show04();
    }

    private static void show04() {
//        boolean containsKey(Object key) 判断集合中是否包含指定的键。
        Map<String, Integer> map = new HashMap<>();
        map.put("赵丽颖", 165);
        map.put("迪丽热巴", 168);
        map.put("林志玲", 178);

        boolean result = map.containsKey("迪丽热巴");  // true
//        boolean result = map.containsKey("Dilraba"); // false
        System.out.println(result);
    }

    private static void show03() {
       // public V get(Object key) 根据指定的键，在Map集合中获取对应的值。
        Map<String, Integer> map = new HashMap<>();
        map.put("赵丽颖", 165);
        map.put("迪丽热巴", 168);
        map.put("林志玲", 178);

        Number num = map.get("迪丽热巴");
        System.out.println(num);
    }

    private static void show02() {
        // public V remove(Object key): 把指定的键 所对应的键值对元素 在Map集合中删除，
        Map<String, Integer> map = new HashMap<>();
        map.put("赵丽颖", 165);
        map.put("迪丽热巴", 168);
        map.put("林志玲", 178);
        System.out.println(map);  // {林志玲=178, 赵丽颖=165, 迪丽热巴=168}

        map.remove("林志玲");
        System.out.println(map);  // {赵丽颖=165, 迪丽热巴=168}

    }

    private static void show01() {
        /*
            public V put(K key, V value):  把指定的键与指定的值添加到Map集合中。
                返回值：V
                    存储键值对的时候,key不重复,返回值V是null
                    存储键值对的时候,key不重复,会使用新的value替换map中重复的value，返回被替换的值
         */
        Map<String, String> map = new HashMap<>();
        map.put("arman", "newbie");
        map.put("alex", "teacher");
        map.put("tom", "cat");
        System.out.println(map);  // {alex=teacher, tom=cat, arman=newbie}
    }
}
