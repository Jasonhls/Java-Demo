package com.cn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @Author: helisen
 * @Date 2022/6/2 15:09
 * @Description:
 */
public class Test44 {
    public static void main(String[] args) throws IOException {
        BigDecimal SOTaxIncluded = new BigDecimal("0.0004390154920150530000000000");
        Long unitPrice = SOTaxIncluded.multiply(new BigDecimal(100)).setScale(0, RoundingMode.HALF_UP).longValue();
        System.out.println(unitPrice);
    }
}
