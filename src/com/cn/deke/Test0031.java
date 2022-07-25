package com.cn.deke;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Test0031 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int num = Integer.parseInt(s);
        System.out.println(num + "=" + num);
        List<String> res = new ArrayList<>();
        for (int i = 1; i < num; i++) {
            int sum = 0;
            StringBuilder sb = new StringBuilder();
            for (int j = i; j < num; j++) {
                sum += j;
                sb.append(j).append("+");
                if(sum == num) {
                    res.add(num + "=" + sb.substring(0, sb.length() - 1));
                }
                if(sum > num) {
                    break;
                }
            }
        }
        res.sort(Comparator.comparingInt(String::length));
        res.forEach(a -> System.out.println(a));

        System.out.println("Result:" + res.size() + 1);
    }
}
