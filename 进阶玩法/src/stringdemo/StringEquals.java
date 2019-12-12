package stringdemo;
/*
 == 是进行对象的地址值比较，如果确实需要字符串的内容比较，可以使用两个方法：
    1. public boolean equals(Object obj): 参数可以是任何对象，只有参数是一个字符串并且内容相同的才会给 true，否则返回 false
PS：任何对象都能用 Object 进行接收
    2. public boolean equalsIgnoreCase(String str) : 忽略大小写，进行内容比较
*** 注意事项：
        1.任何对象都能用 Object 进行接收.
        2.equals 方法具有对成性， a.equals(b)  和 b.equals(a) 一样
        3.如果比较双方一个常量一个变量， 推荐把常量字符串写在前面
        推荐： "abc".equals(str)
 */
public class StringEquals {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        char[] charArray = {'H', 'e', 'l', 'l', 'o'};
        String str4 = "hello";
        String str3 = new String(charArray);

        // 内容比较
        System.out.println(str1.equals(str2));  //true
        System.out.println(str1.equals(str3));  //true
        System.out.println(str2.equals(str3));  //true
        System.out.println(str3.equals("Hello"));  //true
        System.out.println("Hello".equals(str2));  //true

        System.out.println(str1.equalsIgnoreCase(str4)); // true  忽略大小写
    }
}
