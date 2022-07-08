package com.cn;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: helisen
 * @Date 2022/5/30 13:36
 * @Description:
 */
public class Test38 {
    /*public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int num = Integer.parseInt(s);
        System.out.println(get(num));
        int h = 1 /(2 ^ (num - 1));
        System.out.println(h);

    }*/

    public static int get(int num) {
        if(num == 1) {
            return 1;
        }
        int i = get(num - 1);
        int m = 1;
        while(num - 1 > 0) {
            m = m * 2;
            num--;
        }
        return i + 1 / m * 2;
    }

    public static void main(String[] args) {
        System.out.println(get(5));
    }

}