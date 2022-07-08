package com.cn;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @Author: helisen
 * @Date 2022/6/20 14:00
 * @Description:
 */
public class Test69 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1 = br.readLine();
        String s2 = br.readLine();
        String s3 = br.readLine();
        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);
        int c = Integer.parseInt(s3);
        int[][] aa = new int[a][b];
        int[][] bb = new int[b][c];
        int[][] res = new int[a][c];
        for (int i = 0; i < a; i++) {
            String s = br.readLine();
            String[] arr = s.split(" ");
            for (int j = 0; j < arr.length; j++) {
                aa[i][j] = Integer.parseInt(arr[j]);
            }
        }
        for (int i = 0; i < b; i++) {
            String s = br.readLine();
            String[] arr = s.split(" ");
            for (int j = 0; j < arr.length; j++) {
                bb[i][j] = Integer.parseInt(arr[j]);
            }
        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < c; j++) {
                int m = 0;
                for (int k = 0; k < b; k++) {
                    m = m + aa[i][k] * bb[k][j];
                }
                res[i][j] = m;
            }
        }
        for (int i = 0; i < a; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < c; j++) {
                sb.append(res[i][j]).append(" ");
            }
            System.out.println(sb);
        }
    }


}
