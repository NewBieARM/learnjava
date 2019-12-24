package 泛型;
/*
    定义含有泛型的方法：泛型定义咋哦方法的修饰符和返回值之间
        修饰符 <泛型> 返回值类型 方法名(参数列表使用泛型)){  方法体}

        含有泛型的方法，在调用方法的时候确定泛型的数据类型
        传递什么类型的参数，泛型就是什么类型
  */
public class GenericMethod {
    //定义一个含有泛型的方法
    public <M> void method01(M m){
        System.out.println(m);
    }

    //定义一个含有泛型的的静态方法
    public static <S> void method02(S s){
        System.out.println(s);
    }

}
