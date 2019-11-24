package com.example.design.capation2;

import com.fasterxml.jackson.databind.ser.Serializers;

/**
 * @ClassName : design
 * @Description : 收银工厂类
 * @Author : ChenKun
 * @Date : 2019-11-24 15:02
 */
public class CasherFactory {
    public static BaseCasher createCasher(int index){
        BaseCasher baseCasher = null;
        switch (index){
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
                baseCasher = new CasherCondition(300  , 30);
                break;
            default:
                baseCasher = null;
        }
        return baseCasher;
    }
}