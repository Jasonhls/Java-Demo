package com.cn;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @Author: helisen
 * @Date 2022/6/20 10:49
 * @Description:
 */
public class Test53 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int num = Integer.parseInt(s);
        if(num == 1 || num == 2) {
            System.out.println(-1);
            return;
        }
        num = num - 2;
        if(num % 4 == 1) {
            System.out.println(2);
        }else if(num % 4 == 2) {
            System.out.println(3);
        }else if(num % 4 == 3) {
            System.out.println(2);
        }else {
            System.out.println(4);
        }
    }

    public static int a(int n, int m) {
        if(m == 1 || m == 2 * n - 1) {
            return 1;
        }
        if(n == 1 || n == 2) {
            return 1;
        }
        if(m == 2 || m == 2 * n - 2) {
            return n - 1;
        }
        return a(n - 1, m - 2) + a(n - 1, m - 1) + a(n - 1, m);

    }
}
