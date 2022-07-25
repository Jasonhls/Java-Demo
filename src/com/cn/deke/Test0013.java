package com.cn.deke;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Test0013 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] arr = s.split(",");
        int minHigh = Integer.parseInt(arr[0]);
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            int high = Integer.parseInt(arr[i]);
            if(high < minHigh) {
                minHigh = high;
            }
            int temp = i * minHigh;
            if(max < temp) {
                max = temp;
            }
        }
        System.out.println(max);
    }
}
