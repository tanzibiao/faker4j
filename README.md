# faker4j
java测试数据构造

详细用法可以查看Test.java测试类

例如：


        
        //该银行信息可以通过校验，生成时需要联网并能访问阿里的api
        BankInfo bankInfo = Faker.bank().bankInfo();
        //卡号
        bankInfo.getBankNo();
        //银行编码
        bankInfo.getBankCode();
        //银行名称
        bankInfo.getBankName();
