package com.cn;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * @Author: helisen
 * @Date 2022/6/20 14:00
 * @Description:
 */
public class Test70 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1 = br.readLine();
        int num = Integer.parseInt(s1);
        int[][] arr = new int[num][2];
        for (int i = 0; i < num; i++) {
            String s = br.readLine();
            String[] strings = s.split(" ");
            arr[i][0] = Integer.parseInt(strings[0]);
            arr[i][1] = Integer.parseInt(strings[1]);
        }
        String s = br.readLine();
        char[] chars = s.toCharArray();
        char current;
        boolean b = false;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            //第一个(
            if(!b && c == '(') {
                b = true;
            }
            //第二个(
            if(b && c == '(') {
                char[] chars1 = sb.toString().toCharArray();
                int aa = arr[0][0];
                int bb = arr[0][1];
                for (int j = 1; j < chars1.length; j++) {
                    int mm = (int)chars1[j] - 65;

                }
                b = false;
            }
            if(b && (c >= 'A' && c <= 'Z')) {
                sb.append(c);
            }
        }
    }


}
