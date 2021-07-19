package com.company;

/**
 * @author huwen
 * @date 2021/1/8 9:27
 */
public class Learnbase {
    public static void main(String args[]){
        String name = "     hai  ziR    ";
        char mychar = name.charAt(1);
        System.out.println("字符串5的位置是： "+mychar);
        String substr =name.substring(1,3);
        System.out.println("输出截取 ："+substr);
        System.out.println("输出字符串的长度："+name.length());
        System.out.println("输出清除空格后的长度："+name.trim().length());
        String name_a =name.substring(4,6);
        System.out.println(name_a);
        String name_b =name.replace("h","GGGG");//替换字符串
        System.out.println(name_b);
        String num1 ="111111112222";
        String num2 ="2222223333";
        boolean b= num1.startsWith("11");
        boolean c= num2.endsWith("33");
        System.out.println(b);
        System.out.println(c);
        boolean d=(num1==num2);//判断2个字串进行比较
        System.out.println(d);
    }
}
