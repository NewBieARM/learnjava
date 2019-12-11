package demo03;

/*
属性：品牌，价格，颜色
行为：打电话，发短信
 */
public class Phone {
    String brand, color;
    int price;

    public void call(String who) {
        System.out.println("正在给" + who + "打电话");
    }

    public void message() {
        System.out.println("send message...");
    }
}
