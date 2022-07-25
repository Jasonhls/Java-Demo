package com.cn.deke;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test0071 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        List<Integer> list = Arrays.stream(s.split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size() - 1; i++) {
            //偶数位
            if(i % 2 == 0 && list.get(i) < list.get(i + 1)) {
                swap(list, i, i + 1);
            }
            //奇数位
            if(i % 2 == 1 && list.get(i) > list.get(i + 1)) {
                swap(list, i, i + 1);
            }
        }
        list.stream().forEach(a -> sb.append(a).append(" "));
        System.out.println(sb.toString().substring(0, sb.length() - 1));
    }

    public static void swap(List<Integer> list, int x, int y) {
        Integer tmp = list.get(x);
        list.set(x, list.get(y));
        list.set(y, tmp);
    }
}
