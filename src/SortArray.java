import java.util.Arrays;

/**
 * @author Hu Wen
 * @version 1.0
 * @date 2021/7/20 23:21
 */
public class SortArray {
    /*
    1、数组排序，给定数组int []arr={1,99,323,3,0}
    2、选择排序，固定arr[0],逐个比较数组中的元素
    3、使用临时变量记录出最大的值，在将比较结果换位置



     */
public static void sortarray(int []arr){
    for(int x=0;x<arr.length;x++){//外层循环控制次数
        for(int y=x+1;y<arr.length;y++){//内层循环进行比较
            if(arr[x]>arr[y]){
                int temp= arr[x];//声明中间变量，存储比较的结果
                arr[x]=arr[y];
                arr[y]=temp;
            }
        }

    }
}
public static void bubblesort(int arrp[]){//冒泡排序,.相邻的2个数进行比较

    for (int x=0;x<arrp.length-1;x++){
        for(int y=0;y<arrp.length-x-1;y++){
            if (arrp[y]>arrp[y+1]){
                int temp =arrp[y];
                arrp[y]=arrp[y+1];
                arrp[y+1]=temp;
            }
        }
    }


}


public static void printarr(int []arr){   //打印数组的方法
        System.out.print("[");
    for(int x=0;x<arr.length;x++){
        if(x!=arr.length-1){
            System.out.print(arr[x]+",");
        }else{
            System.out.print(arr[x]+"]");//数组尾项不输出“,”
        }
    }

}

public static void main(String []args){
    int [] arr={1,99,323,3,0};
    int [] arr1={2,3,444,1,5};
    sortarray(arr);//数组排序

    printarr(arr);//调用打印数组
    bubblesort(arr1);
    printarr(arr1);
    Arrays.sort(arr1);//引用java自带的排序
    printarr(arr1);
}
}
