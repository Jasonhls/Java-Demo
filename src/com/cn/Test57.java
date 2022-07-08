package com.cn;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @Author: helisen
 * @Date 2022/6/24 20:06
 * @Description:
 */
public class Test57 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1 = br.readLine();
        String s2 = br.readLine();
        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();
        int num = chars1.length > chars2.length ? chars1.length : chars2.length;
        int[] arr = new int[num + 1];
        int middle = 0;
        for (int i = num - 1; i >= 0; i--) {
            int a = 0;
            int b = 0;
            if(chars1.length < num) {
                if(num - i <= chars1.length) {
                    a = chars1[chars1.length - num + i] - 48;
                }
            }else {
                a = chars1[i] - 48;
            }
            if(chars2.length < num) {
                if(num - i <= chars2.length) {
                    b = chars2[chars2.length - num + i] - 48;
                }
            }else {
                b = chars2[i] - 48;
            }
            int value;
            int c;
            if(middle > 0) {
                c = a + b + middle;
                middle = 0;
            }else {
                c = a + b;
            }
            if(c >= 10) {
                middle = 1;
                value = c - 10;
            }else {
                value = c;
            }
            arr[i + 1] = value;
        }
        arr[0] = middle;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if(i == 0 ) {
                if(arr[i] != 0) {
                    sb.append(arr[i]);
                }
            }else {
                sb.append(arr[i]);
            }
        }
        System.out.println(sb);
    }
}
