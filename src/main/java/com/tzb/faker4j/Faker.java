package com.tzb.faker4j;

import com.tzb.faker4j.company.CompanyDataGenerator;
import com.tzb.faker4j.orderly.SeqOrderly;
import com.tzb.faker4j.random.*;

import java.util.Random;

/**
 * <b>类说明：</b>
 * <p>
 * <b>详细描述：</b>
 *
 * @Author tanzibiao
 * @Date 2021-03-26 14:38:51
 **/
public class Faker {
    public static final Random random = new Random();

    /**
     * 获取有序序列号
     * @Author tanzibiao
     * @Date 2021-04-08 10:44:27
     * @param 
     * @return com.tzb.faker4j.orderly.SeqOrderly
     **/
    public static final SeqOrderly seqOrderly = new SeqOrderly();

    /**
     * 文件路径、后缀信息
     * @Author tanzibiao
     * @Date 2021-04-09 14:46:09
     * @param 
     * @return com.tzb.faker4j.random.File
     **/
    public static final File file= new File();

    public static final Word word = new Word();
    

    public static final Addr addr  = new Addr();

    public static final Num num  = new Num();

    public static final Personal personal  = new Personal();

    public static final Tel tel  = new Tel();

    public static final Car car  = new Car();

    public static final Bank bank  = new Bank();

    public static final CompanyDataGenerator.Company company  = CompanyDataGenerator.generateCompany();


    /**
     * 随机返回数组中的元素
     *
     * @param arr 随机集合
     * @return T
     * <br/>如["上面","下面","中"]随机返回一个
     * @Author tanzibiao
     * @Date 2021-03-26 15:03:15
     **/
    public static final <T> T randomList(T[] arr) {
        if (arr == null || arr.length < 1) {
            return null;
        }
        return arr[random.nextInt(arr.length)];
    }
}
