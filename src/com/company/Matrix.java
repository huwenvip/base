/**
 * @author huwen
 * @date 2021/3/10 15:37
 */
public class Matrix {
    public static void main(String[] args){
        int a[][] =new int[][]{{1},{2,3},{4,5,6}};
        for(int i = 0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.println(a[i][j]);
            }
            System.out.println();
        }
    }
}

