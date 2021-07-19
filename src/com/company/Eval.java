package com.company;

import java.util.Date;

/**
 * @author huwen
 * @date 2021/1/12 16:11
 */
public class Eval {
    public  static void main(String [] args){
        Date dae = new Date();
        String year =String.format("%tY",dae);
        String month =String.format("%tB",dae);
        String day = String.format("%tj",dae);
        System.out.println("今年是："+year);
        System.out.println("当月是:"+month);
        System.out.println("现在是多少："+day+"号");
    }
}
