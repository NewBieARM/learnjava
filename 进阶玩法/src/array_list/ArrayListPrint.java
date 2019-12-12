package array_list;

import java.util.ArrayList;

/*
题目要求：
    定义已指定格式打印集合的方法（ArrayList 类型作为参数），使用{}扩起集合，使用 @ 分分隔每个元素
    格式参照 {元素@元素@元素}

System.out.println(list)   ->   [10, 20, 30]
printArrayList(list)       ->   {10@ 20@ 30}
 */
public class ArrayListPrint {
    public static void main(String[] args) {
        ArrayList<String> listStr = new ArrayList<>();
        listStr.add("迪丽热巴");
        listStr.add("arman");
        listStr.add("古力娜扎");
        System.out.println(listStr);  //  [迪丽热巴, arman, 古力娜扎]
        printList(listStr);

    }

    public static void printList(ArrayList<String> list) {
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                System.out.print(list.get(i) + "}");
            } else {
                System.out.print(list.get(i) + "@");
            }
        }
    }
}
