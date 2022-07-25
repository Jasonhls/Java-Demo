package com.cn.deke;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test0060 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        char[] chars = s.toCharArray();
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < chars.length; i++) {
            list.add(chars[i]);
        }
        if(list.size() == 1) {
            System.out.println(1);
            return;
        }
        Character current = list.get(0);

        for (int i = 1; i < list.size();i++) {
            Character c = list.get(i);
            if(c == current) {
                list.remove(i);
                list.remove(i - 1);
                i = i - 2;
                if(i < 0) {
                    i = 0;
                }
                current = list.get(i);
            }else {
                current = c;
            }
        }
        System.out.println(list.size());
    }
}
