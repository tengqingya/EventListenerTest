package com.xuyihao.event;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

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

        /*
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
        */

        /*
        String path = System.getProperty("user.dir") + File.separator;
        System.out.println(path);
        String path2 = System.getProperty("user.dir") + File.pathSeparator;
        System.out.println(path2);

        System.out.println(File.separator);
        System.out.println(File.pathSeparator);
        */

        /*
        File file = new File(path+"iuafojhuofhafciuvaheniuav.txt");
        if (!file.exists()){
            try {
                file.createNewFile();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        */
        /*
        List<String> containedFilePathName = new ArrayList<String>();
        List<String> containedFileName = new ArrayList<String>();
        for(int i = 1; i <= 6; i++){
            containedFileName.add(i+".xlsx");
            containedFilePathName.add(path + i + ".xlsx");
        }
        generateZipPackage(path+"new.zip", "new.zip", containedFilePathName, containedFileName);
        */

        /*
        Date date1 = DateUtils.parseDateTime(DateUtils.currentDateTime());
        try{
            Thread.sleep(5000);
        }catch (Exception e){
            e.printStackTrace();
        }
        Date date2 = DateUtils.parseDateTime(DateUtils.currentDateTime());

        long j = date1.getTime() - date2.getTime();

        System.out.println(j);
        */

        /*
        MapKeyTest test = new MapKeyTest();
        test.initMap();
        test.testIfKeyWorks();
        */

        //ListTest.testClear();

        //System.out.println(RandomUtils.getRandomString(15));



        List<String> stringList = convertStringToArrayList("aa   , aa   aakkbhgdcf , aa bbbnajhdcb    ]");
        for(String s : stringList) {
            System.out.println(s);
        }

        //testSplitString();
    }

    private static List<String> convertStringToArrayList(String value) {
        if (value.charAt(0) == '['){
            value = value.substring(1);
        }
        if (value.charAt(value.length()-1) == ']'){
            value = value.substring(0, value.length()-1);
        }
        String[] values = value.split(",");
        List<String> valueList = new ArrayList<String>();
        for (int i = 0; i < values.length; i++) {
            valueList.add(values[i].trim());
        }
        return valueList;
    }

    public static void testSplitString(){
        String s = "[ a d a af, faf a,  feaf  , fafc,  ,]";

        System.out.println(s.charAt(s.length()-1));
    }

    public static String getCurrentTime() {
        java.util.Date dt = new java.util.Date();
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyyMMddHHmm");
        String currentTime = sdf.format(dt);
        return currentTime;
    }

    public static boolean generateZipPackage(String zipFilePathName, String zipFileName, List<String> containedFilePathName, List<String> containedFileName) {
        boolean flag = false;
        try {
            byte[] bytes = new byte[1024];
            ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream(zipFilePathName));
            for (int i = 0; i < containedFilePathName.size(); i++) {
                File file = new File(containedFilePathName.get(i));
                FileInputStream fileInputStream = new FileInputStream(file);
                zipOutputStream.putNextEntry(new ZipEntry(containedFileName.get(i)));
                int length = 0;
                while ((length = fileInputStream.read(bytes)) != -1) {
                    zipOutputStream.write(bytes, 0, length);
                }
                zipOutputStream.closeEntry();
                fileInputStream.close();
            }
            zipOutputStream.close();
            System.out.println("ZIP file generated successfully!");
            flag = true;
        } catch (Exception e) {
            e.printStackTrace();
            flag = false;
        }
        return flag;
    }

}
