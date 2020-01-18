package File类概述;

import java.io.File;

/*
    static String pathSeparator 与系统相关的路径分隔符字符，为方便起见，表示为字符串。
    static char pathSeparatorChar 与系统相关的路径分隔符。
    static String separator 与系统相关的默认名称 - 分隔符字符，以方便的方式表示为字符串。
    static char separatorChar 与系统相关的默认名称分隔符。

    操作路径:路径不能写死
    D:\java_code\test   ->    "D:" +File.pathSeparator+ "java_code" +File.pathSeparator+ "test"
 */
public class FileDemo01 {
    public static void main(String[] args) {
        String s1 = File.pathSeparator;
        System.out.println(s1);  // 路径分隔符 windows:分号;   linux:冒号:

        String s2 = File.separator;
        System.out.println(s2); // 文件名称分隔符   windows:反斜杠\;   linux:正斜杠/:
    }
}
