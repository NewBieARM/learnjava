package Stream流;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("迪丽热巴");
        list.add("张无忌");
        list.add("赵饼");
        list.add("张三丰");
        list.add("古力娜扎");
        list.add("张口大师");


        list.stream()
                .filter(name -> name.startsWith("张"))
                .filter(name -> name.length() == 3)
                .forEach(name -> System.out.println(name));
    }
}
