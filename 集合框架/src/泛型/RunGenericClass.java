package 泛型;

public class RunGenericClass {
    public static void main(String[] args) {

        // 不写泛型默认为 Object 类型
        GenericClass gc = new GenericClass();
        gc.setName("哈哈哈");
        System.out.println(gc.getName());

        // 使用泛型  Integer
        GenericClass<Integer> gc2 = new GenericClass<>();
        gc2.setName(12);

        // 使用泛型  String
        GenericClass<String> gc3 = new GenericClass<>();
        gc3.setName("aa");
    }
}