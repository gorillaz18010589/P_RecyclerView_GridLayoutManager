package com.example.p_recyclerview_gridlayoutmanager;

import java.math.BigDecimal;

public class Arith {
    /**
     *提供精確加法計算的add方法
     *
     * @param value1 被加數
     * @param value2 加數
     * @return兩個參數的和
     **/
    public static double add(double value1, double value2) {
        BigDecimal b1 = new BigDecimal(Double.valueOf(value1));
        BigDecimal b2 = new BigDecimal(Double.valueOf(value2));
        return b1.add(b2).doubleValue();
    }


    /**
     *提供精確減法運算的子方法
     *
     * @param value1 被減數
     * @param value2 減數
     * @return兩個參數的差
     */
    public static double sub(double value1, double value2) {
        BigDecimal b1 = new BigDecimal(Double.valueOf(value1));
        BigDecimal b2 = new BigDecimal(Double.valueOf(value2));
        return b1.subtract(b2).doubleValue();
    }

    /**
     *提供精確乘法運算的mul方法
     *
     * @param value1 被乘數
     * @param value2 乘數
     * @return兩個參數的積
     */
    public static double mul(double value1, double value2) {
        BigDecimal b1 = new BigDecimal(Double.valueOf(value1));
        BigDecimal b2 = new BigDecimal(Double.valueOf(value2));
        return b1.multiply(b2).doubleValue();
    }

    /**
     *提供精確的除法運算方法div
     *
     * @param value1 被除數
     * @param value2 除數
     * @param scale 精確範圍
     * @return兩個參數的商
     * @拋出IllegalAccessException
     */
    public static double div(double value1, double value2, int scale) throws IllegalAccessException {
        //如果精确范围小于0，抛出异常信息
        if (scale < 0) {
            throw new IllegalAccessException("精确度不能小于0");
        }
        BigDecimal b1 = new BigDecimal(Double.valueOf(value1));
        BigDecimal b2 = new BigDecimal(Double.valueOf(value2));
        return b1.divide(b2, scale).doubleValue();
    }

}
