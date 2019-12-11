package demo07;
/*
一个标准的类通常要拥有下面四个组成成分
1.所有的成员变量都使用 private 关键字修饰
2.为每一个成员变量编写一对 Getter/Setter 方法
3.编写一个无参构造方法
4.编写一个全参构造方法

IDEA快捷生成： 只需要写成员变量 然后 菜单列表： Code->Generate
标准的类也叫做 Java Bean
 */
public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
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
