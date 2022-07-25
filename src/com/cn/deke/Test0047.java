package com.cn.deke;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test0047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] s1 = s.split(" ");
        int count = 0;
        for (int i = 0; i < s1.length; i++) {
            String str = s1[i];
            char[] chars = str.toCharArray();
            if(str.replaceAll("[a-z]+", "").isEmpty()) {
                for (int j = 0; j < chars.length / 2; j++) {
                    char tmp = chars[j];
                    chars[j] = chars[chars.length - j - 1];
                    chars[chars.length - j - 1] = tmp;
                }
            }

            if(chars.length < 4) {
                continue;
            }
            for (int k = 0; k < chars.length - 3; k++) {
                if(!a(chars[k])
                    && a(chars[k + 1])
                    && (!a(chars[k + 2]) && chars[k + 2] != 'r')
                    && chars[k + 3] == 'e') {
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    public static boolean a(char c) {
        return c == 'a' || c == 'e' || c == 'i'
                || c == 'o' || c == 'u';
    }
}
