package com.example.design.capation2;

/**
 * @ClassName : design
 * @Description : 计算满足一定金额进行优惠的功能
 * @Author : ChenKun
 * @Date : 2019-11-24 14:56
 */
public class CasherCondition  extends BaseCasher{
    /**
     * 满足条件
     */
    private Integer conditionMoney;

    /**
     * 返回的钱
     */
    private Integer returnMoney;

    /**
     * 构造方法
     * @param conditionMoney 符合返减的条件
     * @param returnMoney 返利金额
     */
    public CasherCondition(Integer conditionMoney, Integer returnMoney) {
        this.conditionMoney = conditionMoney;
        this.returnMoney = returnMoney;
    }

    /**
     * 计算满减后的金额
     *
     * @param money 结算的金额
     * @return 返回满减后的金额
     */
    @Override
    Double getMoney(Double money) {
        //定义结果接收对象
        Double result = money;
        if(money>=conditionMoney){
            //进行满减操作
            result = money-returnMoney;
        }
        return result;
    }
}