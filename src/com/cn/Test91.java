package com.cn;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: helisen
 * @Date 2022/6/16 13:43
 * @Description:
 */
public class Test91 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] s1 = s.split(" ");
        Integer n = Integer.parseInt(s1[0] + 1);
        Integer m = Integer.parseInt(s1[1] + 1);
        System.out.println(a(n, m));


    }

    public static int a(int n, int m) {
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            arr[i][0] = 1;
        }
        for (int j = 0; j < m; j++) {
            arr[0][j] = 1;
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                arr[i][j] = arr[i - 1][j] + arr[i][j - 1];
            }
        }
        return arr[n - 1][m - 1];
    }
}
