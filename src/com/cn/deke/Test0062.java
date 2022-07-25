package com.cn.deke;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Test0062 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        char[] chars = s.toCharArray();
        List<Character> list = new ArrayList<>();
        for (char c : chars) {
            list.add(c);
        }
        if(list.size() == 1) {
            System.out.println(list.get(0));
            return;
        }
        StringBuilder sb = new StringBuilder();
        int num = 0;
        for (int i = 1; i < list.size();i++) {
            Character a = list.get(i - 1);
            Character b = list.get(i);
            if(a == b) {
                num++;
                if(i == list.size() - 1) {
                    sb.append(num + 1).append(a);
                }
            }else {
                if(num > 1) {
                    sb.append(num + 1).append(a);
                }else {
                    int tmp = num;
                    int temp = i - 1;
                    while(tmp >= 0) {
                        sb.append(list.get(temp));
                        tmp--;
                        temp--;
                    }
                }
                num = 0;
                if(i == list.size() - 1) {
                    sb.append(b);
                }
            }
        }
        System.out.println(sb);
    }
}
