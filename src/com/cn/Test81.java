package com.cn;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * @Author: helisen
 * @Date 2022/6/27 12:24
 * @Description:
 */
public class Test81 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1 = br.readLine();
        String s2 = br.readLine();
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        boolean b = false;
        for (int i = 0; i < arr1.length; i++) {
            char c = arr1[i];
            for (int j = 0; j < arr2.length; j++) {
                char c1 = arr2[j];
                if(c == c1) {
                    b = true;
                    break;
                }else {
                    b = false;
                }
            }
            if(!b) {
                break;
            }
        }
        System.out.println(b);
    }
}
