package 练习;
/*
    练习:
        使用递归计算 1-n 之间的和

    1+2+3+...+n     n+(n-1)+(n-3)+...+1
    已知:
        最大值:n  最小值:1
    使用递归必须明确:
        1.递归的结束条件: 获取到1的时候结束
        2.递归的目的: 获取下一个被加的数字(n-1)
 */
public class RecurisonDemo01 {
    public static void main(String[] args) {
        int result = sum(5);
        System.out.println(result);
    }

    private static int sum(int n) {
        // 获取到1结束
        if (n == 1) {
            return 1;
        }
        return n + sum(n -1);
    }
}
