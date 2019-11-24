package com.example.design.capation2;

/**
 * @ClassName : design
 * @Description : 策略模式
 * @Author : ChenKun
 * @Date : 2019-11-24 17:07
 */
public class CasherContext {

    private BaseCasher baseCasher;

    public CasherContext(Integer index) {
        switch (index) {
            //不打折、不返利
            case 0:
                baseCasher = new CasherCommon();
                break;
            //不打折、不返利
            case 1:
                baseCasher = new CasherDiscount(0.8);
                break;
            //不打折、不返利
            case 2:
                baseCasher = new CasherCondition(300, 30);
                break;
            default:
                baseCasher = null;
        }
    }

    //计算最后的结果值
    public double getResult(double money) {
        return baseCasher.getMoney(money);
    }
}