package com.cn.deke;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test0068 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] s1 = s.split(" ");
        List<Integer> list = Arrays.asList(s1).stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int min = Math.abs(list.get(0) + list.get(1));
        List<Integer> res = new ArrayList<>(2);
        for (int i = 0; i < list.size() - 1; i++) {
            int a = list.get(i);
            for (int j = i + 1; j < list.size(); j++) {
                int b = list.get(j);
                int tmp = Math.abs(a + b);
                if(tmp < min) {
                    res.clear();
                    res.add(list.get(i));
                    res.add(list.get(j));
                    min = tmp;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(res.get(0)).append(" ").append(res.get(1)).append(" ").append(min);
        System.out.println(sb);
    }
}
