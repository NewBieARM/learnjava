package Lambda表达式.无参无返回值;
/*
    定义:
        给定一个厨子Cook接口,内涵唯一的抽象方法makeCook,且无参无返回值
        使用Lambda的标准格式调用invokeCook方法,打印输出"吃饭啦"字样
 */
public class CookDemo {
    public static void main(String[] args) {
        // 调用invokeCook方法,参数是Cook接口,传递Cook接口的匿名内部类
        invokeCook(new Cook() {
            @Override
            public void makeFood() {
                System.out.println("吃饭啦!!");
            }
        });

        // 使用Lambda表达式
        invokeCook( ()-> {
            System.out.println("吃饭啦!!!!");
        });
    }

    // 定义一个方法,参数传递Cook接口,方法内部调用Cook接口的makeFood方法
    public static void invokeCook(Cook cook) {
        cook.makeFood();
    }
}
