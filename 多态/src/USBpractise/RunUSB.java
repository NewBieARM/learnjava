package USBpractise;

public class RunUSB {
    public static void main(String[] args) {
        LapTop computer = new LapTop();
        computer.powerOn();

        //准备一个鼠标供电脑使用， 多态写法
        USB usbMouse = new Mouse();  // 向上转型
        computer.useDevice(usbMouse);
        System.out.println("=========================================");
        // 创建一个 USB 键盘，
        Keyboard keyboard = new Keyboard();
        computer.useDevice(keyboard);  // 参数进去之后，向上转型
//        computer.useDevice(new Keyboard());  // 也是正确写法

        computer.powerOff();
    }
}
