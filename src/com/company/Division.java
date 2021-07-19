package com.company;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * @author huwen
 * @date 2021/1/12 15:33
 */
class Division {
    public static void main(String[] args) {
        //创建字符串
        String str = "192.188.22.21";
        String[] firstArray = str.split("\\.");
        String[] secondArray = str.split("\\.", 2);
        System.out.println("str的原值:["+str+"]");
        // 输出分割后的
        System.out.println("全部的结果：");
        for(String a:firstArray){
            System.out.println("["+a+"]");
        }
        System.out.println("分割2次的结果：");
        for(String a:secondArray){
            System.out.println("["+a+"]");
        }
        System.out.println();
    }
}


