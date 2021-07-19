package com.company.out.production.company;

/**
 * @author huwen
 * @date 2021/6/10 16:19
 */

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

/**
 * @author 作者 Hu Wen:
 * @version 创建时间：2021年6月10日 下午4:10:41
 * <p>
 * 类说明
 */


@RunWith(Parameterized.class)
public class DateTestBoundary {
    private int input1;
    private int input2;
    private int input3;
    private String expected;

    @Parameterized.Parameters
    @SuppressWarnings("unchecked")
    public static Collection prepareData(){
        Object [][] object = {

                //年
                {1889, 7, 10, "年的值不在指定范围之内"},
                {1900, 7, 10, "下一天是1900年7月11日！"},
                {1901, 7, 10, "下一天是1901年7月11日！"},
                {2049, 7, 10, "下一天是2049年7月11日！"},
                {2050, 7, 10, "下一天是2050年7月11日！"},
                {2051, 7, 10, "年的值不在指定范围之内"},
                //月
                {2019, 0, 10, "月的值不在指定范围之内"},
                {2019, 1, 10, "下一天是2019年1月11日！"},
                {2019, 2, 10, "下一天是2019年2月11日！"},
                {2019, 11, 10, "下一天是2019年11月11日！"},
                {2019, 12, 10, "下一天是2019年12月11日！"},
                {2019, 13, 10, "月的值不在指定范围之内"},
                //日
                {2019, 2, 27, "下一天是2019年2月28日！"},
                {2019, 2, 28, "下一天是2019年3月1日！"},
                {2019, 2, 29, "日的值不在指定范围之内"},
                {2020, 2, 28, "下一天是2020年2月29日！"},
                {2020, 2, 29, "下一天是2020年3月1日！"},
                {2020, 2, 30, "日的值不在指定范围之内"},

                {2019, 1, 30, "下一天是2019年1月31日！"},
                {2019, 1, 31, "下一天是2019年2月1日！"},
                {2019, 1, 32, "日的值不在指定范围之内"},
                {2019, 4, 30, "下一天是2019年5月1日！"},
                {2019, 4, 31, "日的值不在指定范围之内"},
                {2019, 4, 32, "日的值不在指定范围之内"},



        };
        return Arrays.asList(object);
    }
    public DateTestBoundary(int input1,int input2,int input3,String expected){
        this.input1 = input1;
        this.input2 = input2;
        this.input3 = input3;
        this.expected = expected;

    }
    @Test
    public void testDate(){
        Date date = new Date();
        String result = date.nextDate(input1,input2,input3);
        Assert.assertEquals(expected,result);
    }
}