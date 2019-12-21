package 发红包;

import red.RedPacketFrame;

public class BootStrap{
    public static void main(String[] args) {
        MyRed red = new MyRed("你日哥给你发红包");
        // 群主姓名
        red.setOwnerName("你日哥");

        // 普通红包
//        NormalMode normalMode = new NormalMode();
//        red.setOpenWay(normalMode);

        //随机红包
        RandomMode randomMode = new RandomMode();
        red.setOpenWay(randomMode);
    }
}
