package array_list;

import java.util.ArrayList;

/*
ArrayList 常用的方法

public boolean add(E e); 向集合当中添加元素，参数的类型和泛型一致
public E get(int index); 从集合当中 获取元素，参数是索引编号，返回值就是对应位置的元素
public E remove(int index); 从集合当中删除元素，参数是索引编号，返回值就是被删除的元素
public int size(); 获取集合的尺寸长度返回值是集合中包含的元素个数；
 */
public class ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        // 添加
        boolean resultaAdd =list.add("迪丽热巴");
        list.add("李小璐");
        System.out.println("添加操作" + resultaAdd); // 添加的动作是否成功；返回值是一个true

        //获取
        String resultGet = list.get(0);
        System.out.println(resultGet);

        //删除
        String resultRemove = list.remove(1);
        System.out.println("已删除" + resultRemove);

        //长度
        int resultSize = list.size();
        System.out.println("长度是" + resultSize);

        // 遍历集合
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
