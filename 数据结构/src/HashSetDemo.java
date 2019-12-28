import SetDemo.Person;

import java.util.HashSet;

/*
    HashSet存储自定义类型元素
 */
public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Person> set = new HashSet<>();

        Person p1 = new Person("alex", 19);
        Person p2 = new Person("alex", 12);
        Person p3 = new Person("alex", 19);

        set.add(p1);
        set.add(p2);
        set.add(p3);

        System.out.println(set);
    }
}
