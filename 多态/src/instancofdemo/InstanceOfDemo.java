package instancofdemo;
/*
如何才能知道一个父类引用的对象，本来是什么子类？
格式：
    对象 instanceof 类型，
    这将会得到一个boolean值结果，也就是判断前面的对象能不能当作后面类型的示例。
 */
public class InstanceOfDemo {
    public static void main(String[] args) {
        Animal animal = new Cat();   //本来是一只猫
        animal.eat();  //猫吃鱼

        //如果希望调用子类特有的方法 fun() ，需要向下转型
        gibeMeAPet(new Cat());
//        gibeMeAPet(new Dog());
    }
    public static void gibeMeAPet(Animal animal){
        if (animal instanceof Dog){
            Dog dog = (Dog) animal;
            dog.fun();
        }
        if (animal instanceof Cat){
            Cat cat = (Cat) animal;
            cat.fun();
        }
    }
}
