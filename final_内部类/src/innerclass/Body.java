package innerclass;

import org.w3c.dom.ls.LSOutput;

public class Body {
    public class Heart { //成员内部类
        public void beat(){
            System.out.println("心脏跳动蹦蹦蹦...");
            System.out.println("我叫：" + name);
        }
    }

    //外部类的成员变量
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void method(){
        System.out.println("外部类的方法..");
//        Heart heart = new Heart();
        new Heart().beat();
    }
}
