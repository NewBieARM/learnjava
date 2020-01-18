package File类概述;

import java.io.File;

/*
    File类的构造方法:
        1.File (String pathname) 通过将给定的路径名字符串转换为抽象路径名来创建新的 File实例。
        参数:
            String pathname : 字符串的路径名称
            路径可以是以文件结尾,也可以是以文件夹结尾; 可以存在也可以不存在

        2.File(String parent, String child) 从父路径名字符串和子路径名字符串创建新的 File实例。
        参数:把路径分成了两部分
            Sting parent: 父路径
            String child: 子路径
            好处: 可以单独书写,方便,而且都可以变化

        3.File(File parent, String child) 从父抽象路径名和子路径名字符串创建新的 File实例
            父路径是File类型,可以是用File类的方法对路径做一些操作
 */
public class FileDemo02 {
    public static void main(String[] args) {
        File f1 = new File("G:\\a.txt");
        System.out.println(f1); // G:\a.txt

        File f2 = new File("C:\\", "a.txt");
        System.out.println(f2);

        File parent = new File("C:\\");
        File f3 = new File(parent, "hello.java");
        System.out.println(f3);

    }
}
