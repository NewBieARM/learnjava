package staticdemo;

public class Student {
    private int id;
    private String name;
    private int age;
    static String room; //   所在教室
    private static int idCounter = 0;   // 学号计数器，每当new了一个新对象，计数器++


    public Student() {
        id = ++idCounter;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        id = ++idCounter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
