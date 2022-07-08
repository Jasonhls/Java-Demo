package com.cn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author: helisen
 * @Date 2022/6/2 15:09
 * @Description:
 */
public class Test104 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[] arr = new int[num];
        String s = br.readLine();
        String[] s1 = s.split(" ");
        for (int i = 0; i < num; i++) {
            arr[i] = Integer.parseInt(s1[i]);
        }
        int maxNumber = 1;
        for (int i = 0; i < num; i++) {
            int max = arr[i];
//            int front = arr[i];
            int[] a = new int[num];
            a[0] = max;
            int maxNum = 1;
            for (int j = i + 1; j < num; j++) {
                int ii = maxNum - 2 >= 0 ? maxNum - 2 : 0;
                if(arr[j] > a[ii] && arr[j] < max) {
                    max = arr[j];
                    a[maxNum - 1] = arr[j];
                    continue;
                }
                if(arr[j] > max) {
                    a[maxNum] = arr[j];
                    maxNum++;
                    max = arr[j];
                }
            }
            if(maxNum > maxNumber) {
                maxNumber = maxNum;
            }
        }
        System.out.println(maxNumber);
    }
}
