package array_list;

import java.util.ArrayList;

/*
如果希望向集合ArrayList 当中存储基本类型数据，必须使用基本类型对象的”包装类“；

基本类型       包装类（应用类型、包装类都位于 java.lang 包下）
byte          Byte
short         Short
int           Integer    【特殊】
char          Character  【特殊】

其他都是首字母变成大写

从 JDK1.5+ 开始，支持自动装箱、自动拆箱

自动装箱： 基本类型 -> 包装类型；
自动拆箱： 包装类型 -> 基本类型；
 */
public class ArrayListBasic {
    public static void main(String[] args) {
        ArrayList<Integer> listInt = new ArrayList<>();
        listInt.add(100);
        listInt.add(199);
    }
}
