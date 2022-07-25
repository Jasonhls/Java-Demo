package com.cn.deke;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Test0010 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] arr = s.split(" ");
        int c = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
        int[] res = new int[c];
        for (int i = 2; i < arr.length; i++) {
            String ss = Integer.toBinaryString(Integer.parseInt(arr[i]));
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < 32 - ss.length(); j++) {
                sb.append("0");
            }
            sb.append(ss);
            char[] chars = sb.toString().toCharArray();
            StringBuilder builder = new StringBuilder();
            int total = 0;
            for (int k = 1; k <= 32; k++) {
                builder.append(chars[k - 1]);
                if(k % 8 == 0) {
                    total = total + Integer.parseInt(builder.toString(), 2);
                    builder.delete(0, 7);
                }
            }
            int q = total % b;
            if(q < c) {
                res[q]++;
            }
        }
        Arrays.sort(res);
        for (int i = res.length - 1; i >= 0; i--) {
            if(res[i] != 0) {
                System.out.println(res[i]);
                break;
            }
        }

    }
}
