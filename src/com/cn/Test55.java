package com.cn;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: helisen
 * @Date 2022/6/20 14:00
 * @Description:
 */
public class Test55 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int n = Integer.parseInt(s);

        int num = 0;
        for (int i = 1; i <= n; i++) {
            if(i % 7 == 0) {
                num++;
                continue;
            }
            int k = i;
            int kk = 10000;
            boolean b = false;
            while(true) {
                if(k / kk > 0) {
                    int a = k % kk;
                    if(a == 7) {
                        b = true;
                        break;
                    }
                    if(k / kk == 7) {
                        b = true;
                        break;
                    }
                    k = k - k / kk * kk;
                }else {
                    kk = kk / 10;
                }
                if(kk == 1) {
                    break;
                }
            }
            if(b) {
                num++;
                continue;
            }
        }
        System.out.println(num);
    }
}
