package com.cn;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @Author: helisen
 * @Date 2022/6/14 15:40
 * @Description:
 */
public class Test99 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        Integer n = Integer.parseInt(s);
        int num = 0;
        for (int i = 0; i <= n; i++) {
            if(i == 0) {
                num++;
                continue;
            }
            int a = i * i;
            int b = i;
            int c = 0;
            while(true) {
                b = b / 10;
                if(b == 0) {
                    break;
                }
                c++;
                if(b < 10) {
                    break;
                }
            }
            int d = 1;
            c = c + 1;
            while(true) {
                if(c == 0) {
                    break;
                }
                d = d * 10;
                c--;
                if(c == 0) {
                    break;
                }
            }
            if(d == 1) {
                if(a==i) {
                    num++;
                }
            }else {
                if((a - i) % d == 0) {
                    num++;
                }
            }
        }
        System.out.println(num);
    }
}
