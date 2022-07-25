package com.cn.deke;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Test009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        char[] arr1 = s.toCharArray();
        char[] arr2 = br.readLine().toCharArray();
        Arrays.sort(arr2);
        StringBuilder sb = new StringBuilder();
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                char a = arr2[i];
                char b = arr1[j];
                if(a == b && !set.contains(a)) {
                    sb.append(a);
                    set.add(a);
                }
            }
        }
        System.out.println(sb);
    }






}
