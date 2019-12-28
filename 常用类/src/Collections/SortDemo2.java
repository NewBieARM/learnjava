package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
 public static <T> void sort(List<T> list，Comparator<? super T> ) :将集合中元素按照指定规则排序。

 Comparator 和 Comparable 的区别
    Comparable：自己(this)和别人(参数)比较，自己需要实现 Comparable 接口，重写比较规则 compareTo 方法
    Comparator：相当于找一个第三方的裁判，比较两个

 Comparator 的排序规则：
    o1 - o2; 升序
    o2 - o1; 降序
 */
public class SortDemo2 {
    public static void main(String[] args) {
        ArrayList<Integer> list01 = new ArrayList<>();
        Collections.addAll(list01, 1, 3, 2, 7, 5);
        Collections.sort(list01, new Comparator<Integer>() {
            // 重写比较的规则
            @Override
            public int compare(Integer o1, Integer o2) {
//                return o1 - o2; // 升序
                return o2 - o1; // 降序序
            }
        });
        System.out.println(list01);


        // 自定义类 Student
        ArrayList<Student> list03 = new ArrayList<>();
        list03.add(new Student("arman", 18));
        list03.add(new Student("alex", 17));
        list03.add(new Student("atom", 20));
        list03.add(new Student("arman", 12));

//        Collections.sort(list03, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
////                return o1.getAge() - o2.getAge();  //升序
//                return o2.getAge() - o1.getAge();  //降序
//            }
//        });

        Collections.sort(list03, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int result = o1.getAge() - o2.getAge();  //升序
                if (result == 0) {
                    result = o1.getName().charAt(0) - o2.getName().charAt(0);
                }
                return result;
            }
        });


        System.out.println(list03);
    }
}
