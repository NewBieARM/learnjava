package 常用方法.创建删除;

import java.io.File;
import java.io.IOException;

/*
    public boolean createNewFile()：当且仅当具有该名称的文件尚不存在时，创建一个新的空文件。
    public boolean delete()：删除由此File表示的文件或目录。
    public boolean mkdir()：创建由此File表示的目录。
    public boolean mkdirs()：创建由此File表示的目录，包括任何必需但不存在的父目录。
 */
public class FileCreateDelete {
    public static void main(String[] args) throws IOException {
//        show01();
        show02();
//        show03();
    }

    private static void show03() {
        /*
        public boolean mkdir()：创建单级空文件夹
        public boolean mkdirs()：即可以创建单级空文件夹,也可以创建多级空文件夹
         */
        File f1 = new File("G:\\my_share\\code\\file");
        boolean b1 = f1.mkdir();  // 创建文件夹 file
        System.out.println(b1);

        File f2 = new File("G:\\my_share\\code\\多级文件夹\\子文件夹\\最小文件夹");
        boolean b2 = f2.mkdirs();
        System.out.println(b2);
    }

    private static void show02() {
        /*
            public boolean delete()：删除由此File表示的文件或目录。
            可以删除文件和文件夹

            注意:
                delete方法是直接在硬盘删除,不走回收站,删除需谨慎
         */
        File f1 = new File("G:\\my_share\\code\\b.txt");
        boolean b1 = f1.delete();  // 删除 b.txt
        System.out.println(b1);

    }

    private static void show01() throws IOException {
        /*
        public boolean createNewFile()：当且仅当具有该名称的文件尚不存在时，创建一个新的空文件。
        返回值:
            true:文件不存在,创建文件,返回true
            false:文件存在,不会创建文件,返回false
        注意:
            此方法只能创建文件,不能创建文件夹
            2.创建文件的路径必须存在,不然会抛出异常
         */
        File f1 = new File("G:\\my_share\\code\\b.txt");
        boolean b1 = f1.createNewFile();
        System.out.println(b1);
    }
}
