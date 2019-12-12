package array_list;

public class ArrayDemo {
    public static void main(String[] args) {
        // 首先创建一个长度为3的数组，用来存放Person类型的对象；
        Person[] array = new Person[3];
        Person one = new Person("迪丽热巴",20);
        Person two = new Person("古力娜扎",21);
        Person three = new Person("aypatam",30);

        array[0] = one;
        array[1] = two;
        array[2] = three;

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i].getName());

        }
    }
}
