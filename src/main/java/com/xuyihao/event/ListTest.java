package com.xuyihao.event;

import java.util.ArrayList;
import java.util.List;

/**
 * 测试JAVA List集合的各项功能
 *
 * Created by Xuyh at 2016/08/16 上午 10:04.
 */
public class ListTest {
    public static List<String> stringList = new ArrayList<String>();

    public static void testClear(){
        stringList.add("afgfawg");
        stringList.add("fsafasf");
        stringList.add("45684165841");
        stringList.add("34165415614");
        stringList.add("514514");
        stringList.add("a3145f14a");
        stringList.add("gsa1r51gv");
        stringList.add("5F145A41VF51");
        stringList.add("svg1sz1v3145vsz");
        stringList.add("514vs51vz1asew45v");
        String out = "";
        for (String s : stringList){
            out += ( "  " + s);
        }
        System.out.println(stringList.size());
        System.out.println(out);


        System.out.println("");
        stringList.clear();
        String out2 = "";
        for (String s2 : stringList){
            out2 += ( "  " + s2);
        }
        System.out.println(stringList.size());
        System.out.println(out2);
    }
}
