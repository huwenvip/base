import java.util.Arrays;

/**
 * @author huwen
 * @date 2021/4/15 9:11
 */
public class Repeat {
    public static void main(String[] args){
        int arr[] =new int[]{01,7,3,04,5,6};
        int newarr[]= Arrays.copyOfRange(arr,0,4);
        Arrays.sort(arr);
        int index =Arrays.binarySearch(arr,0,3,5);
        for(int i=0;i<newarr.length;i++){
            System.out.println(arr[i]);
            System.out.println(index);
        }
    }
}
