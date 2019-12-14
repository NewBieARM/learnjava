package mathdemo;

/*
题目：
    计算在 -10.8 到 5.9之间，绝对值大于 6 或者小于 2.1的整数有多少个

    正确答案应该是9个：

    分析：
        1.既然已经确定了范围，for 循环
        2.起点是 -10.8，应该转换成 -10， 两种办法
            2.1 可以使用 Math.ceil() ，向上取整
            2.2 强制转换 int ，自动舍弃所有小数位
        3.每一个数字都是整数，所以步进表达式应该是 num++, 这样每次都是 +1 的
 */
public class MathPractise {
    public static void main(String[] args) {
        int minNum = (int) -10.8;
        int maxNum = (int) 5.9;
        int count = 0;
        for (; minNum <= maxNum; minNum++) {
            if (Math.abs(minNum) > 6 || Math.abs(minNum) < 2.1){
                count ++;
            }
        }
        System.out.println(count);
    }
}
