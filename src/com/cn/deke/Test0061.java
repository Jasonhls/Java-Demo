package com.cn.deke;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Test0061 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String t = br.readLine();
        String p = br.readLine();
        char[] chars = t.toCharArray();
        char[] chars1 = p.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            int num = 0;
            for (int j = 0; j < chars1.length; j++) {
                if(chars1[j] == chars[i + j]) {
                    num++;
                }

            }
            if(num == chars1.length) {
                System.out.println(i + 1);
                return;
            }
        }
        System.out.println("No");
    }
}
