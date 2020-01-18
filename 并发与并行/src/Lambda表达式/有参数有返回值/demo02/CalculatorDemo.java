package Lambda表达式.有参数有返回值.demo02;

public class CalculatorDemo {
    public static void main(String[] args) {
        // 使用匿名内部类
        invokeCalc(5, 9, new Calculator() {
            @Override
            public int calc(int a, int b) {
                return a + b;
            }
        });

        // 使用 Lambda 表达式
        invokeCalc(8, 7, (int a, int b) ->{
            return a + b;
        });
    }

    /*
        定义 invokeCalc 方法
        参数传递两个int类型的整数
        参数传递Calculator接口
        方法内部调用Calculator中的方法calc计算两个整数的和
     */
    public static void invokeCalc(int a, int b, Calculator c) {
        int result = c.calc(a, b);
        System.out.println("结果是:" + result);
    }
}
