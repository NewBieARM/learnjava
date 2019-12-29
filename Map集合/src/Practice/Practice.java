package Practice;

import java.util.HashMap;
import java.util.Scanner;

/*
需求：
    计算一个字符串中每个字符出现次数。

分析
    1.获取一个字符串对象
    2.创建一个Map集合，键代表字符，值代表次数。
    3.遍历字符串得到每个字符。
    4.判断Map中是否有该键。
    5.如果没有，第一次出现，存储次数为1；如果有，则说明已经出现过，获取到对应的值进行++，再次存储。
    6.打印最终结果
 */
public class Practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter some string: ");
        String entryStr = input.next();
        stringsCount(entryStr);
    }

    private static void stringsCount(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!map.containsKey(c)){
                map.put(c, 1);
            }else {
                map.put(c, map.get(c)+1);
            }
        }
        System.out.println(map);
    }
}
