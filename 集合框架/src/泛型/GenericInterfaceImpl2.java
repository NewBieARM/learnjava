package 泛型;

import java.sql.SQLOutput;

/*
    含有泛型的接口第二种使用方式：接口使用使用什么泛型，实现类就是用什么泛型，类跟着接口走
    就相当于定义了一个含有泛型的类，创建对象的使用确定泛型的类型
    public interface List<E>{
        boolean add(E e);
        E get(itn index);
    }
    public class ArrayList<E> implements List<E>{
        public boolean add(E e) {}
        public E get(itn index) {}
    }

 */
public class GenericInterfaceImpl2<I> implements GenericInterface<I> {
    @Override
    public void method(I i) {
        System.out.println(i);
    }
}
