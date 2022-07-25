package com.cn.deke;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test0078 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int num = Integer.parseInt(s);
        List<String> list = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            list.add(br.readLine());
        }
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return get(s1) - get(s2);
            }
        });

        for (int i = 0; i < num; i++) {
            System.out.println(list.get(i));
        }

    }

    public static int get(String s) {
        int total = 0;
        String[] split = s.split(":");
        total += Integer.parseInt(split[0]) * 60 * 60 * 1000;
        total += Integer.parseInt(split[1]) * 60 * 1000;
        String[] split1 = split[2].split("\\.");
        total += Integer.parseInt(split1[0]) * 1000;
        total += Integer.parseInt(split1[1]);
        return total;
    }
}
