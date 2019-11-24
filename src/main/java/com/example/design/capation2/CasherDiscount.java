package com.example.design.capation2;

/**
 * @ClassName : design
 * @Description : 计算打折的方法
 * @Author : ChenKun
 * @Date : 2019-11-24 14:50
 */
public class CasherDiscount extends BaseCasher {

    /**
     * 定义打折的折扣
     */
    private double discount;

    /**
     * 定义打折的构造方法
     *
     * @param discount 打的折扣
     */
    public CasherDiscount(double discount) {
        this.discount = discount;
    }

    /**
     * 计算打折后的金额
     *
     * @param money 结算的金额
     * @return
     */
    @Override
    Double getMoney(Double money) {
        //计算打折后的金额
        Double discountMoney = money * discount;
        return discountMoney;
    }
}