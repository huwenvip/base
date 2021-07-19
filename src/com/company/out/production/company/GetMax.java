package com.company.out.production.company;

/**
 * @author Hu Wen
 * @version 1.0
 * @date 2021/7/19 22:32
 */
public class GetMax {
    //求数组int [] arr ={1,2,33,44,55,66}的最大值
    /*
    * 1、两两比较的思路来做
    * 2、初始化一个int max =arr[0]
    * 3、for 循环遍历数组中值
    * 4、if判断遍历的值与初始化的值比较
    * 5、比较的结果返回
    *
    *
    *
    * */

public static int GetMax(int []arr){
    int max= arr[0];
    for(int x=1;x<arr.length;x++){
        if(arr[x] > max){
            max=arr[x];
        }
    }
    return  max;
}

public static int Getmin(int [] arrmin){
    int min =arrmin[0];
    for(int y=1;y<arrmin.length;y++){
        if(arrmin[y]<min){
            min =arrmin[y];
        }
    }
    return  min;
}


public static void main(String [] args){
    int [] arr ={1,2,33,44,55,66};
    int max =GetMax(arr);  //调用getmax方法
    System.out.println(max);
    int [] arrmin={111,11212,1212,1,221,21,212};
    int min =Getmin(arrmin);//调用getmin
    System.out.println(min);
}


}
