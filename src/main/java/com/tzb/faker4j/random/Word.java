package com.tzb.faker4j.random;

/**
 * <b>类说明：随机字母</b>
 * <p>
 * <b>详细描述：生成随机英文字母</b>
 *
 * @Author tanzibiao
 * @Date 2021-04-08 10:47:53
 **/
public class Word {

    /**
     * 大小写，长度随机
     * @Author tanzibiao
     * @Date 2021-04-08 11:20:29
     * @param 
     * @return java.lang.String
     **/
    public static String randomWord() {
        int length = 12 + (int) (Math.random() * 9);
        String word = "";
        for (int i = 0; i < length; i++) {
            word += (char) randomChar((int) (Math.random() * 2) == 1);
        }
        return word;
    }
    /**
     * 固定长度的随机字母
     * @Author tanzibiao
     * @Date 2021-04-08 11:09:29
     * @param length 字母长度
     * @return java.lang.String
     **/
    public static String randomWord(int length) {
        String word = "";
        for (int i = 0; i < length; i++) {
            word += (char) randomChar((int) (Math.random() * 2) == 1);
        }
        return word;
    }

    /**
     * 自定义长度，大小写
     * @Author tanzibiao
     * @Date 2021-04-08 11:15:27
     * @param length
     * @param isCapital
     * @return java.lang.String
     **/
    public static String randomWord(int length, boolean isCapital) {
        String word = "";
        for (int i = 0; i < length; i++) {
            word += (char) randomChar(isCapital);
        }
        return word;
    }

    public static String randomCapitalWord() {
        return randomWord(true);
    }

    public static String randomLowerWord() {
        return randomWord(false);
    }

    public static String randomWord(boolean isCapital) {
        int length = 12 + (int) (Math.random() * 9);
        String word = "";
        for (int i = 0; i < length; i++) {
            word += (char) randomChar(isCapital);
        }
        return word;
    }

    /**
     *
     * @Author tanzibiao
     * @Date 2021-04-08 11:13:24
     * @param flag true大写字母false小写字母
     * @return byte
     **/
    private static byte randomChar(boolean flag) {
        byte resultBt;
        byte bt = (byte) (Math.random() * 26);// 0 <= bt < 26
        if (flag) {
            resultBt = (byte) (97 + bt);
        } else {
            resultBt = (byte) (65 + bt);
        }
        return resultBt;
    }
}
