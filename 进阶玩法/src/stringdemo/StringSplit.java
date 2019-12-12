package stringdemo;
/*
分割字符串的方法
public String[] split(String regex) : 按照参数规则，将字符串切分成为若干部分；

注意事项：
    split 方法的参数其实是一个 “正则表达式”， 如果按照英文句点“.”进行切分，必须写 “\\.” (两个反斜杠)
 */
public class StringSplit {
    public static void main(String[] args) {
        String str = "aaa,bbb,ccc";
        String[] str2Array = str.split(",");
        System.out.println(str2Array);   // [Ljava.lang.String;@1540e19d

        for (int i = 0; i < str2Array.length; i++) {
            System.out.println(str2Array[i]);  // aaa   bbb   ccc
        }

        String str2 = "XXX.YYY.ZZZ";
        String[] str3Array = str2.split(".");
        System.out.println(str3Array.length);  // 0
        for (int i = 0; i < str3Array.length; i++) {
            System.out.println(str3Array[i]);  // 显示不出来结果

        }
    }

}
