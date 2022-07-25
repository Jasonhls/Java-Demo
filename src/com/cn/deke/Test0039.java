package com.cn.deke;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test0039 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int n = Integer.parseInt(s);
        if(n == 1) {
            System.out.println("1");
            return;
        }
        String ss = "1";
        while(true) {
            ss = get(ss);
            n--;
            if(n == 1) {
                break;
            }
        }
        System.out.println(ss);
    }

    public static String get(String s) {
        char[] chars = s.toCharArray();
        if(chars.length == 1) {
            return "11";
        }
        int num = 0;
        char current = chars[0];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chars.length;) {
            char c = chars[i];
            if(c == current) {
                num++;
                if(i == chars.length - 1) {
                    sb.append(num).append(c);
                    break;
                }
                i++;
            }else {
                sb.append(num).append(current);
                num = 0;
                current = c;
                if(i == chars.length - 1) {
                    sb.append(1).append(c);
                    break;
                }
            }
        }
        return sb.toString();
    }
}
