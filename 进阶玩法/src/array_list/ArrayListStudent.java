package array_list;

import java.util.ArrayList;

/*
题目：
    自定义 4 个学生对象，添加到表格，并遍历
 */
public class ArrayListStudent {
    public static void main(String[] args) {
        ArrayList<Student> listStu = new ArrayList<>();
        Student one = new Student("杜良峪", 21);
        Student two = new Student("arman", 22);
        Student tree = new Student("王子阳", 20);
        Student four = new Student("邓雨宸", 21);

        listStu.add(one);
        listStu.add(two);
        listStu.add(tree);
        listStu.add(four);

        for (int i = 0; i < 4; i++) {
            String name = listStu.get(i).getName();
            int age = listStu.get(i).getAge();
            System.out.println("姓名：" + name + ", 年龄: " + age);
        }
    }
}
