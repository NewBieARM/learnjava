package staticdemo;

public class StaticStudent {
    public static void main(String[] args) {
        // 首先设置一下教师，这是静态的东西，应该通过类名称进行调用
        Student.room = "221教师";
        Student one = new Student("arman", 22);
        Student two = new Student("alex", 23);

        System.out.println("one的名字：" + one.getName());
        System.out.println("one的年龄：" + one.getAge());
        System.out.println("one的教室：" + Student.room);
    }
}
