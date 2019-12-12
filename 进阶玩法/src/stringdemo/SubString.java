package stringdemo;
/*
public class substring(int index) : 截取从参数位置一直到字符串末尾，返回新字符串
public class substring(int begin, int end) : 截取从 begin 开始，一直到end
PS: 左闭右开区间 [begin, end)
 */
public class SubString {
    public static void main(String[] args) {
        String str1 = "HelloWorld";
        String str2 = str1.substring(5);
        System.out.println(str2);  // World

        String str3 = str1.substring(4, 7);   // 选取 oWo
        System.out.println(str3);
    }
}
