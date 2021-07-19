package com.company;

/**
 * @author huwen
 * @date 2021/3/10 14:56
 */
public class GetDay {
    public static void main(String[] args) {
        int dat[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        for (int i = 0; i < 12; i++) {
            System.out.println("打印A：" + (i + 1) + dat[i]);
            System.out.println("打印B" + dat[i]);

        }
    }


    public static void month1() {
        int day[] = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int j = 0; j < 12; j++) {
            System.out.println((j + 1) + "month" + day[j] + "day");
        }
    }

}