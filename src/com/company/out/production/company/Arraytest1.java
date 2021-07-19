package com.company.out.production.company;

/**
 * @author huwen
 * @date 2021/6/15 20:02
 */
public class Arraytest1 {
    public static void main(String[] agrs){
        /*
        十进制转换成二进制
        * */
      toBbin(61);
    }
    public static  void toBbin(int num){
        while (num>0)
        {
            System.out.print(num%2);
            num=num/2;
        }
    }
}

