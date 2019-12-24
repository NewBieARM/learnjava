package 泛型;

public class RunGenericMethod {
    public static void main(String[] args) {
        GenericMethod gm = new GenericMethod();

        gm.method01("alex");
        gm.method01(123);
        gm.method01('a');
        gm.method01(true);


        gm.method01("静态方法， 不建议创建对象使用");

        // 静态方法，通过类名.方法名(参数)  可以直接使用
        GenericMethod.method02("这是静态方法");

    }
}
