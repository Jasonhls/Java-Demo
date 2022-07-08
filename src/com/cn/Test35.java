package com.cn;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @Author: helisen
 * @Date 2022/5/30 13:36
 * @Description:
 */
public class Test35 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        Integer num = Integer.parseInt(s);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num - i; j++) {
                sb.append((j + i + 2) * (j + i + 1) / 2 - i).append(" ");
            }
            sb.append("\r\n");
        }
        System.out.println(sb);
    }
}
