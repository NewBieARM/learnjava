package 常用的函数式接口.practice;

import java.util.ArrayList;
import java.util.function.Predicate;

/*
    练习:集合信息筛选
    数组当中有多条"姓名+性别"的信息如下
        String[] info = {"迪丽热巴,女", "阿尔曼,男", "古力娜扎,女", "佟丽娅,女"};
    请通过 Predicate接口的拼装将符合要求的zi'fu'chuan'shai'xuan

 */
public class PredicateScreening {
    public static ArrayList<String> screening(String[] arr, Predicate<String> pre1, Predicate<String> pre2){
        ArrayList<String> list = new ArrayList<>();

        for (String str: arr){
            if (pre1.and(pre2).test(str)){
                list.add(str);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        String[] info = {"迪丽热巴,女", "阿尔曼,男", "古力娜扎,女", "佟丽娅,女"};
//        ArrayList<String> result = screening(info, (str) -> {
////            String[] split = str.split(",");
////            return split[0].length() >= 4;
//            return str.split(",")[0].length() >= 4;
//        }, (str) -> {
////            String[] split = str.split(",");
////            return split[1].equals("女");
//            return str.split(",")[1].equals("女");
//        });

        //简化
        ArrayList<String> result = screening(info, str -> str.split(",")[0].length() >=4, str -> str.split(",")[1].equals("女"));

        for (String s: result) {
            System.out.println(s);
        }
    }
}
