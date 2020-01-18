package 常用方法.判断;

import java.io.File;

/*
    public boolean exists()：此File表示的文件或目录是否实际存在。

    public boolean isDirectory()：此File表示的是否为目录。
    public boolean isFile()：此File表示的是否为文件。
    注意:
        这两个方法互斥
    使用前提:
        路径必须存在,否则返回 false
 */
public class FileIs {
    public static void main(String[] args) {
        show01();
        show02();
        show03();
    }

    private static void show03() {
        File f1 = new File("G:\\my_share\\code\\a.txt");
        boolean d1 = f1.isFile();
        System.out.println(d1);

        File f2 = new File("G:\\my_share\\code");
        boolean d2 = f2.isFile();
        System.out.println(d2);
    }

    private static void show02() {
        File f1 = new File("G:\\my_share\\code\\a.txt");
        boolean d1 = f1.isDirectory();
        System.out.println(d1);

        File f2 = new File("G:\\my_share\\code");
        boolean d2 = f2.isDirectory();
        System.out.println(d2);
    }

    private static void show01() {
        File f1 = new File("G:\\my_share\\code\\a.txt");
        boolean b1 = f1.exists();
        System.out.println(b1); // true

        File f2 = new File("G:\\my_share\\code\\a.jpg");
        boolean b2 = f2.exists();
        System.out.println(b2);  // false
    }
}
