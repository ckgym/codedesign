package com.example.design.capation1;

import lombok.Data;
import org.omg.CORBA.INTERNAL;

/**
 * @ClassName : design
 * @Description : 运算基础类
 * @Author : ChenKun
 * @Date : 2019-11-24 11:44
 */
public class BaseOption {
    //定义运算变量
    protected Integer param1;

    protected Integer param2;

    protected String symble;

    //定义一个预算虚函数
    protected Integer getResult() {
        Integer result = 0;
        return result;
    }

    public Integer getParam1() {
        return param1;
    }

    public void setParam1(Integer param1) {
        this.param1 = param1;
    }

    public Integer getParam2() {
        return param2;
    }

    public void setParam2(Integer param2) {
        this.param2 = param2;
    }

    public String getSymble() {
        return symble;
    }

    public void setSymble(String symble) {
        this.symble = symble;
    }
}