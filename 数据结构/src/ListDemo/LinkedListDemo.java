package ListDemo;

import java.util.LinkedList;

/*
    LinkedList 集合的特点
        1.底层是一个链表结构，查询慢，增删快
        2.包含了大量操作首尾元素的方法
    注意：
        使用LinkedList 集合特有的方法，不能使用多态

    public void addFirst(E e): 将指定元素插入此列表的开头。
    public void addLast(E e): 将指定元素添加到此列表的结尾。

    public E getFirst(): 返回此列表的第一个元素。
    public E getLast(): 返回此列表的最后一个元素。

    public E removeFirst(): 移除并返回此列表的第一个元素。
    public E removeLast(): 移除并返回此列表的最后一个元素。
    public E pop(): 从此列表所表示的堆栈处弹出一个元素。  等效于 linkedList.removeFirst()

    public void push(E e): 将元素推入此列表所表示的堆栈。

    public boolean isEmpty()：如果列表不包含元素，则返回true。

 */
public class LinkedListDemo {
    public static void main(String[] args) {
        show01();

        show02();
        ;
    }

    private static void show02() {
//        public E getFirst(): 返回此列表的第一个元素。
//        public E getLast(): 返回此列表的最后一个元素。


    }

    private static void show01() {
//        public void addFirst(E e): 将指定元素插入此列表的开头。
//        public void addLast(E e): 将指定元素添加到此列表的结尾。
//        public E pop(): 从此列表所表示的堆栈处弹出一个元素。
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("c");
        linkedList.add("d");

        linkedList.addFirst("alex"); // 等效于 linkedList.push
        linkedList.addLast("arman");  // 等效于 add()

        System.out.println(linkedList);
    }
}
