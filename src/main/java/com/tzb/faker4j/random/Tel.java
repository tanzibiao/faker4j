package com.tzb.faker4j.random;

import com.tzb.faker4j.Faker;

/**
 * <b>类说明：联系方式</b>
 * <p>
 * <b>详细描述：手机号、座机号、邮箱</b>
 *
 * @Author tanzibiao
 * @Date 2021-04-08 16:10:37
 **/
public class Tel {
    private static Integer[] telFirst = new Integer[]{134,135,136,137,138,139,150,151,152,157,158,159,130,131,132,155,156,133,153,187,188,189};

    public String phone() {
        return Faker.randomList(telFirst) + Faker.num.num(8);
    }
}
