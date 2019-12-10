package demo04;

public class PrintArray {

    public static void printArray(int[] item) {
        // for (int value : item)
        for (int i = 0; i < item.length; i++) {
            System.out.println(item[i]);
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 5};
        printArray(array);
    }
}

