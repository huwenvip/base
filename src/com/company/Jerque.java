/**
 * @author huwen
 * @date 2021/3/10 14:05
 */
public class Jerque {
    public static  void main(String []args){
        String str = "";
        //创建空字符串
        long starTime =System.currentTimeMillis();
        for(int i=0;i<=1000;i++) {
            str = str + i;
        }
        long endTime =System.currentTimeMillis();
        long time =endTime -starTime;
        System.out.println("String消耗的时间："+time);
        StringBuilder builder =new StringBuilder("");
        starTime =System.currentTimeMillis();
        for(int j=0;j<=1000;j++){
            builder.append(j);
        }
        endTime =System.currentTimeMillis();
        time =endTime -starTime;
        System.out.println("StringBuilder消耗时间"+time);
        StringBuilder bf =new StringBuilder("12345678910");
        bf.insert(10,"kbcde78946");
        System.out.println(bf.toString());
        bf.delete(2,4);
        System.out.println(bf.toString());
        bf.insert(10,1234567890);
        System.out.println(bf.toString());
    }

}
