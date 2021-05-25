package com.tzb.faker4j.random;

import com.tzb.faker4j.Faker;

import java.math.BigDecimal;

/**
 * <b>类说明：数字，金额</b>
 * <p>
 * <b>详细描述：</b>
 *
 * @Author tanzibiao
 * @Date 2021-04-08 16:14:58
 **/
public class Num {
    private static final Integer[] singleNum = new Integer[] {0,1,2,3,4,5,6,7,8,9};
    /**
     * 数
     * @Author tanzibiao
     * @Date 2021-04-08 16:15:34
     * @param start 开始数
     * @param end 结束数
     * @return int
     **/
    public int num(int start,int end) {
        return (int)(Math.random()*(end-start+1)+start);
    }

    /**
     * 获取对应长度的数字（返回{@link String}可获取到0000）
     * @Author tanzibiao
     * @Date 2021-04-08 16:24:36
     * @param length
     * @return java.lang.String
     **/
    public String num(int length) {
        if (length < 1) {
            return null;
        }
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < length; i++) {
            buffer.append(Faker.randomList(singleNum));
        }
        return buffer.toString();
    }

    /**
     * 4位数，两位小数的金额
     * @Author tanzibiao
     * @Date 2021-04-08 16:32:47
     * @param 
     * @return java.math.BigDecimal
     **/
    public BigDecimal amount() {
        return amount(4,2);
    }

    /**
     * 金额
     * @Author tanzibiao
     * @Date 2021-04-08 16:32:55
     * @param l 长度
     * @param s 小数位长度
     * @return java.math.BigDecimal
     **/
    public BigDecimal amount(int l,int s) {
        StringBuffer buffer = new StringBuffer();
        buffer.append(num(l)).append(".").append(num(s));
        return new BigDecimal(buffer.toString()).setScale(s);
    }

}
