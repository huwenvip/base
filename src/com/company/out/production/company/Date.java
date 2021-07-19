package com.company.out.production.company;

/**
 * @author huwen
 * @date 2021/6/10 16:18
 */



public class Date {
    public static void main(String []args){
        int []arr= {2018,2019,2020};
        

    }
    public String nextDate(int year, int month, int day){
        boolean flag = false;
        if (year < 2018 || year > 2020) {
            return ("年的值不在指定范围之内");
        } else if (month > 12 || month < 1) {
            return ("月的值不在指定范围之内");
        } else if (day > 31 || day < 1 ) {
            return ("日的值不在指定范围之内");
        }

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
                if (day == 31) {
                    day = 1;
                    month = month + 1;
                } else
                    day = day + 1;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (day == 30) {
                    day = 1;
                    month = month + 1;
                } else if(day==31)
                {
                    flag = true;
                }

                else
                    day = day + 1;
                break;
            case 12:
                if (day == 31) {
                    day = 1;
                    month = 1;
                    year = year + 1;
                } else  {
                    day = day + 1;
                }
                break;
            case 2: {
                if (((year % 4 == 0 && year % 100 != 0) || year % 400 == 0))
                {
                    // 闰年
                    if (day == 29)
                    {
                        day = 1;
                        month = 3;
                    }else if (day < 29){
                        day = day + 1;
                    }else {
                        flag = true;    // day超过29
                    }
                }else{
                    //非闰年
                    if (day == 28)
                    {
                        day = 1;
                        month = 3;
                    }else if (day < 28){
                        day = day + 1;
                    }else {
                        flag = true;
                    }
                }

            }
            break;
            default:
        }

        if (year > 2050) {
            return ("年的值不在指定范围之内");
        } else if (flag) {
            return ("日的值不在指定范围之内");
        }else {
            return ("下一天是" + year + "年" + month + "月" + day + "日！");
        }


    }



}
