package com.cn;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author: helisen
 * @Date 2022/5/10 15:29
 * @Description:
 */
public class Test17 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] arr = s.split(";");

        int x = 0;
        int y = 0;
        for(int i = 0; i < arr.length; i++) {
            String str = arr[i];
            if(str.length() != 3 && str.length() != 2) {
                continue;
            }
            char[] ch = str.toCharArray();
            if(ch[0] != 'A' && ch[0] != 'W' && ch[0] != 'D' && ch[0] != 'S') {
                continue;
            }
            if(ch[1] < '1' || ch[1] > 9) {
                continue;
            }
            if(str.length() == 3) {
                if(ch[2] < '0' || ch[2] > 9) {
                    continue;
                }
            }

            String sss = str.substring(1);
            Integer num = Integer.valueOf(sss);
            if(str.startsWith("A")) {
                x = x - num;
            }else if(str.startsWith("D")) {
                x = x + num;
            }else if(str.startsWith("W")) {
                y = y + num;
            }else if(str.startsWith("S")) {
                y = y - num;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(x).append(",").append(y);
        System.out.print(sb);
    }
}
