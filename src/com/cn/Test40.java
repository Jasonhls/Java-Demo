package com.cn;

/**
 * @Author: helisen
 * @Date 2022/6/1 9:47
 * @Description:
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Test40 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1 = br.readLine();
        char[] chars = s1.toCharArray();
        int a1 = 0;
        int a2 = 0;
        int a3 = 0;
        int a4 = 0;
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if(c >= 'a' && c <= 'z' || (c >= 'A' && c <= 'Z')) {
                a1++;
            }else if(c == ' ') {
                a2++;
            }else if(c >= 0 && c <= 9) {
                a3++;
            }else {
                a4++;
            }
        }
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);
    }
}
