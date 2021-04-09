package com.tzb.faker4j.params;

/**
 * <b>类说明：</b>
 * <p>
 * <b>详细描述：</b>
 *
 * @Author tanzibiao
 * @Date 2021-04-08 17:14:16
 **/
public class BankInfo {

    private String bankName;
    private String bankNo;
    private String bankCode;

    public BankInfo(String bankName, String bankNo, String bankCode) {
        this.bankName = bankName;
        this.bankNo = bankNo;
        this.bankCode = bankCode;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankNo() {
        return bankNo;
    }

    public void setBankNo(String bankNo) {
        this.bankNo = bankNo;
    }
}
