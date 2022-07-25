package com.cn.deke;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test008 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] arr = s.split(",");
        int total = Integer.parseInt(br.readLine());
        int min = total;
        int minTotal = total;
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    int a = Integer.parseInt(arr[i]);
                    int b = Integer.parseInt(arr[j]);
                    int c = Integer.parseInt(arr[k]);
                    int m = Math.abs(a + b + c - total);
                    if(m < min) {
                        min = m;
                        minTotal = a + b + c;
                    }
                }
            }
        }
        if(min == total) {
            System.out.println("-1");
        }else {
            System.out.println(minTotal);
        }

    }






}
