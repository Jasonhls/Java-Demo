package com.cn;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @Author: helisen
 * @Date 2022/6/14 15:40
 * @Description:
 */
public class Test96 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        boolean b = false;
        for (int i = 0; i < chars.length; i++) {
            int c = chars[i];
            if(c >= 48 && c <= 57) {
                if(!b) {
                    sb.append("*").append(chars[i]);
                    b = true;
                    if(i == chars.length - 1) {
                        sb.append("*");
                    }
                }else {
                    sb.append(chars[i]);
                }
                if(i == chars.length - 1) {
                    sb.append("*");
                }
            }else {
                if(b) {
                    sb.append("*").append(chars[i]);
                    b = false;
                }else {
                    sb.append(chars[i]);
                }
            }
        }
        System.out.println(sb);
    }
}
