package extendsdemo;

public class Zi extends Fu{
    int num = 20;

    public void method(){
        int num = 30;
        System.out.println(num);        //局部变量
        System.out.println(this.num);   //本来的
        System.out.println(super.num);  // 父类的
    }
}
