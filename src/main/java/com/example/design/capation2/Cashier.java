package com.example.design.capation2;

import com.example.design.common.CinUtil;

/**
 * @ClassName : design
 * @Description : 收银系统（策略模式）
 * @Author : ChenKun
 * @Date : 2019-11-24 12:43
 */
public class Cashier {
    /**
     * 算出用户的花费值，并且列出所有的东西清单
     */
    private static void reckonMoney() {
        int totalMoney = 0;
        StringBuilder result = new StringBuilder();
        while (true) {
            System.out.println("请输入商品名称：");
            String goodName = CinUtil.cinString();
            System.out.println("请输入商品价格：");
            Integer price = CinUtil.cinInteger();
            System.out.println("请输入商品的数量：");
            Integer count = CinUtil.cinInteger();
            totalMoney += price * count;
            result.append("购买商品").append(goodName).append("价格为：").append(price).append("数量为：").append(count).append("\n");
            System.out.println("是否继续输入商品：y/n");
            String isContinue = CinUtil.cinString();
            if ("n".equals(isContinue.toLowerCase())) {
                break;
            }
        }
        System.out.println("应该支付" + totalMoney);
        System.out.println("商品清单为：\n" + result);
    }

    /**
     * 增加打折以及满减的操作 工厂模式
     */
    private static void reckonMoneyTwo() {
        double totalMoney = 0.0;
        StringBuilder result = new StringBuilder();
        while (true) {
            System.out.println("请输入商品名称：");
            String goodName = CinUtil.cinString();
            System.out.println("请输入商品价格：");
            Integer price = CinUtil.cinInteger();
            System.out.println("请输入商品的数量：");
            Integer count = CinUtil.cinInteger();
            totalMoney += price * count;
            result.append("购买商品").append(goodName).append("价格为：").append(price).append("数量为：").append(count).append("\n");
            System.out.println("是否继续输入商品：y/n");
            String isContinue = CinUtil.cinString();
            if ("n".equals(isContinue.toLowerCase())) {
                break;
            }
        }
        System.out.println("请输入计算选项：");
        System.out.println("0:正常收费\n 1:打八折\n 2:满300返利30");
        Integer idnex = CinUtil.cinInteger();
        BaseCasher baseCasher = null;
        switch (idnex) {
            case 0:
                baseCasher = CasherFactory.createCasher(0);
                break;
            case 1:
                baseCasher = CasherFactory.createCasher(1);
                break;
            case 2:
                baseCasher = CasherFactory.createCasher(2);
                break;
        }
        //计算最后的总金额
        Double totalMoney1 = baseCasher.getMoney(totalMoney);
        System.out.println("原价" + totalMoney + "活动价：" + totalMoney1);
        System.out.println("商品清单为：\n" + result);
    }

    /**
     * 增加打折以及满减的操作 策略模式
     */
    private static void reckonMoneyThree() {
        double totalMoney = 0.0;
        StringBuilder result = new StringBuilder();
        while (true) {
            System.out.println("请输入商品名称：");
            String goodName = CinUtil.cinString();
            System.out.println("请输入商品价格：");
            Integer price = CinUtil.cinInteger();
            System.out.println("请输入商品的数量：");
            Integer count = CinUtil.cinInteger();
            totalMoney += price * count;
            result.append("购买商品").append(goodName).append("价格为：").append(price).append("数量为：").append(count).append("\n");
            System.out.println("是否继续输入商品：y/n");
            String isContinue = CinUtil.cinString();
            if ("n".equals(isContinue.toLowerCase())) {
                break;
            }
        }
        System.out.println("请输入计算选项：");
        System.out.println("0:正常收费\n 1:打八折\n 2:满300返利30");
        Integer idnex = CinUtil.cinInteger();
        BaseCasher baseCasher = null;
        CasherContext casherContext = new CasherContext(idnex);
        //计算最后的总金额
        double totalMoney1 = casherContext.getResult(totalMoney);
        System.out.println("原价" + totalMoney + "活动价：" + totalMoney1);
        System.out.println("商品清单为：\n" + result);
    }
    public static void main(String[] args) {
        //reckonMoney();
        //reckonMoneyTwo();
        reckonMoneyThree();
    }
}