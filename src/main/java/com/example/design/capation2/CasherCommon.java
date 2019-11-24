package com.example.design.capation2;

/**
 * @ClassName : design
 * @Description : 正常的收费
 * @Author : ChenKun
 * @Date : 2019-11-24 14:48
 */
public class CasherCommon extends BaseCasher {

    /**
     * 重写正常的收费方法
     *
     * @param money 结算的金额
     * @return 返回收费的结果
     */
    @Override
    Double getMoney(Double money) {
        return money;
    }
}