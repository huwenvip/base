package com.company;

import java.util.Date;

/**
 * @author huwen
 * @date 2021/1/12 16:25
 */
public class GetDate {
    public static void main(String[] args){
        Date date = new Date();
        String hour =String.format("%tH",date);
        String minute =String.format("%tM",date);
        String second =String.format("%tS",date);
        System.out.println("现在的时间:"+date);
        System.out.println("现在的时间："+hour+"时"+minute+"分"+second+"秒");
        String time =String.format("%tD",date);
        String form =String.format("%tR",date);
        System.out.println(time+"" +
                "&&"+form);
        //类型转换
        String s1 = String.format("%d",400/2);
        String s2 = String.format("%b",5>1);
        String s3 = String.format("%x",255);
        System.out.println(s1+"\n"+s2+"\n"+s3);
    }
}

