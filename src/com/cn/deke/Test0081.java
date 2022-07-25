package com.cn.deke;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Test0081 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int n = Integer.parseInt(s);
        int tmp = n;
        int len = s.length() - 1;
        int divide = 1;

        int total = 0;
        while(len > 0) {
            divide *= 10;
            len--;
        }

        while(true) {
            if(tmp < 10) {
                break;
            }
            int divideTemp = divide;
            int a = tmp / divideTemp;
            if(a > 4) {
                total += divideTemp;
                a = a - 1;
            }
            while(true) {
                if(divideTemp <= 10) {
                    if(divide > divideTemp) {
                        total += 9 * a;
                    }else {
                        total += a;
                    }
                    tmp = tmp - tmp / divide * divide;
                    divide = divide / 10;
                    break;
                }else {
                    total += a * divideTemp / 10;
                    divideTemp = divideTemp / 10;
                }
            }
        }
        if(tmp > 4) {
            total += 1;
        }
        System.out.println(n - total);

    }
}
