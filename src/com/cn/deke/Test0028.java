package com.cn.deke;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Test0028 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int num = Integer.parseInt(s);
        String[] s1 = br.readLine().split(" ");
        TreeSet treeSet = new TreeSet();
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < num; i++) {
            treeSet.add(Integer.parseInt(s1[i]));
        }
        int total = -1;
        if(2 * n < treeSet.size()) {
            List<Integer> list = new ArrayList<>(treeSet);
            for (int i = 0; i < list.size(); i++) {
                if(i < n || i >= list.size() - n) {
                    total = total + list.get(i);
                }
            }
            total++;
        }
        System.out.println(total);
    }
}
