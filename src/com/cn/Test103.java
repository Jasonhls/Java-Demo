package com.cn;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/**
 * @Author: helisen
 * @Date 2022/6/14 15:40
 * @Description:
 */
public class Test103 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int num = Integer.parseInt(s);
        String s1 = br.readLine();
        String[] arr = s1.split(" ");

        int max = 0;
        for (int i = 0; i < num; i++) {
            int maxNum = 1;
            int origin = Integer.parseInt(arr[i]);
            for (int k = i + 1; k < num; k++) {
                int perStart = Integer.parseInt(arr[i]);
                int n = 1;
                int kk = Integer.parseInt(arr[k]);
                //如果是第一次，或者kk的值比前面大于origin的值小
                if(kk > origin) {
                    int last = origin;
                    for (int j = k; j < num; j++) {
                        int a = Integer.parseInt(arr[j]);
                        if(a > origin) {
                            if(last == origin) {
                                n++;
                                last = a;
                                continue;
                            }
                            if(a < last) {
                                last = a;
                                continue;
                            }else {
                                n++;
                                last = a;
                            }
                        }
                    }
                    //取最大的次数
                    if(n > maxNum) {
                        maxNum = n;
                    }
                }
            }
            //取最大的次数
            if(maxNum > max) {
                max = maxNum;
            }
        }
        System.out.println(max);
    }
}
