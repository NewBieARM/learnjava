package 通过类名引用静态方法;
/*
    通过类名引用静态成员方法
    类已经存在,静态成员方法也已经存在
    就可以通过类名直接引用成员方法
 */
public class StaticMethodReference {
    // 定义一个方法,方法的参数传递要计算绝对值的整数和函数式接口Calcble
    public static int method(int num, Calcable c){
        return c.calcAbs(num);
    }

    public static void main(String[] args) {
        // 调用method方法,传递计算绝对值的整数,和Lambda表达式
        // 对参数进行绝对值计算并返回结果
        int result1 = method(-5, n->Math.abs(n));

        // 使用方法引用优化 Lambda 表达式
        int result2 = method(-10, Math::abs);

        System.out.println(result2);
    }
}
