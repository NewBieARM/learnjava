package demo02;
/*
匿名对象： 只有右边的对象，没有左边的名字和赋值运算符
注意事项：匿名对象只能使用唯一一次，下次再用不得不在创建一个新对象
使用建议：如果确定有一个对象只需要用一次时，可以使用
 */
public class Anonymous {
    public static void main(String[] args) {
        Person one = new Person();
        one.name = "Tim";
        one.showName();
        System.out.println("=================");

        // 匿名对象
        new Person().name = "alex";
    }
}
