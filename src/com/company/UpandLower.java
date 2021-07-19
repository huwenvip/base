package com.company;

/**
 * @author huwen
 * @date 2021/1/12 15:26
 */
public class UpandLower {
    public static void main(String args[]){
        String  str = new String("huwen HUWEN");  //待转换的字符串
        String  newstr = str.toLowerCase(); //转换小写
        String newstr2 =str.toUpperCase();  //转换大写
        System.out.println(newstr);
        System.out.println(newstr2);
    }
}
