package com.cn.deke;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Test0032 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int num = Integer.parseInt(s);
        String[] s1 = br.readLine().split(" ");
        int len = Integer.parseInt(br.readLine());
        int max = 0;
        for (int i = 0; i < num; i++) {
            if(i + len > num) {
                break;
            }
            int sum = 0;

            for (int j = i; j < i + len; j++) {
                sum += Integer.parseInt(s1[j]);
            }
            if(sum > max) {
                max = sum;
            }
        }
        System.out.println(max);
    }
}
