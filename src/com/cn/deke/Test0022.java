package com.cn.deke;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Test0022 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int num = Integer.parseInt(s);
        List<String> list = new ArrayList<>(num);
        for (int i = 0; i < num; i++) {
            list.add(br.readLine());
        }

        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(get(o1) > get(o2)) {
                    return 1;
                }else if(get(o1) < get(o2)) {
                    return -1;
                }
                return 0;
            }
        });
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }


    }

    public static int get(String s) {
        int value = 0;
        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < chars.length; j++) {
            char c = chars[j];
            if(c != 'M' && c != 'G' && c != 'T') {
                sb.append(c);
                continue;
            }
            int a = Integer.parseInt(sb.toString());
            if(c == 'M') {
                value = value + a;
            }
            if(c == 'G') {
                value = value + 1024 * a;
            }
            if(c == 'T') {
                value = value + 1024 * 1024 * a;
            }
            sb.delete(0, sb.toString().length());
        }
        return value;
    }




}
