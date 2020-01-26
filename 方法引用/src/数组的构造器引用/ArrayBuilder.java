package 数组的构造器引用;
/*
    创建数组的函数式接口
 */
@FunctionalInterface
public interface ArrayBuilder {
    //创建int类型数组的方法,参数传递数组的长度,返回创建好的 int 类型的数组
    int[] builderArray(int length);
}
