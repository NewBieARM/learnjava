package demo04;

/*
一旦使用了 private 进行修饰，那么本地当中仍然可以随意访问；
大师 超出被类外围外就不能再直接访问了！

间接访问 private 成员变量，就是定义一对 Getter/Setter放啊发
格式：getXxx / setXxx
对于 Getter 来说，不能有参数，返回值类型和成员变量对应；
对于 Setter 来说，不能有返回值，参数类型和成员变量对那个；

boolen 比较特殊， boolen的 Getter 是 isXxx()
 */
public class PrivatePerson {
    String name;
    private int age;  //只能在本类当中访问

    public void func() {
        System.out.println("name: " + name + ", age: " + age);
    }

    public void setAge(int num) {
        if (num >= 0 && num < 100) {
            age = num;
        }
    }

    public int getAge() {
        return age;
    }
}
