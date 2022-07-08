package com.cn;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @Author: helisen
 * @Date 2022/6/20 14:00
 * @Description:
 */
public class Test68 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1 = br.readLine();
        int total = Integer.parseInt(s1);
        String s2 = br.readLine();
        int sort = Integer.parseInt(s2);
        String[] a = new String[210];
        for (int i = 0; i < total; i++) {
            String s = br.readLine();
            String[] arr = s.split(" ");
            int value = Integer.parseInt(arr[1]);
            if(a[value] != null) {
                a[value] = a[value] + "&" + arr[0];
            }else {
                a[value] = arr[0];
            }
        }
        if(sort == 1) {
            for (int i = 0; i < a.length; i++) {
                if(a[i] != null && a[i] != "" && a[i] != "null") {
                    String[] split = a[i].split("&");
                    for (int j = 0; j < split.length; j++) {
                        System.out.println(split[j] + " " + i);
                    }
                }
            }
        }else {
            for (int i = a.length - 1; i >= 0; i--) {
                if(a[i] != null && a[i] != "" && a[i] != "null") {
                    String[] split = a[i].split("&");
                    for (int j = 0; j < split.length; j++) {
                        System.out.println(split[j] + " " + i);
                    }
                }
            }
        }
    }


}
