package com.cn.deke;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test0075 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        char[] chars = s.toCharArray();
        char current = chars[0];
        int max = 0;
        int num = 0;
        for (int i = 0; i < chars.length;) {
            char c = chars[i];
            if(c == current) {
                num++;
                if(i == chars.length - 1) {
                    if(num > max) {
                        max = num;
                        break;
                    }
                }
                i++;
            }else {
                if(num > max) {
                    max = num;
                }
                num = 0;
                current = c;
            }
        }
        System.out.println(max);
    }
}
