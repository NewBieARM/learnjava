package 接口作为成员变量类型;

import java.util.ArrayList;
import java.util.List;

/*
java.util.List 正是 ArrayList 所实现的接口
 */
public class DemoInterface {
    public static void main(String[] args){
        // 左边是接口名称，右边是实现类名称  多态写法
        List<String> list = new ArrayList<>();
        List<String> result = addNames(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }
    }

    public static List<String> addNames(List<String> list){
        list.add("古力娜扎");
        list.add("迪丽热巴");
        return list;
    }

}
