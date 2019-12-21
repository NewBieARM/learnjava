package innerclass;

public class InnerClass {
    public static void main(String[] args) {
        Body body = new Body();  // 外部类的对象
        // 通过外部类的对象，调用外部类的方法，里面间接在使用内部类 Heart
        body.method();  //间接调用
        System.out.println("===================================");
        Body.Heart heart2 = new Body().new Heart();  //直接调用
        heart2.beat();
    }
}
