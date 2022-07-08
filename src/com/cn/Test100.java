package com.cn;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @Author: helisen
 * @Date 2022/6/14 15:40
 * @Description:
 */
public class Test100 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int num = Integer.parseInt(s);
        int total = 0;
        if(num == 1) {
            System.out.println(2);
            return;
        }
        total = total + 2;
        num = num - 1;
        int a = 2;
        while(true) {
            a = a + 3;
            total = total + a;
            num--;
            if(num == 0) {
                break;
            }
        }
        System.out.println(total);
    }
}
