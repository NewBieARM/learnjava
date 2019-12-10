package demo02;

public class Student {
    String name;
    int age;

    public void eat() {
        System.out.println(name + "正在睡觉！");
    }

    public void sleep() {
        System.out.println(name + "正在睡觉！");
    }

    public void study(String action) {
        System.out.println(name + "正在" + action + "的学习！");
    }

}
