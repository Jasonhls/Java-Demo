package com.cn;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/**
 * @Author: helisen
 * @Date 2022/6/14 15:40
 * @Description:
 */
public class Test101 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        Integer num = Integer.parseInt(s);
        String s1 = br.readLine();
        String[] s2 = s1.split(" ");
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = Integer.parseInt(s2[i]);
        }
        String s3 = br.readLine();
        int sort = Integer.parseInt(s3);
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        if(sort == 0) {
            for (int i = 0; i < num; i++) {
                sb.append(arr[i]).append(" ");
            }
        }else {
            for (int i = num - 1; i >= 0; i--) {
                sb.append(arr[i]).append(" ");
            }
        }
        System.out.println(sb);
    }
}
