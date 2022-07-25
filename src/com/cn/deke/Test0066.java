package com.cn.deke;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test0066 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        char[] chars = s.toCharArray();
        int max = 0;
        List<Character> list = Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        int num = 0;
        for (int j = 0; j < chars.length; j++) {
            char c = chars[j];
            if(list.contains(c)) {
                num++;
            }else {
                if(num > max) {
                    max = num;
                }
                num = 0;
            }
        }
        if(num > max) {
            max = num;
        }
        System.out.println(max);
    }
}
