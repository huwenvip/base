package com.company;

/**
 * @author huwen
 * @date 2021/1/12 17:05
 */
public class Judge {
    public static void main(String[] args){
        //定义要匹配的正则
        String regex ="[^@ \\t\\r\\n]+@[^@ \\t\\r\\n]+\\.[^@ \\t\\r\\n]+";
        String re = "[A-Z&A-Z&A-Z&A-Z]";
        String s1 = "aaa#";
        String s2 = "wwwwww@wcc";
        String s3 ="122222@163.com";
        String s4 = "W";
        if(s1.matches(regex)){
            System.out.println("s1是合法的邮箱"+s1);
        }
        if(s2.matches(regex)){
            System.out.println("s2是合法的邮箱"+s2);
        }
        if(s3.matches(regex)){
            System.out.println("S3是合法的邮箱"+s3);
        }
        if(s4.matches(regex)){
            System.out.println("s4匹配："+s4);
        }
    }
}
