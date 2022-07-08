package com.cn;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @Author: helisen
 * @Date 2022/5/30 13:36
 * @Description:
 */
public class Test34 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars.length - i - 1; j++) {
                if(chars[j] > chars[j + 1]) {
                    char temp = chars[j + 1];
                    chars[j + 1] = chars[j];
                    chars[j] = temp;
                }
            }
        }
        System.out.println(String.valueOf(chars));
    }

}
