package com.example.design.capation1;

/**
 * @ClassName : design
 * @Description : 加法运算
 * @Author : ChenKun
 * @Date : 2019-11-24 11:48
 */
public class OptionAdd extends BaseOption {

    /**
     * 重写基础方法中的运算
     *
     * @return
     */
    @Override
    public Integer getResult() {
        Integer result = super.param1 + super.param2;
        return result;
    }

    public Integer getParam1() {
        return super.param1;
    }

    public void setParam1(Integer a) {
        super.param1 = a;
    }

    public Integer getParam2() {
        return super.param2;
    }

    public void setParam2(Integer a) {
        super.param2 = a;
    }

    public String getSymble() {
        return super.symble;
    }

    public void setSymble(String a) {
        super.symble = a;
    }
}