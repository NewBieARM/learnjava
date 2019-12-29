package HashMap;

import java.util.HashMap;
import java.util.Set;

public class HashMapSavePerson {
    public static void main(String[] args) {
//        show01();
        show02();
    }

    private static void show02() {
        /*
            HashMap存储自定义类型键值
            key:Person类型
                Person类必须重写hashCode方法和equals方法,以保证key唯一
            value:String类型
                可以重复
         */
        HashMap<Person, String> map = new HashMap<>();
        map.put(new Person("handsome", 22), "arman");
        map.put(new Person("beauty", 20), "alex");
        map.put(new Person("handsome", 22), "arman");

        Set<Person> set = map.keySet();

        for (Person key : set) {
            String value = map.get(key);
            System.out.println(key + "-> " + value);
        }
    }

    private static void show01() {
        /*
            HashMap存储自定义类型键值:
            key:String类型
                String类重写了hashCode方法和equals方法,可以保证key唯一
            value:Person类型
                value可以重复(同名同年龄视为同一个人)
         */
        HashMap<String, Person> map = new HashMap<>();

        map.put("arman", new Person("handsome", 22));
        map.put("alex", new Person("beauty", 20));
        map.put("arman", new Person("newbie", 18));

        Set<String> set = map.keySet();
        System.out.println(set);

        for (String key : set) {
            Person value = map.get(key);
            System.out.println(key + "->" + value);
        }

    }
}

