package com.cn.deke;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test0072 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int num = Integer.parseInt(s);
        String[] s1 = br.readLine().split(" ");
        List<Integer> list = Arrays.asList(s1).stream().map(Integer::parseInt).collect(Collectors.toList());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            int pos = 0;
            for (int j = i; j < list.size(); j++) {
                if(list.get(j) > list.get(i)) {
                    pos = j;
                    break;
                }
            }
            sb.append(pos).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}
