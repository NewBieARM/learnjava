package 遍历目录;

import java.io.File;

/*
    File类遍历(文件夹)目录功能:
        public String[] list()：返回一个String数组，表示该File目录中的所有子文件或目录。
        public File[] listFiles()：返回一个File数组，表示该File目录中的所有的子文件或目录。

    注意:
        list方法和listFile方法便利的是构造方法中给出的目录
        如果构造方法中给出的路径不存在,会抛出空指针异常
        如果构造方法中给出的路径不是一个目录,也会抛出空指针异常

        隐藏的文件/文件夹也能获取到
 */
public class FileDemo {
    public static void main(String[] args) {
//        show01();
        show02();
    }

    private static void show02() {
    /*
        public File[] listFiles()：返回一个File数组，表示该File目录中的所有的子文件或目录。
        遍历构造方法中给出的目录,会获取目录中所有文件/文件夹,把文件夹/文件封装为File对象,多个File对象存储到File数组中
     */
        File f1 = new File("G:\\my_share\\code");
        File[] files = f1.listFiles();
        for (File f : files) {
            System.out.println(f);
        }
    }

    private static void show01() {
    /*
        public String[] list()：返回一个String数组，表示该File目录中的所有子文件或目录。
        遍历构造方法中给出的目录,会获取目录中所有文件/文件夹的名称,把获取到的多个名称存储到一个String类型的数组中
     */
        File f1 = new File("G:\\my_share\\code");
        String[] arr = f1.list();
        for (String fileName : arr) {
            System.out.println(fileName);
        }
    }
}
