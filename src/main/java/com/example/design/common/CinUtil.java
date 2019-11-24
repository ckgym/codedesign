package com.example.design.common;

import java.util.Scanner;

/**
 * @program: design
 * @Description : java 字符/数字输入
 * @Author : chenKun
 * @Date : 2019-11-23 21:27
 */
public class CinUtil {

    /**
     * 输出框中输入一个整形的数值
     * @return
     */
    public static  Integer cinInteger(){
        //新建扫描对象
        Scanner scanner = new Scanner(System.in);
        Integer result = scanner.nextInt();
        return result;
    }

    public static  String cinString(){
        //新建扫描对象
        Scanner scanner = new Scanner(System.in);
        String result = scanner.next();
        return result;
    }
}