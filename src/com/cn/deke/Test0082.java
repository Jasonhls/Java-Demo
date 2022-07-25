package com.cn.deke;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test0082 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        char[] chars = s.toCharArray();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if(c == '-') {
                i++;
                int start = i;
                int end = i;
                while(true) {
                    char cc = chars[i];
                    if(cc >= '0' && cc <= '9') {
                        i++;
                    }else {
                        end = i;
                        break;
                    }
                }
                int aa = Integer.parseInt(s.substring(start, end));
                list.add(-aa);
            }else {
                if(c >= '0' && c <= '9') {
                    int aa = Integer.parseInt(s.substring(i, i + 1));
                    list.add(aa);
                }
            }
        }
        System.out.println(list.stream().collect(Collectors.summingInt(Integer::intValue)).intValue());
    }
}
