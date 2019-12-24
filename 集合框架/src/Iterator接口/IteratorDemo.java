package Iterator接口;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
    java.util.Iterator 接口； 迭代器（对集合进行遍历）
    有两个常用的方法：
        1. boolean hasNext() 如果仍有元素可以迭代 则返回 true
            判断集合中还有没有下一个元素，有就返回 true，没有就返回 false
        2. next() 返回迭代的下一个元素， 取出集合的下一个元素
     Iterator 迭代器是一个接口，无法直接使用，需要使用Iterator接口的实现类对象，获取实现类的方式比较特殊
     Collection接口有一个方法 叫iterator()，这个方法返回的就是迭代器的实现类对象
        Iterator<E> iterator()
            返回在此 collection 的元素上进行迭代的迭代器

     迭代器的使用步骤（重点）：
        1.使用集合中的方法 iterator() 获取迭代器的实现类对象，使用Iterator接口接受（多态）
        2.使用Iterator接口中的方法 hasNext() 判断还有没有下一个元素
        3.使用Iterator接口中的方法 next() 取出集合的下一个元素

 */
public class IteratorDemo {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();

        coll.add("arman");
        coll.add("alex");
        coll.add("tom");

        Iterator<String> iterator = coll.iterator();


        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
