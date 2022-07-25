package com.cn.deke;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Test0059 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int num = Integer.parseInt(s);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num; i++) {
            String[] s1 = br.readLine().split(" ");
            int absentNum = 0;
            boolean b = true;
            for (int j = 0; j < s1.length; j++) {
                String str = s1[j];
                if(str.equals("absent")) {
                    absentNum++;
                    if(absentNum > 1) {
                        b = false;
                        sb.append("false").append(" ");
                        break;
                    }
                }
            }
            //如果失败了，直接返回
            if(!b) {
                continue;
            }
            int lateNum = 0;
            for (int j = 0; j < s1.length; j++) {
                String str = s1[j];
                if(str.equals("late") || str.equals("leaveearly")) {
                    lateNum++;
                    if(lateNum > 1) {
                        sb.append(false).append(" ");
                        b = false;
                        break;
                    }
                }else {
                    lateNum = 0;
                }
            }
            if(!b) {
                continue;
            }
            for (int j = 0; j <= s1.length - 7;) {
                int c = 0;
                boolean bb = true;
                for (int k = j; k < j + 7; k++) {
                    String str = s1[k];
                    if(str.equals("absent") || str.equals("late") || str.equals("leaveearly")) {
                        c++;
                        if(c > 3) {
                            bb = false;
                            break;
                        }
                    }
                }
                if(!bb) {
                    b = false;
                    sb.append(false).append(" ");
                    break;
                }
                j = j + 7;
            }
            if(!b) {
                continue;
            }
            sb.append(true).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}
