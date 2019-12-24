package Collection常用方法;


import java.util.ArrayList;
import java.util.Collection;

/*
Collection是所有单列集合的父接口，
因此在Collection中定义了单列集合(List和Set)通用的一些方法，
这些方法可用于操作所有的单列集合。方法如下：

    public boolean add(E e)：  把给定的对象添加到当前集合中。
    public void clear() :清空集合中所有的元素。
    public boolean remove(E e): 把给定的对象在当前集合中删除。
    public boolean contains(E e): 判断当前集合中是否包含给定的对象。
    public boolean isEmpty(): 判断当前集合是否为空。
    public int size(): 返回集合中元素的个数。
    public Object[] toArray(): 把集合中的元素，存储到数组中。
 */
public class CollectionDemo {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        System.out.println(coll); // []

        coll.add("alex");
        coll.add("tom");
        coll.add("candy");
        System.out.println(coll); // [alex, tom, candy]

        coll.remove("tom"); // 返回值是一个布尔值，删除成功 true，失败 false
        System.out.println(coll); //[alex, candy]

        boolean result = coll.contains("candy");
        System.out.println(result); // true

        Object[] arr = coll.toArray();
        System.out.println(arr);  // [Ljava.lang.Object;@75412c2f 遍历就能获取

        coll.clear();
        System.out.println(coll); // []
    }
}
