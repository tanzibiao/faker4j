# faker4j
java测试数据构造

maven使用：

        <!-- https://mvnrepository.com/artifact/io.github.tanzibiao/faker4j -->
        <dependency>
            <groupId>io.github.tanzibiao</groupId>
            <artifactId>faker4j</artifactId>
            <version>1.0.0</version>
        </dependency>


详细用法可以查看Test.java测试类

例如：


        
        //该银行信息可以通过校验
        BankInfo bankInfo = Faker.bank().bankInfo();
        //卡号
        bankInfo.getBankNo();
        //银行编码
        bankInfo.getBankCode();
        //银行名称
        bankInfo.getBankName();
