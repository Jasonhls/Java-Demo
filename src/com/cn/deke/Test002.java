package com.cn.deke;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Test002 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] arr1 = s.split(" ");
        String s2 = br.readLine();
        String[] arr2 = s2.split(" ");
        int num = Integer.parseInt(br.readLine());

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                int a = Integer.parseInt(arr1[i]) + Integer.parseInt(arr2[j]);
                list.add(a);
            }
        }
        list.sort(Integer::compareTo);
        int res = 0;
        for (int i = 0; i < num; i++) {
            res = res + list.get(i);
        }
        System.out.println(res);

    }


}
