package array_list;

import java.util.ArrayList;

/*
ArrayList 集合的长度可以随意变化

对于 ArrayList 来说，有一个尖括号 <E> 代表泛型；
泛型：也就是装在集合当中的所有元素，全都是统一的什么类型；
注意：泛型只能是引用类型，不能是基本类型

注意事项：
    对于 ArrayList集合来说：直接打印得到的不是地址值，而是内容
    如果内容为空，得到的是空中括号 []
 */

public class ArrayListDemo {
    public static void main(String[] args) {


        // 创建了一个 ArrayList 集合，里面只能装 String
        // 备注：从 JDK1.7+ 开始，右边的<>括号能可以省略
        ArrayList<String> list = new ArrayList<>();
        list.add("哇哈哈");
        list.add("dilraba");
        list.add("arman");
        list.add("100"); // 必须是 String
        System.out.println(list);
    }
}
