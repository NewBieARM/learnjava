package 类的构造器引用;
/*
    类的构造器(构造方法)引用
 */
public class Demo {
    //定义一个方法,参数传递姓名和PersonBuilder接口,方法中通过姓名创建Person对象
    public static void printName(String name, PersonBuilder pb){
        Person person = pb.builderPerson(name);
        System.out.println(person.getName());
    }

    public static void main(String[] args) {
        // 调用 printName 方法,方法的参数PersonBuilder就扣是一个函数式接口,可以传递Lambda
        printName("迪丽热巴", (name)->{
            return new Person(name);
        });

        /*
            使用方法引用,优化Lambda 表达式
            已知 构造方法 new Person(String name)
            已知 创建对象
         */
        printName("古力娜扎", Person::new); // 使用Person类的带参构造方法,通过传递的姓名创建对象
    }
}
