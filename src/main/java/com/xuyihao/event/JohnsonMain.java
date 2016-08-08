package com.xuyihao.event;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 测试自定义事件入口
 *
 * Created by Xuyh at 2016/08/05 下午 03:26.
 */
public class JohnsonMain {
    public static void main(String args[]){
        /*Date date = DateUtils.parseDate("2016-7-16");
        long date1 = DateUtils.parseDate("2016-7-18").getTime();
        long date2 = DateUtils.parseDate("2016-7-15").getTime();
        System.out.println(date1);
        System.out.println(date2);
        if(date1 > date2){
            System.out.println("true");
        }*/
        System.out.println(DateUtils.currentDate());
        System.out.println(DateUtils.currentDateTime());
        System.out.println(DateUtils.formatDate(DateUtils.getDateDayByDiff(DateUtils.parseDate(DateUtils.currentDate()), -1)));


        System.out.println("");

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        //获取前月的第一天
        Calendar   cal_1=Calendar.getInstance();//获取当前日期
        cal_1.add(Calendar.MONTH, 0);
        cal_1.set(Calendar.DAY_OF_MONTH,1);//设置为1号,当前日期既为本月第一天
        System.out.println(format.format(cal_1.getTime()));


    }
}
