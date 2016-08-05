package com.xuyihao.event;

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
    }
}
