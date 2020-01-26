package 通过this引用成员方法;
/*
    通过 this 引用本类的成员方法
 */
public class Husband {
    //定义一个买房子的成员方法
    public void buyHouse(){
        System.out.println("北京二环内买一套四合院.");
    }

    //结婚的方法,参数传递 Richable接口
    public void marry(Richable r){
        r.buy();
    }

    //定义一个非常高兴的方法
    public void soHappy(){
        // 调用结婚的方法
        marry(()-> this.buyHouse());

        /*
            使用方法引用优化Lambda表达式
            this 已存在
            buyHouse 已存在
            所以 可以使用this引用本类的成员方法buyHouse
         */
        marry(this::buyHouse);
    }

    public static void main(String[] args) {
        Husband husband = new Husband();
        husband.soHappy();
    }
}
