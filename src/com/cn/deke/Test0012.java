package com.cn.deke;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Test0012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] split = s.split(",");
        int total = Integer.parseInt(br.readLine());
        int[] res = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            res[i] = Integer.parseInt(split[i]);
        }
        Arrays.sort(res);
        int t = 0;
        for (int i = 0; i < res.length; i++) {
            t = t + res[i];
            if(t > total) {
                System.out.println(i);
                break;
            }
        }
    }
}
