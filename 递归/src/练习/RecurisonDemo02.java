package 练习;

public class RecurisonDemo02 {
    public static void main(String[] args) {
        int result = jieCheng(5);
        System.out.println(result);
    }

    private static int jieCheng(int num) {
        if (num == 1) {
            return 1;
        }
        return num*jieCheng(num-1);
    }
}
