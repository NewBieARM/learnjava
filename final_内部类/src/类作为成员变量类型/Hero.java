package 类作为成员变量类型;

public class Hero {
    private String name;  // 英雄名字
    private Weapon weapon;  //武器   自己定义的
    private int age; // 年龄

    public Hero() {
    }

    public Hero(String name, Weapon weapon, int age) {
        this.name = name;
        this.weapon = weapon;
        this.age = age;
    }

    public void attack(){
        System.out.println("年龄为" + age + "的" + name + "用" + weapon.getCode() + "攻击敌方");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
