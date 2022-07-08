package com.cn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author: helisen
 * @Date 2022/6/2 15:09
 * @Description:
 */
public class Test107 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        double goal = Double.parseDouble(s);
        boolean b = false;
        if(goal < 0) {
            b = true;
            goal = -goal;
        }
        int m = 0;
        while(true) {
            if(m <= goal && goal < m + 1) {
                break;
            }
            m++;
        }
        int n = 1;
        while(true) {
            if(goal < 1) {
                n = 0;
                break;
            }
            int p = n * n * n;
            int q = (n + 1) * (n + 1) * (n + 1);
            if(p <= m && q > m) {
                break;
            }
            n = n + 1;
        }
        double k = n;
        while(true) {

            double kk = k * k * k;
            double kkk = (k + 0.1d) * (k + 0.1d) * (k + 0.1d);
            if(kk < goal && kkk > goal) {
                if(kkk - goal < goal - kk) {
                    k = k + 0.1d;
                }
                break;
            }
            k = k + 0.1d;
        }
        if(b) {
            k = -k;
        }
        String format = String.format("%.1f", k);
        System.out.println(format);
    }
}
