package com.xuyihao.event;

import java.security.SecureRandom;

/**
 * Created by Xuyh at 2016/08/17 下午 02:30.
 */
public class RandomUtils {
    private static SecureRandom random = new SecureRandom();

    /**
     * 利用SecureRandom生成随机字串
     *
     * @param length
     * @return
     */
    public static String getRandomString(int length){
        String base = "0123456789abcdefghijklmnopqrstuvwxyz";
        StringBuffer stringBuffer = new StringBuffer();
        for(int i = 0; i < length; i++){
            int number = random.nextInt(base.length());
            stringBuffer.append(base.charAt(number));
        }
        return stringBuffer.toString();
    }
}
