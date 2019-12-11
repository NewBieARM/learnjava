package demo07;

public class RunStudent {
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.setName("arman");
        stu1.setAge(22);
        System.out.println("姓名: "+stu1.getName()+", 年龄："+stu1.getAge());
        System.out.println("==============================");

        Student stu2 = new Student("dawran", 23);
        stu2.setAge(24);
        System.out.println("姓名: "+stu2.getName()+", 年龄："+stu2.getAge());

    }
}
