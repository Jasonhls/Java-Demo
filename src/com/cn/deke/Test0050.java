package com.cn.deke;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test0050 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int n = Integer.parseInt(s);
        int count = 0;
        while(n > 1) {
            if(n % 2 != 0) {
                n = n + 1;
            }else {
                n = n / 2;
            }
            count++;
        }
        System.out.println(count);
    }
}
