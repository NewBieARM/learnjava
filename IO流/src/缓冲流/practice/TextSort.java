package 缓冲流.practice;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

/*
    练习:
        对文本的内容进行排序
        按照(1,2,3...)顺序排序
    分析:
        1.创建一个HashMap集合对象, key:存储每行文本的序号 value:存储文本
        2.创建字符缓冲输入流对象,构造方法中绑定字符输入流
        3.创建字符缓冲输出流对象,构造方法中绑定字符输出流
        4.使用readLine()方法,逐行读取文本
        5.对读取到的文本,进行切割,获取序号和内容
        6.切割好的序号和文本的内容存储到HashMap集合中(key序号是有序的,会自动排序1,2,3...)
        7.遍历HashMap集合,获取每一个键值对
        8.拼接文本行, 写入文本
        9.释放资源
 */
public class TextSort {
    public static void main(String[] args) throws IOException {
        HashMap<String, String> hm = new HashMap<>();
        BufferedReader br = new BufferedReader(new FileReader("G:\\my_share\\code\\排序练习.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("G:\\my_share\\code\\排序练习以排序.txt"));

        String line = null;
        while ((line = br.readLine()) != null) {
            String[] split = line.split("\\.");
            hm.put(split[0], split[1]);
        }

        br.close();  // 关闭读取


//        for (int i = 0; i < hm.size(); i++) {
//            String key = String.valueOf(i+1); // 利用 i 来自己添加key
//            String value = hm.get(key);
//            bw.write(key + "." + value);
//            bw.newLine();
//        }

        // 推荐此方法
        for (String key : hm.keySet()) {   // hm.keySet() 自动排序
            String value = hm.get(key);
            bw.write(key + "." + value);
            bw.newLine();
        }

        bw.close();  // 关闭写入
    }
}
