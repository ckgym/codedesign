package com.example.design.capation2;

/**
 * @ClassName : design
 * @Description : 收费基础类
 * @Author : ChenKun
 * @Date : 2019-11-24 14:38
 */
public abstract class BaseCasher {

    /**
     * 抽象类中
     *
     * @param money 结算的金额
     * @return 返回结算后的金额
     */
    abstract Double getMoney(Double money);
}