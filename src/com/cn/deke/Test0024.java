package com.cn.deke;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Test0024 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int num = Integer.parseInt(s);
        String[] s1 = br.readLine().split(" ");
        String[] s2 = br.readLine().split(" ");
        int[][] arr = new int[num][3];
        for (int i = 0; i < num; i++) {
            arr[i][0] = i + 1;
            arr[i][1] = Integer.parseInt(s1[i]);
            arr[i][2] = Integer.parseInt(s2[i]);
        }

        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1] > o2[1]) {
                    return 1;
                }else if(o1[1] < o2[1]) {
                    return -1;
                }
                if(o1[2] > o2[2]) {
                    return 1;
                }else if(o1[2] < o2[2]) {
                    return -1;
                }
                return 0;
            }
        });

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i][0]).append(" ");
        }
        System.out.println(sb);

    }




}
