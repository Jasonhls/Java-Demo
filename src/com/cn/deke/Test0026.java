package com.cn.deke;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Test0026 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int num = Integer.parseInt(s);
        String[] s1 = br.readLine().split(" ");
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < s1.length; i++) {
            int a = Integer.parseInt(s1[i]);
            list.add(a);
        }
        if(list.contains(1)) {
            System.out.println(1);
            return;
        }
        list.sort(Integer::compareTo);

        for (int i = 0; i < list.size(); i++) {
            Integer aa = list.get(i);
            for (int j = i + 1;j < list.size();) {
                if(list.get(j) % aa == 0) {
                    list.remove(j);
                }else {
                    j++;
                }
            }

        }

        System.out.println(list.size());

    }




}
