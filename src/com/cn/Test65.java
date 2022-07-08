package com.cn;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @Author: helisen
 * @Date 2022/6/20 14:00
 * @Description:
 */
public class Test65 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1 = br.readLine();
        String s2 = br.readLine();
        String s = s1.length() >= s2.length() ? s1 : s2;
        String ss = s1.length() >= s2.length() ? s2 : s1;
        for (int i = ss.length(); i > 0; i--) {
            for (int j = 0; j < ss.length() - i + 1; j++) {
                String str = ss.substring(j, j + i);
                if(s.contains(str)) {
                    System.out.println(str);
                    return;
                }
            }
        }
        System.out.println();
    }


}
