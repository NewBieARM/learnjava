package 练习;

import java.io.File;
import java.util.ArrayList;

public class RecurisonDemo03 {
    public static void main(String[] args) {
        /*
            定义一个方法,参数传递File类型的目录
            昂发中对目录进行遍历
         */
        File file = new File("G:\\my_share\\code");
        getAllFile(file);
    }
    public static void getAllFile(File dir) {
        File[] files = dir.listFiles();
        for (File file : files) {
            System.out.println(file);
            if (file.isDirectory()){ // 如果是一个文件夹,就继续遍历这个文件夹
                getAllFile(file);
            }
        }
    }
}
