package staticdemo;
/*如果一个变量使用了 static 关键字
那么这个变量不再属于对象，而是属于所在类，多个对象共享一份数据
static
 */
public class StaticField {
    public static void main(String[] args) {
        Student one = new Student("郭靖", 19);
        Student two = new Student("黄蓉", 17);

        one.room = "101教师";

        System.out.println("one学号"+ one.getId() + ", one的教室：" + one.room);
        System.out.println("two学号"+ two.getId() +", two的教室：" + two.room);
    }
}
