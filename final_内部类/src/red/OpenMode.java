package red;

import java.util.ArrayList;

public interface OpenMode {
    /*
    totalMoney              总金额为方便计算，已经转换为整数，单位为分。
    totalCount              红包个数
    ArrayList<Integer>      元素为各个红包的金额值，所有元素的值累和等于总金额
     */
    ArrayList<Integer> divide(int totalMoney, int totalCount);
}
