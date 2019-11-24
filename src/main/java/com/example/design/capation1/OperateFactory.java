package com.example.design.capation1;

/**
 * @ClassName : design
 * @Description : 运算工厂类
 * @Author : ChenKun
 * @Date : 2019-11-24 12:09
 */
public class OperateFactory {

    public static BaseOption createOption(String symble) {
        //新建一个接收的对象
        BaseOption baseOption = null;
        switch (symble) {
            case "+":
                baseOption = new OptionAdd();
                break;
            case "-":
                baseOption = new OptionAdd();
                break;
            case "*":
                baseOption = new OptionAdd();
                break;
            case "/":
                baseOption = new OptionAdd();
                break;
            default:
                baseOption = null;
        }
        return baseOption;
    }
}