package USBpractise;

public class LapTop {
    //开机
    public void powerOn(){
        System.out.println("笔记本电脑开机");
    }
    //关机
    public void powerOff(){
        System.out.println("笔记本电脑关机");

    }
    // 使用 USB 设备的方法，使用接口作为方法的参数
    public void useDevice(USB usb){
        usb.open(); // 打开设备
        if (usb instanceof Mouse) {
            Mouse mouse = (Mouse) usb;
            mouse.click();
        }
        else if (usb instanceof Keyboard) {
            Keyboard kb = (Keyboard) usb;
            kb.type();
        }
        usb.close(); // 关闭设备
    }
}
