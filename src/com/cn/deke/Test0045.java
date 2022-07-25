package com.cn.deke;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Test0045 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int num = Integer.parseInt(s);
        String[] s1 = br.readLine().split(" ");
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            list.add(Integer.parseInt(s1[i]));
        }
        list.sort(Integer::compareTo);

        String res = "0";
        for (int i = list.size() - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                for (int k = 0; k < i; k++) {
                    Integer a = list.get(i);
                    Integer b = list.get(j);
                    Integer c = list.get(k);
                    if(b != c && a == b + 2 * c) {
                        res = a + " " + b + " " + c;
                    }
                }
            }
        }
        System.out.println(res);
    }
}
