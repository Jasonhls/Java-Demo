package com.cn.deke;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test0077 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] split = s.split(",");
        int value = Integer.parseInt(br.readLine());
        List<Integer> list = Arrays.asList(split).stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int max = -1;
        for (int i = 0; i < list.size() - 2; i++) {
            for (int j = i + 1; j < list.size() - 1; j++) {
                for (int k = j + 1; k < list.size(); k++) {
                    int sum = list.get(i) + list.get(j) + list.get(k);
                    if(sum <= value &&  sum > max) {
                        max = sum;
                    }
                }
            }
        }
        System.out.println(max);
    }
}
