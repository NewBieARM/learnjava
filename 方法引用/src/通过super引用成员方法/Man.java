package 通过super引用成员方法;
/*
    定义子类
 */
public class Man extends Human {
    // 子类重写父类 sayHello 的方法
    public void sayHello(){
        System.out.println("Hey, I am Man");
    }

    // 定义一个方法,参数传递 Greetable 接口
    public void method(Greetable g){
        g.greet();
    }

    public void show(){
        //调用 method 方法,方法的参数Greeatable是一个函数式接口,可以传递Lambda
//        method(()->{
//            //创建父类 Human 对象
//            Human h = new Human();
//            h.sayHello();
//        });

//        method(()->super.sayHello());

        /*
            使用 super 引用父类的成员方法
            super 已经存在
            父类成员方法 sayHello 也已经存在
            所以可以直接使用 super 引用父类的成员方法
         */
        method(super::sayHello);

        // 因为有字符类关系,所以存在一个关键字 super,代表父类,所以我们可以直接使用 super 调用父类的成员方法
    }

    public static void main(String[] args) {
        new Man().show();
    }
}
