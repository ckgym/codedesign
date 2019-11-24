package com.example.design.capation1;

/**
 * @ClassName : design
 * @Description : 运算类
 * @Author : ChenKun
 * @Date : 2019-11-23 23:41
 */
public class Optional {
    public static Integer Getresult(Integer param1, Integer param2, String symble) {
        Integer result = 0;
        switch (symble) {
            case "+":
                result = param1 + param2;
                break;
            case "-":
                result = param1 - param2;
                break;
            case "*":
                result = param1 * param2;
                break;
            case "/":
                if (param2 == 0) {
                    System.out.println("除数不能为0");
                    break;
                } else {
                    result = param1 / param2;
                    break;
                }
            default:
                result = -1;
        }
        return result;
    }
}