package 泛型的通配符;

import java.util.ArrayList;
import java.util.Iterator;

/*
    泛型的通配符：
        ? : 代表任意的数据类型
    使用方式：
        不能创建对象使用
        只能作为方法的参数使用
 */
public class GenericDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list01 = new ArrayList<>();
        list01.add(1);
        list01.add(2);

        ArrayList<String> list02 = new ArrayList<>();
        list02.add("aa");
        list02.add("bb");

        printList(list01);
        printList(list02);

    }

    // 定义一个方法, 能遍历所有类型的 ArrayList集合
    // 我们不知道ArrayList集合使用什么数据类型，可以用泛型的通配符？来接受数据类型
    public static void printList(ArrayList<?> list) {

        Iterator<?> it = list.iterator();

//        while (it.hasNext()){
//            // it.next() 类型取出的是 Object，可以接受任意的数据类型
//            Object o = it.next();
//            System.out.println(o);
//        }

        // 推荐方法
        for (Object o: list){
            System.out.println(o);
        }


    }
}


