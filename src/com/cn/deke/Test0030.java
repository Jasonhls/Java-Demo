package com.cn.deke;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.TreeSet;

public class Test0030 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int num = Integer.parseInt(s);
        int res = 0;
        for (int i = 0; i < num; i++) {
            String[] split = br.readLine().split(",");
            StringBuilder sb = new StringBuilder();
            int max = 0;
            for (int j = 0; j < split.length; j++) {
                int a = j;
                int time = split.length;
                while(true) {
                    sb.append(split[a]);
                    time--;
                    if(time == 0) {
                        break;
                    }
                    a++;
                    if(a >= split.length) {
                        a = a - split.length;
                    }

                }
                int ii = Integer.parseInt(sb.toString(), 2);
                sb.delete(0, split.length);
                if(ii > max) {
                    max = ii;
                }
            }
            res = res + max;
        }
        System.out.println(res);
    }
}
