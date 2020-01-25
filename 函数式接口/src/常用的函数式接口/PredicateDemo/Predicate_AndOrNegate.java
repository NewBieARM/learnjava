package 常用的函数式接口.PredicateDemo;

import java.util.function.Predicate;

/*
    Predicate接口中有一个方法and,表示并且关系,也可以用于连接两个判断条件
    default Predicate<T> and,or,negate(Predicate<? super T> other) {
        Object.requireNonNull(other);
        return (t) -> this.test(t) && other.test(t);
        return (t) -> this.test(t) || other.test(t);

    negate:
        default Predicate<T> negate() {
            return (t) -> !test(t);
        }
    }
 */
public class Predicate_AndOrNegate {
    public static boolean checkString(String s, Predicate<String> pre1, Predicate<String> pre2){
    /*
        定义一个方法,方法的参数,传递一个字符串
        传递两个Predicate接口
            一个用于判断字符串的长度是否大于5
            一个用于判断字符串中是否包含a

        and:两个条件都得满足
        or:满足一个条件即可
        negate: 取反


     */
//        return pre1.test(s) && pre2.test(s);   // 原理
        return pre1.and(pre2).test(s);
    }

    public static void main(String[] args) {
        String s = "abcdefg";

//        boolean b = checkString(s, (String str) -> {
//            return str.length() > 5;
//        }, (String st) -> {
//            return st.contains("a");
//        });

        // 简化
        boolean b = checkString(s, str -> str.length() > 5, str -> str.contains("a"));

        System.out.println(b);
    }
}
