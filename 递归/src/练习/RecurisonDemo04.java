package 练习;

import java.io.File;

public class RecurisonDemo04 {
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
            if (file.isDirectory()){ // 如果是一个文件夹,就继续遍历这个文件夹
                getAllFile(file);
            }

            // 选择文件
            if (file.getName().toLowerCase().endsWith(".txt")) {  // 只要.java结尾的文件
                System.out.println(file);
            }
        }
    }
}
