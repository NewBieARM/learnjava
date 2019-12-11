package demo03;

public class RunPhone {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.brand = "Apple";
        phone.price = 6999;
        phone.color = "white";
        phone.call("老师");
    }
}
