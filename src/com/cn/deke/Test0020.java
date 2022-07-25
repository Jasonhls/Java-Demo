package com.cn.deke;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Test0020 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] s1 = s.split(" ");
        int length = s1.length;
        int res = -1;
        for (int i = 1; i < length / 2; i++) {
            int a = Integer.parseInt(s1[i]);
            if(a + i == length - 1) {
                res = i;
                break;
            }
        }
        System.out.println(res);
    }
}
