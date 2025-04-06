package com.tzb.faker4j.company;

import java.util.Random;

public class CompanyDataGenerator {

    // 统一社会信用代码校验字符
    private static final char[] CHAR_TABLE = {
            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
            'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'J', 'K',
            'L', 'M', 'N', 'P', 'Q', 'R', 'T', 'U', 'W', 'X', 'Y'
    };
    private static final int[] WEIGHTS = {1, 3, 9, 27, 19, 26, 16, 17, 20, 29, 25, 13, 8, 24, 10, 30, 28};

    private static final String[] suffix = {"责任有限公司", "有限公司", "股份有限公司", "科技有限公司", "信息技术有限公司", "实业有限公司", "集团有限公司"};
    private static final String[] mid = {"科技", "信息", "实业", "网络", "贸易", "金融", "医药", "环保", "能源", "智能", "通信", "软件", "电子", "自动化", "云计算"};
    private static final String[] prefix1 = {"华", "中", "九", "宏", "远", "启", "新", "光", "东", "西", "南", "北", "天", "海", "盛", "恒"};
    private static final String[] prefix2 = {"夏", "通", "州", "达", "航", "明", "纪", "速", "龙", "峰", "瑞", "昌", "耀", "创", "宏", "科"};
    private static final String[] prefix3 = {"伟","刚","勇","毅","俊","峰","强","军","平","保","东","文","辉","力","明","永","健","世","广","志","义","兴","良","海","山","仁","波","宁","贵","福","生","龙","元","全","国","胜","学","祥","才","发","武","新","利","清","飞","彬","富","顺","信","子","杰","涛","昌","成","康","星","光","天","达","安","岩","中","茂","进","林","有","坚","和","彪","博","诚","先","敬","震","振","壮","会","思","群","豪","心","邦","承","乐","绍","功","松","善","厚","庆","磊","民","友","裕","河","哲","江","超","浩","亮","政","谦","亨","奇","固","之","轮","翰","朗","伯","宏","言","若","鸣","朋","斌","梁","栋","维","启","克","伦","翔","旭","鹏","泽","晨","辰","士","以","建","家","致","树","炎","德","行","时","泰","盛","雄","琛","钧","冠","策","腾","楠","榕","风","航","弘"};

    private static Random random = new Random();

    public static void main(String[] args) {
        Company company = generateCompany();
        System.out.println("公司名称: " + company.name);
        System.out.println("信用代码: " + company.creditCode);
    }

    public static Company generateCompany() {
        String name = generateCompanyName();
        String creditCode = generateCreditCode();
        return new Company(name, creditCode);
    }

    private static String generateCompanyName() {
        String name = prefix1[random.nextInt(prefix1.length)] +
                prefix2[random.nextInt(prefix2.length)] +
                prefix3[random.nextInt(prefix3.length)] +
                mid[random.nextInt(mid.length)] +
                suffix[random.nextInt(suffix.length)];

        return name;
    }


    private static String generateCreditCode() {
        // 1-2位: 登记管理部门代码（如：91）
        // 3-8位: 组织机构代码前6位（随机）
        // 9-17位: 组织机构代码后9位（随机）
        // 18位: 校验码
        StringBuilder code = new StringBuilder();
        code.append("91"); // 工商部门代码

        for (int i = 0; i < 15; i++) {
            code.append(CHAR_TABLE[random.nextInt(CHAR_TABLE.length)]);
        }

        char checkCode = calcCheckCode(code.toString());
        code.append(checkCode);
        return code.toString();
    }

    private static char calcCheckCode(String code17) {
        int sum = 0;
        for (int i = 0; i < 17; i++) {
            int codeIndex = indexOfChar(code17.charAt(i));
            sum += codeIndex * WEIGHTS[i];
        }
        int logicCheckCode = (31 - (sum % 31)) % 31;
        return CHAR_TABLE[logicCheckCode];
    }

    private static int indexOfChar(char c) {
        for (int i = 0; i < CHAR_TABLE.length; i++) {
            if (CHAR_TABLE[i] == c) return i;
        }
        return -1;
    }

    public static class Company {
        public String name;
        public String creditCode;

        public Company(String name, String creditCode) {
            this.name = name;
            this.creditCode = creditCode;
        }
    }
}
