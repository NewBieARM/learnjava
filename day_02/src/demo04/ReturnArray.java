package demo04;

public class ReturnArray {
/*
return 返回时：只能返回一个值，不能返回多个值；
如果有多个返回值，可以使用一个数组作为返回值类型即可；

任何作为方法的参数，传递进去的其实是数组的地址值；
数组作为方法的返回值，返回的也是数组的地址值；
 */
    public static int[] calculate(int a,int b,int c){
        int sum = a + b + c;
        int avg = sum / 3;
        int[] array = {sum, avg};
        return array;
    }

    public static void main(String[] args) {
        int a = 50, b = 60, c = 70;
        int[] result = calculate(a, b ,c);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }
}
