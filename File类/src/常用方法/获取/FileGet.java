package 常用方法.获取;

import java.io.File;

/*
    public String getAbsolutePath() ：返回此File的绝对路径名字符串。
    public String getPath()：将此File转换为路径名字符串。

    public String getName()：返回由此File表示的文件或目录的名称。

    public long length() ：返回由此File表示的文件的长度。
 */
public class FileGet {
    public static void main(String[] args) {
//        show01();
//        show02();
        show03();
    }

    private static void show03() {
        /*
            public long length() ：返回由此File表示的文件的长度。
            获取构造方法指定的文件的大小,以字节为单位
            注意:
                文件夹没有大小概念,不能获取文件夹的大小
                如果构造方法给出的路径不存在,那么length方法返回0
         */
        File f1 = new File("G:\\my_share\\code\\a.txt");
        long l1 = f1.length();
        System.out.println(l1);
    }

    private static void show02() {
        /*
            public String getName()：返回由此File表示的文件或目录的名称。
            获取的就是构造方法传递路径的结尾部分(文件/文件夹)
         */
        File f1 = new File("G:\\my_share\\code\\a.txt");
        File f2 = new File("G:\\my_share\\code");
        String name1 = f1.getName();
        System.out.println(name1);
        String name2 = f2.getName();
        System.out.println(name2);
    }

    private static void show01() {
        /*
            public String getAbsolutePath() ：返回此File的绝对路径名字符串。
            获取的构造方法中传递路径, 无论路径是绝对的还是相对的,
   *** 此方法汉辉的都是绝对路径
         */
        File f1 = new File("G:\\my_share\\code\\a.txt");
        String absolutePath1 = f1.getAbsolutePath();
        System.out.println(absolutePath1);  // G:\my_share\code\a.txt

        File f2 = new File("a.txt");
        String absolutePath2 = f2.getAbsolutePath();
        System.out.println(absolutePath2);  // D:\java_code\a.txt

        String path2 = f2.getPath();
        System.out.println(path2); // a.txt
    }
}
