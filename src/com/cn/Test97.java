package com.cn;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @Author: helisen
 * @Date 2022/6/14 15:40
 * @Description:
 */
public class Test97 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int num = Integer.parseInt(s);
        String s1 = br.readLine();
        String[] s2 = s1.split(" ");
        int numOne = 0;
        int numTwo = 0;
        int total = 0;

        for (int i = 0; i < s2.length; i++) {
            int i1 = Integer.parseInt(s2[i]);
            if(i1 < 0) {
                numOne++;
                continue;
            }
            if(i1 > 0) {
                numTwo++;
                total = total + i1;
            }
        }
        StringBuilder sb = new StringBuilder();
        float f = 0.0f;
        if(numTwo > 0) {
            float f2 = Float.valueOf(numTwo);
            f = total / f2;
        }
        f = Math.round(f * 10)/10f;
        sb.append(numOne).append(" ").append(f);
        System.out.println(sb);
    }
}
