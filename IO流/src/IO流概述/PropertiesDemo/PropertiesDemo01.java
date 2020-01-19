package IO流概述.PropertiesDemo;

import java.util.Properties;
import java.util.Set;

/*
    java.util.Properties集合 extends HashTable<k, v> implements Map<k, v>
    Properties类表示一组持久的属性。 Properties可以保存到流中或从流中加载。
    Properties集合是一个唯一和IO流结合的集合
        可以使用Properties集合中的方法store,把集合中的临时数据 持久化写入到硬盘中
        可以使用Properties集合中的方法load,把硬盘中保存的文件(键值对),读取到集合中使用

    属性列表中的每个键及其对应的值都是一个字符串。
        Properties集合是一个双列集合,key和value默认都是字符串
 */
public class PropertiesDemo01 {
    public static void main(String[] args) {
        show01();
    }

    private static void show01() {
        /*
            使用Properties集合存储数据,遍历取出数据
            Properties集合是一个双列集合,key和value默认都是字符串
            Properties集合有一些操作字符串的特有方法
                Object setProperty(String key, String value) 调用 Hashtable方法put 。
                String getProperty(String key) 通过key找到value值, 此方法相当于Map集合中的get(key)方法
                Set<String> stringPropertyNames() 返回此属性列表中的一组键，其中键及其对应的值为字符串，此方法相当于Map集合中的keySet()方法
         */

        // 创建Properties集合对象
        Properties prop = new Properties();
        prop.setProperty("赵丽颖", "168");
        prop.setProperty("迪丽热巴", "165");
        prop.setProperty("古力娜扎", "160");

        // 使用stringPropertyNames()把Properties集合中的键取出,存储到set集合中
        Set<String> set = prop.stringPropertyNames();
        System.out.println(set); // [赵丽颖, 迪丽热巴, 古力娜扎]

        // 遍历set集合,取出Properties集合的每一个键
        for (String key : set) {
            String value = prop.getProperty(key);  // 通过键找值
            System.out.println(key + "=" + value);
        }
    }
}
