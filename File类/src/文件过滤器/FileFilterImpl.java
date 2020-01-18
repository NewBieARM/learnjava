package 文件过滤器;

import java.io.File;
import java.io.FileFilter;

/*
    创建过滤器FileFilter的实现类,重写过滤方法accept,定义规则
    过滤规则:
        在accept方法中,判断FIle对象是否是以.java结尾的
        是就返回true
        不是就返回false
 */
public class FileFilterImpl implements FileFilter{
    @Override
    public boolean accept(File pathname) {
        if (pathname.isDirectory()){
            return true;
        }
        return pathname.getName().toLowerCase().endsWith(".txt");
    }
}
