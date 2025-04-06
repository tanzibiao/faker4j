package com.tzb.faker4j.params;

/**
 * <b>类说明：个人信息</b>
 * <p>
 * <b>详细描述：使用类，是因为性别，姓名，身份证号码可以对应</b>
 *
 * author tanzibiao
 * date 2021-04-08 14:08:44
 **/
public class PersonalInfo {

    private String name;
    private String idNo;
    private String sex;

    public PersonalInfo(String name, String idNo, String sex) {
        this.name = name;
        this.idNo = idNo;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
