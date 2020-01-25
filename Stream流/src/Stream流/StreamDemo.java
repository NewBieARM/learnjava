package Stream流;

import java.util.ArrayList;
import java.util.List;
/*
    使用传统的方法,遍历集合,对集合中的数据进行过滤
 */
public class StreamDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("迪丽热巴");
        list.add("张无忌");
        list.add("赵饼");
        list.add("张三丰");
        list.add("古力娜扎");
        list.add("张口大师");

        ArrayList<String> arr = new ArrayList<>();
        // 过滤姓为 张 的人
        for (String name: list){
            if (name.startsWith("张")) {
                arr.add(name);
            }
        }

        ArrayList<String> arr2 = new ArrayList<>();
        // 过滤名字长度为3的人
        for (String str: arr){
            if (str.length() == 3) {
                arr2.add(str);
            }
        }

        for (String str: arr2){
            System.out.println(str);
        }
    }
}
