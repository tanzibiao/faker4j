package com.tzb.faker4j.orderly;

import com.tzb.faker4j.params.RefInt;

/**
 * <b>类说明：有序序列号</b>
 * <p>
 * <b>详细描述：通过传入引用，返回有序的序列号</b>
 *
 * @Author tanzibiao
 * @Date 2021-04-08 10:39:45
 **/
public class SeqOrderly {

    public static String seqNo(String prefix, RefInt index, int length, String suffix) {
        if (index == null)
            return null;
        return prefix + seqNo(index, length) + suffix;
    }

    public static String seqNo(String prefix, RefInt index, int length) {
        if (index == null)
            return null;
        return prefix + seqNo(index, length);
    }

    /**
     * 序列号
     *
     * @param index  开始数字Integer的引用
     * @param length 序列号长度
     * @return java.lang.String
     * <br/>
     * Integer index = 0;
     * <br/>
     * seqNo(index, 4);
     * <br/>
     * 返回
     * 00001
     * 第二次调用返回0002
     * @Author tanzibiao
     * @Date 2021-03-26 15:22:03
     **/
    public static String seqNo(RefInt index, int length) {
        if (index == null)
            return null;
        //取引用
        index.setNumber(index.getNumber()+1);
        if (length < 1) {
            return index.toString();
        }
        String format = "%0" + length + "d";
        return String.format(format, index.getNumber());
    }
}
