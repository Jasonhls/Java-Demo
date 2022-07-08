package com.cn;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @Author: helisen
 * @Date 2022/6/27 12:24
 * @Description:
 */
public class Test71 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        char[] chars = s.toCharArray();
        String goalStr = br.readLine();
        char[] goalArr = goalStr.toCharArray();
        boolean b = false;
        boolean continueFlag = false;
        char continueNext = 0;
        int k = 0;
        int size = chars.length >= goalArr.length ? chars.length : goalArr.length;
        for (int i = 0; i < size; i++) {
            if(i >= chars.length && !continueFlag) {
                b = true;
                break;
            }
            char c = chars[i];
            if(k >= goalArr.length) {
                b = true;
                break;
            }
            char cc = goalArr[k];
            if(!continueFlag) {
                k++;
            }
            if(c != '?' && c != '*') {

                //如果相等
                if(c == cc || (c + 32 == cc) || (c == cc + 32)) {
                    if(continueFlag) {
                        continueFlag = false;
                    }
                    continue;
                }else if(c != cc) {
                    if(continueFlag && get(cc)) {
                        continue;
                    }
                    b = true;
                    break;
                }
            }
            if(c == '?') {
                continue;
            }
            if(c == '*') {
                continueFlag = true;
            }
        }


        if(b) {
            System.out.println(false);
        }else {
            System.out.println(true);
        }

    }

    public static boolean get(char c) {
        return c >= 'A' && c <= 'Z' || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9');
    }
}
