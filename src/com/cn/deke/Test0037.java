package com.cn.deke;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Test0037 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] s1 = s.split(" ");
        int cpu = Integer.parseInt(s1[0]);
        int num = Integer.parseInt(s1[1]);
        String[] s2 = br.readLine().split(" ");
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            list.add(Integer.parseInt(s2[i]));
        }
        list.sort(Comparator.comparingInt(Integer::intValue));

        int a = num % cpu;
        int total = 0;
        for (int i = 0; i < num; i++) {
            if((i + 1) % cpu == a) {
                total = total + list.get(i);
            }
        }
        System.out.println(total);

    }
}
