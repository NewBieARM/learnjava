package demo01_array;

public class StaticArray {
    public static void main(String[] args) {
        /*
        创建静态数组的标准格式
        静态初始化没有直接指定长度，但是仍然会自动推算得到长度
        */
        int[] ArrayA = new int[]{1, 2, 3};
        String[] ArrayB = new String[]{"Hello", "java"};

        /*
        创建静态数组的省略写法
        */
        int[] ArrayC = {1, 2, 3};

    }
}
