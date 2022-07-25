package com.cn.deke;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Test0011 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] s1 = s.split(" ");
        int index = 0;
        int min = Integer.parseInt(s1[1]);
        for (int i = 1; i < s1.length; i++) {
            int a = Integer.parseInt(s1[i]);
            if(a == -1) {
                continue;
            }
            if(a < min) {
                index = i;
                min = a;
            }
        }
        index = index + 1;
        List<Integer> res = new ArrayList<>();
        res.add(index);
        while(true) {
            index = index / 2;
            if(index > 0) {
                res.add(index);
            }else {
                break;
            }
        }
        res.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1 > o2) {
                    return 1;
                }else if(o1 < o2) {
                    return -1;
                }else {
                    return 0;
                }
            }
        });
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < res.size(); i++) {
            sb.append(s1[res.get(i) - 1]).append(" ");
        }
        System.out.println(sb);
    }
}
