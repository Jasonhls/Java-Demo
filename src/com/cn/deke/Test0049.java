package com.cn.deke;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test0049 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] split = s.split(",");
        int value = Integer.parseInt(br.readLine());
        List<Integer> list = Arrays.asList(split).stream()
                .map(Integer::parseInt)
                .sorted(Integer::compareTo)
                .collect(Collectors.toList());
        int sum = 0;
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if(sum + list.get(i) < value) {
                sum += list.get(i);
                count++;
            }else {
                break;
            }
        }
        System.out.println(count);
    }
}
