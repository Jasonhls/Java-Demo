package com.cn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author: helisen
 * @Date 2022/6/2 15:09
 * @Description:
 */
public class Test43 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] s1 = s.split(" ");
        Integer n = Integer.parseInt(s1[0]);
        int m = Integer.parseInt(s1[1]);
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            String s2 = br.readLine();
            String[] strArr = s2.split(" ");
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(strArr[j]);
            }
        }
        int i = 0;
        int j = 0;

        while(i < n) {
            while(j < m) {
                if(arr[i][j] != 0) {
                    j = 0;
                    break;
                }
                System.out.println(i + "="+ j);
                j++;
            }
            if(j == m) {
                j = m - 1;
            }
            i++;
        }
    }
}
