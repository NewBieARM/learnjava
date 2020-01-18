package 优化文件过滤器;

import 文件过滤器.FileFilterImpl;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

/*
    在File类中有两个和ListFiles重载的方法,方法的参数传递的就是过滤器

    File[] listFiles(FileFilter filter)
    java.io.FileFilter接口:用于抽象路径名(File对象)的过滤器
        过滤文件(File对象)
        抽象方法:用来过滤文件的方法
            boolean accept(File pathname) 测试指定抽象路径名是否应该包含在某个路径名列表中
            参数:
                File pathname: 使用ListFiles方法遍历目录,得到的每一个文件对象

    File[] listFiles(FilenameFilter filter)
    Java.io.FilenameFilter 接口: 实现此接口的类示例可用于过滤器文件名
        作用:用于过滤文件名称
        抽象方法:用来过滤的方法
            boolean accept(File dir, String name) 测试指定文件是否应该包含在某一文件列表中
            参数:
                File dir:构造方法中传递的目录
                String name:使用ListFiles放啊发遍历目录,获取的每一个文件/文件夹的名称
    注意:
        两个过滤器是没有实现类的,需要我们自己重写实现类,重写过滤的方法accept,在方法中自己定义规则
 */
public class FileFilterDemo {
    public static void main(String[] args) {
        File file = new File("G:\\my_share\\code");
        getAllFile(file);
    }
    public static void getAllFile(File dir) {

        // 使用lambda表达式优化文件过滤, 省略后的Lambda表达式
        File[] files = dir.listFiles(pathname-> pathname.isDirectory()||pathname.getName().toLowerCase().endsWith(".txt"));

        //第二种方式 FilenameFilter接口
//        File[] files = dir.listFiles((d, name)->
//                new File(d, name).isDirectory() || name.toLowerCase().endsWith(".txt")
//        );

        for (File file : files) {
            if (file.isDirectory()){ // 如果是一个文件夹,就继续遍历这个文件夹
                getAllFile(file);
            }else {
                System.out.println(file);
            }
        }
    }

}
