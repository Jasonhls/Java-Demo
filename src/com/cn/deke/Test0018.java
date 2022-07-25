package com.cn.deke;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Test0018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] s1 = s.split(" ");
        int num = s1.length;
        Integer[] arr = new Integer[num];
        int[] res = new int[num];
        int totalNum = 0;
        for (int i = 0; i < num; i++) {
           arr[i] = Integer.parseInt(s1[i]);
           if(arr[i] != 0) {
               totalNum = totalNum + arr[i];
           }
        }
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1 > o2) {
                    return -1;
                }else if(o1 < o2) {
                    return 1;
                }
                return 0;
            }
        });



        int b = 1;

        while(true) {
            boolean flag = false;

            if(b % 7 == 0) {
                flag = true;
            }else {
                int c = b;
                while(true) {
                    if(c % 10 == 7) {
                        break;
                    }
                    c = c / 10;
                    if(c == 7) {
                        break;
                    }
                    if(c < 1) {
                        break;
                    }
                }
                if(c == 7 || c % 10 == 7) {
                    flag = true;
                }
            }
            if(flag) {
                int index;
                if(b % num == 0) {
                    index = res.length - 1;
                }else {
                    index = b % num - 1;
                }
                res[index]++;
                totalNum--;
                if(totalNum == 0) {
                    break;
                }

            }
            b++;
        }


        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num; i++) {
            sb.append(res[i]).append(" ");
        }
        System.out.println(sb);
    }
}
