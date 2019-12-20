package finaldemo;
/*
当 final 关键字用来修饰一个方法时：这个方法就是最终方法，也就是不能被覆盖重写
格式：
    public final 返回值类型 方法名称(参数列表){ 方法体}
 */
public class Fu {
    public void method(){
        System.out.println("父类方法..");
    }

    public final void finalMethod(){
        System.out.println("这是 final 方法");
    }
}
