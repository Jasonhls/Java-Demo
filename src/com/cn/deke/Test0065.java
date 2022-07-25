package com.cn.deke;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test0065 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        char[] chars = s.toCharArray();
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[200];
        for (int i = 0; i < chars.length; i++) {
            int a = chars[i];
            if(arr[a] == 0) {
                arr[a] = i + 1;
            }
        }
        if(n > chars.length) {
            for (int i = 199; i >= 0; i--) {
                if(arr[i] > 0) {
                    System.out.println(arr[i] - 1);
                    return;
                }
            }
        }

        int num = 0;
        for (int i = 0; i < 200; i++) {
            if(arr[i] != 0) {
                num++;
                if(num == n) {
                    System.out.println(arr[i] - 1);
                    return;
                }
            }
        }

    }
}
