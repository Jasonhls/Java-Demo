package com.cn;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/**
 * @Author: helisen
 * @Date 2022/6/27 12:24
 * @Description:
 */
public class Test80 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1 = br.readLine();
        String s2 = br.readLine();
        String s3 = br.readLine();
        String s4 = br.readLine();
        int num1 = Integer.parseInt(s1);
        String[] arr1 = s2.split(" ");
        int num2 = Integer.parseInt(s3);
        String[] arr2 = s4.split(" ");
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int i = 0; i < num1; i++) {
            int a = Integer.parseInt(arr1[i]);
            treeSet.add(a);
        }
        for (int i = 0; i < num2; i++) {
            int a = Integer.parseInt(arr2[i]);
            treeSet.add(a);
        }
        StringBuilder sb = new StringBuilder();
        Iterator<Integer> iterator = treeSet.iterator();
        while(iterator.hasNext()) {
            sb.append(iterator.next());
        }
        System.out.println(sb);
    }
}
