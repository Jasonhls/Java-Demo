package com.cn.deke;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test0070 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int num = Integer.parseInt(s);
        int m = Integer.parseInt(br.readLine());

        if(num < 3 || num > 7) {
            System.out.println(-1);
            return;
        }

        int end = 1;
        int t = num;
        while(t > 0) {
            end = end * 10;
            t--;
        }
        int start = end / 10;
        List<Integer> res = new ArrayList<>();
        for (int i = start; i < end; i++) {
            int total = 0;
            int tmp = i;
            int divide = start;
            for (int j = 1; j < num; j++) {
                int a = tmp / divide;
                total = total + get(num, a);
                tmp = tmp - a * divide;
                if(tmp < 10) {
                    break;
                }
                divide = divide / 10;
            }
            total = total + get(num, tmp);
            if(total == i) {
                res.add(i);
            }
        }
        if(m + 1 > res.size()) {
            System.out.println(m * res.get(res.size() - 1));
        }else {
            System.out.println(res.get(m));

        }
    }

    public static int get(int num, int a) {
        int total = 1;
        while(true) {
            if(num <= 0) {
                break;
            }
            total = total * a;
            num--;
        }
        return total;
    }
}
