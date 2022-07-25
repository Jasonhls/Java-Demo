package com.cn.deke;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test0084 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] split = s.split(",");
        StringBuilder sb = new StringBuilder();
        Arrays.stream(split).sorted(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                char[] arr1 = s1.toCharArray();
                char[] arr2 = s2.toCharArray();
                if(arr1.length == arr2.length) {
                    //一个个的字符比较，s1在前就是升序，这里要取大的就倒叙，s2在前
                    return s2.compareTo(s1);
                }
                int num = Math.min(arr1.length, arr2.length);
                for (int i = 0; i < num; i++) {
                    char a = arr1[i];
                    char b = arr2[i];
                    if(a != b) {
                        return b - a;
                    }
                }

                if(arr1.length > arr2.length) {
                    return arr2[0] - arr1[num];
                }else {
                    return arr1[0] - arr2[num];
                }
            }
        }).forEach(s1 -> sb.append(s1));
        System.out.println(sb);
    }
}
