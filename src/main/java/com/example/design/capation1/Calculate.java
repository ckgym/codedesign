package com.example.design.capation1;

import com.example.design.common.CinUtil;

/**
 * @program: design
 * @Description : 工厂模式（计算器）
 * @Author : chenKun
 * @Date : 2019-11-23 21:39
 */
public class Calculate {

    /**
     * 計算器初始版本1
     */

    private static void calculateOne() {
        System.out.println("請輸入第一個變量值：");
        Integer param1 = CinUtil.cinInteger();
        System.out.println("請輸入運算符號：+-*/");
        String param2 = CinUtil.cinString();
        System.out.println("請出入第二個變量值：");
        Integer param3 = CinUtil.cinInteger();
        Integer result;
        if ("+".equals(param2)) {
            result = param1 + param3;
        } else if ("-".equals(param2)) {
            result = param1 - param3;
        } else if ("*".equals(param2)) {
            result = param1 * param3;
        } else if ("/".equals(param2)) {
            result = param1 / param3;
        } else {
            result = -1;
        }
        System.out.println("輸出的結果爲：" + result);
    }


    /**
     * 第二版  对初始版本进行异常处理以及进行分支处理
     */
    private static void calculateTwo() {
        try {
            System.out.println("請輸入第一個變量值：");
            Integer param1 = CinUtil.cinInteger();
            System.out.println("請輸入運算符號：+-*/");
            String param2 = CinUtil.cinString();
            System.out.println("請出入第二個變量值：");
            Integer param3 = CinUtil.cinInteger();
            Integer result;
            switch (param2) {
                case "+":
                    result = param1 + param3;
                    System.out.println("輸出的結果爲：" + result);
                    break;
                case "-":
                    result = param1 - param3;
                    System.out.println("輸出的結果爲：" + result);
                    break;
                case "*":
                    result = param1 * param3;
                    System.out.println("輸出的結果爲：" + result);
                    break;
                case "/":
                    if (param3 == 0) {
                        System.out.println("除数不能为0");
                        break;
                    } else {
                        result = param1 / param3;
                        System.out.println("輸出的結果爲：" + result);
                        break;
                    }
                default:
                    result = -1;
            }
        } catch (
                Exception e) {
            System.out.println("你的输入有误：" + e);
        }

    }

    /**
     * 第版三 面向对象的第一个特性  封装
     */
    private static void calculateThree() {
        try {
            System.out.println("請輸入第一個變量值：");
            Integer param1 = CinUtil.cinInteger();
            System.out.println("請輸入運算符號：+-*/");
            String param2 = CinUtil.cinString();
            System.out.println("請出入第二個變量值：");
            Integer param3 = CinUtil.cinInteger();
            Integer result = Optional.Getresult(param1, param3, param2);
            System.out.println("输出的值为：" + result);
        } catch (
                Exception e) {
            System.out.println("你的输入有误：" + e);
        }
    }

    /**
     * 第四版  面向对象的第二个特性  多态
     */
    private static void calculateFour() {
        try {
            System.out.println("請輸入第一個變量值：");
            Integer param1 = CinUtil.cinInteger();
            System.out.println("請輸入運算符號：+-*/");
            String param2 = CinUtil.cinString();
            System.out.println("請出入第二個變量值：");
            Integer param3 = CinUtil.cinInteger();
            BaseOption baseOption = OperateFactory.createOption("+");
            baseOption.setParam1(param1);
            baseOption.setParam2(param3);
            baseOption.setSymble(param2);
            Integer result = baseOption.getResult();
            System.out.println("输出的值为：" + result);
        } catch (
                Exception e) {
            System.out.println("你的输入有误：" + e);
        }
    }

    /**
     * 總的測試方法入口
     *
     * @param args
     */
    public static void main(String[] args) {
        //calculateOne();
        //calculateTwo();
        //calculateThree();
        calculateFour();
    }
}