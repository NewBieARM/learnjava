package practice;

import java.util.ArrayList;
import java.util.stream.Stream;

/*
    练习:集合元素处理(Stream流方法)
        现在有两个 ArrayList 集合存储队伍当中多个成员的姓名,要求使用for循环依次进行一下若干操作步骤:
            1.第一个队伍只要名字为3个字的成员姓名;存储到一个新集合中
            2.第一个队伍筛选之后只要前三个人;存储到一个新集合中
            3.第二个队伍只要姓张的成员,存储到一个新集合中
            4.第二个队伍筛选之后不要前两个人;存储到一个新集合中
            5.将两个队伍合并为一个队伍;存储到一个新集合中
            6.根据姓名创建Person对象;存储到一个集合中
            7.打印整个队伍的Person对象信息
 */
public class PracticeStream {
    public static void main(String[] args) {
        ArrayList<String> one = new ArrayList<>();
        one.add("迪丽热巴");
        one.add("宋远桥");
        one.add("苏星河");
        one.add("石破天");
        one.add("石中玉");
        one.add("老子");
        one.add("庄子");
        one.add("洪七公");

        //1.第一个队伍只要名字为3个字的成员姓名;存储到一个新集合中
        //2.第一个队伍筛选之后只要前三个人;存储到一个新集合中
        Stream<String> streamOne = one.stream();
        Stream<String> resultOne = streamOne.filter(name -> name.length() == 3).limit(3);

        ArrayList<String> two = new ArrayList<>();
        two.add("古力娜扎");
        two.add("张无忌");
        two.add("赵丽颖");
        two.add("张三丰");
        two.add("尼古拉斯凯奇");
        two.add("张天爱");
        two.add("张二狗");

        //3.第二个队伍只要姓张的成员,存储到一个新集合中
        //4.第二个队伍筛选之后不要前两个人;存储到一个新集合中
        Stream<String> streamTwo = two.stream();
        Stream<String> resultTwo = streamTwo.filter(name -> name.startsWith("张")).skip(2);

        //5.将两个队伍合并为一个队伍;存储到一个新集合中
//        Stream<String> all = Stream.concat(resultOne, resultTwo);
//        //6.根据姓名创建Person对象;存储到一个集合中
//        Stream<Person> personStream = all.map(name -> new Person(name));
//        //7.打印整个队伍的Person对象信息
//        personStream.forEach(name -> System.out.println(name));

        // 5, 6, 7写成一行
        Stream.concat(resultOne, resultTwo).map(name -> new Person(name)).forEach(name -> System.out.println(name));


    }
}
