package 通过对象名引用成员方法;

/*
    通过对象名引用成员方法
    使用前提:
        对象名已经存在
        成员方法也已经存在
 */
public class Demo {
    // 定义一个方法,方法的参数传递Printable接口
    public static void printString(Printable str) {
        str.print("hello world");
    }

    public static void main(String[] args) {
        // Printable是一个函数式接口,所以可以传递 Lambda 表达式
//         创建 MethodRerObject对象,调用成员方法printUpperCaseString,把字符串按照大写输出
        printString(str -> new MethodRerObject().printUpperCaseString(str));

        /*
            使用方法引用优化 Lambda
            对象是已经存在的 MethodRerObject
            成员方法是已经存在的 printUpperCaseString
         */
        MethodRerObject obj = new MethodRerObject();
        printString(obj::printUpperCaseString);
    }
}
