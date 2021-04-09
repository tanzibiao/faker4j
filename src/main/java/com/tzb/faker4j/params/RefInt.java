package com.tzb.faker4j.params;

/**
 * <b>类说明：引用包装类</b>
 * <p>
 * <b>详细描述：将特殊基础类包装，达到传递引用的目的</b>
 *
 * @Author tanzibiao
 * @Date 2021-03-26 18:54:44
 **/
public class RefInt {
    private Integer number;

    public RefInt(Integer num) {
        this.number = num;
    }
    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String toString() {
        return this.number.toString();
    }
}
